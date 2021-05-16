# com.vivebamba.client - Kotlin client library for Bamba API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BambaAdvisorApi* | [**advisorMessagePost**](docs/BambaAdvisorApi.md#advisormessagepost) | **POST** /advisor/message | Send messages to the Bamba Advisor
*StoreApi* | [**storeOrdersPost**](docs/StoreApi.md#storeorderspost) | **POST** /store/orders | Place an order
*StoreApi* | [**storeProductsGet**](docs/StoreApi.md#storeproductsget) | **GET** /store/products | Get products


### Bamba Advisor

The advisor Bamba follows the basic concept of communication:

Send a message: Sender sends a message to Bamba Advisor
Receive the response: Bamba Advisor sends the response to Issuer

You can send a message to the Bamba advisor using the advisorMessagePost method, then you need to listen for the response to your message, to achieve this it is necessary that you expose in your application a url (webhook) where the advisor can send you the responses to your messages.

This webhook should wait for notification via POST.

Once you have the url where you want to receive the responses from the Bamba advisor, send us the url by email to desarrollo@vivebamba.com so that we can register the webhook for your integration and you can receive the responses.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.vivebamba.client.models.AdvisorMessageRequest](docs/AdvisorMessageRequest.md)
 - [com.vivebamba.client.models.AdvisorUser](docs/AdvisorUser.md)
 - [com.vivebamba.client.models.Customer](docs/Customer.md)
 - [com.vivebamba.client.models.ErrorResponse](docs/ErrorResponse.md)
 - [com.vivebamba.client.models.InlineResponse200](docs/InlineResponse200.md)
 - [com.vivebamba.client.models.InlineResponse2001](docs/InlineResponse2001.md)
 - [com.vivebamba.client.models.Message](docs/Message.md)
 - [com.vivebamba.client.models.Order](docs/Order.md)
 - [com.vivebamba.client.models.OrderProducts](docs/OrderProducts.md)
 - [com.vivebamba.client.models.Product](docs/Product.md)
 - [com.vivebamba.client.models.ProductBundleItems](docs/ProductBundleItems.md)
 - [com.vivebamba.client.models.Service](docs/Service.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header

