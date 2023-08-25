# Ubisoft Rainbow Six Siege API

A Java API to handle authorization and requests regarding the Rainbow Six Siege API. Providing a clean and easy way to use the Rainbow Six Siege API.


## Badges

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)


## Authors

- [@MBamb](https://github.com/MBamb)

## Features

- Season stats (Ranked 1.0 and 2.0)
- Overall stats
- Operator stats
- Map stats
- Bombsite stats

## Quickstart

To set up a `UbisoftRainbowSixApi` instance you have to create a `UbisoftRainbowSixApiConfig`

```java
 final var config = new UbisoftRainbowSixApiConfig()
    	.setUbiAppId("---") //<--- Your UbiAppId for requests after Ranked 2.0
    	.setUbiAppIdOld("---") //<--- Your UbiAppId for requests before Ranked 2.0
    	.setAuthorizationToken("---") //<--- Your authorization token
    	.setRetriesOnError(0);
```

Create your `UbisoftRainbowSixApi` instance and set your `UbisoftRainbowSixApiConfig`

```java
final var api = new UbisoftRainbowSixApi()
	.setConfig(ubiApiConfig);
```
You can now use the api to request a `UbisoftTicket` which you need for requesting data

```java
final var oldTicket = api.getOldUbisoftTicket(); //<---Ticket for requests before Ranked 2.0
final var newTicket = api.getUbisoftTicket(); //<--- Ticket for requests after Ranked 2.0
```
