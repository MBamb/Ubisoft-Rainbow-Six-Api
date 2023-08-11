package de.vault.service;

import de.vault.models.UbisoftTicket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UbiRainbowSixApi {
    private static final String UBISOFT_PUBLIC_SERVICES_URL = "https://public-ubiservices.ubi.com/";

    private UbiRainbowSixApiConfig config = new UbiRainbowSixApiConfig();

    private final HttpClient httpClient = HttpClient.newHttpClient();

    private UbisoftTicket getOldUbisoftTicket() {
        return getUbisoftTicket(true);
    }

    private UbisoftTicket getUbisoftTicket() {
        return getUbisoftTicket(false);
    }

    private UbisoftTicket getUbisoftTicket(boolean old) {
        final var response = sendRequest(
                "POST",
                UBISOFT_PUBLIC_SERVICES_URL + "v3/profiles/sessions",
                Map.of("Content-Type", "application/json",
                        "ubi-appid", old ? config.getUbiAppIdOld() : config.getUbiAppId(),
                        "Authorization", "Basic " + config.getAuthorizationToken()),
                " "
        );

        return new UbisoftTicketParser().toTicket(response);
    }

    private String sendRequest(String method, String url, Map<String, String> headers) {
        return sendRequest(method, url, headers, null);
    }

    private String sendRequest(String method, String url, Map<String, String> headers, String body) {
        var tries = 0;
        Exception exception = null;

        while (tries <= config.getRetriesOnError()) {
            try {
                final var requestBuilder = HttpRequest
                        .newBuilder()
                        .uri(new URI(url.stripTrailing()))
                        .method(
                                method,
                                body == null
                                        ? HttpRequest.BodyPublishers.noBody()
                                        : HttpRequest.BodyPublishers.ofString(body)
                        );

                headers.forEach(requestBuilder::setHeader);

                final var request = requestBuilder.build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() < 200 || response.statusCode() > 299) {
                    throw new RuntimeException("Request failed with code " + response.statusCode() + " and body " + response.body());
                }

                return response.body();
            } catch (Exception e) {
                tries++;
                exception = e;
            }
        }

        throw new RuntimeException("Error while sendingRequest: '" + method + ": " + url + "'", exception);
    }
}
