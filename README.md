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
*BambaAdvisorApi* | [**v1AdvisorMessagePost**](docs/BambaAdvisorApi.md#v1advisormessagepost) | **POST** /v1/advisor/message | Send messages to the Bamba Advisor
*CustomerApi* | [**v1CustomerCustomerIdServicesGet**](docs/CustomerApi.md#v1customercustomeridservicesget) | **GET** /v1/customer/{customerId}/services | Get customer services
*CustomerApi* | [**v1CustomerCustomerIdServicesSkuCancelPut**](docs/CustomerApi.md#v1customercustomeridservicesskucancelput) | **PUT** /v1/customer/{customerId}/services/{sku}/cancel | Cancel customer services
*StoreApi* | [**v1StoreOrdersPost**](docs/StoreApi.md#v1storeorderspost) | **POST** /v1/store/orders | Place an order
*StoreApi* | [**v1StoreProductsGet**](docs/StoreApi.md#v1storeproductsget) | **GET** /v1/store/products | Get products
*V1Api* | [**v1AdvisorMessagePost**](docs/V1Api.md#v1advisormessagepost) | **POST** /v1/advisor/message | Send messages to the Bamba Advisor
*V1Api* | [**v1CustomerCustomerIdServicesGet**](docs/V1Api.md#v1customercustomeridservicesget) | **GET** /v1/customer/{customerId}/services | Get customer services
*V1Api* | [**v1CustomerCustomerIdServicesSkuCancelPut**](docs/V1Api.md#v1customercustomeridservicesskucancelput) | **PUT** /v1/customer/{customerId}/services/{sku}/cancel | Cancel customer services
*V1Api* | [**v1StoreOrdersPost**](docs/V1Api.md#v1storeorderspost) | **POST** /v1/store/orders | Place an order
*V1Api* | [**v1StoreProductsGet**](docs/V1Api.md#v1storeproductsget) | **GET** /v1/store/products | Get products


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.vivebamba.client.models.AdvisorMessageRequest](docs/AdvisorMessageRequest.md)
 - [com.vivebamba.client.models.AdvisorUser](docs/AdvisorUser.md)
 - [com.vivebamba.client.models.Customer](docs/Customer.md)
 - [com.vivebamba.client.models.ErrorResponse](docs/ErrorResponse.md)
 - [com.vivebamba.client.models.InlineResponse200](docs/InlineResponse200.md)
 - [com.vivebamba.client.models.InlineResponse2001](docs/InlineResponse2001.md)
 - [com.vivebamba.client.models.InlineResponse422](docs/InlineResponse422.md)
 - [com.vivebamba.client.models.InlineResponse4221](docs/InlineResponse4221.md)
 - [com.vivebamba.client.models.InlineResponse422Errors](docs/InlineResponse422Errors.md)
 - [com.vivebamba.client.models.Message](docs/Message.md)
 - [com.vivebamba.client.models.Order](docs/Order.md)
 - [com.vivebamba.client.models.OrderProducts](docs/OrderProducts.md)
 - [com.vivebamba.client.models.PaymentParams](docs/PaymentParams.md)
 - [com.vivebamba.client.models.Product](docs/Product.md)
 - [com.vivebamba.client.models.SectionWhatIncludes](docs/SectionWhatIncludes.md)
 - [com.vivebamba.client.models.SectionWhatNotIncludes](docs/SectionWhatNotIncludes.md)
 - [com.vivebamba.client.models.Service](docs/Service.md)
 - [com.vivebamba.client.models.Subscription](docs/Subscription.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header

