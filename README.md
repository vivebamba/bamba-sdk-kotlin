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
*CustomerApi* | [**customerCustomerIdServicesGet**](docs/CustomerApi.md#customercustomeridservicesget) | **GET** /customer/{customerId}/services | Get customer services
*CustomerApi* | [**customerCustomerIdServicesSkuCancelPut**](docs/CustomerApi.md#customercustomeridservicesskucancelput) | **PUT** /customer/{customerId}/services/{sku}/cancel | Cancel customer services
*StoreApi* | [**storeOrdersPost**](docs/StoreApi.md#storeorderspost) | **POST** /store/orders | Place an order
*StoreApi* | [**storeProductsGet**](docs/StoreApi.md#storeproductsget) | **GET** /store/products | Get products


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
 - [com.vivebamba.client.models.PaymentParams](docs/PaymentParams.md)
 - [com.vivebamba.client.models.Product](docs/Product.md)
 - [com.vivebamba.client.models.ProductBundleItems](docs/ProductBundleItems.md)
 - [com.vivebamba.client.models.Service](docs/Service.md)
 - [com.vivebamba.client.models.Subscription](docs/Subscription.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header

