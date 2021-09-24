# V1Api

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AdvisorMessagePost**](V1Api.md#v1AdvisorMessagePost) | **POST** /v1/advisor/message | Send messages to the Bamba Advisor
[**v1CustomerCustomerIdServicesGet**](V1Api.md#v1CustomerCustomerIdServicesGet) | **GET** /v1/customer/{customerId}/services | Get customer services
[**v1CustomerCustomerIdServicesSkuCancelPut**](V1Api.md#v1CustomerCustomerIdServicesSkuCancelPut) | **PUT** /v1/customer/{customerId}/services/{sku}/cancel | Cancel customer services
[**v1StoreOrdersPost**](V1Api.md#v1StoreOrdersPost) | **POST** /v1/store/orders | Place an order
[**v1StoreProductsGet**](V1Api.md#v1StoreProductsGet) | **GET** /v1/store/products | Get products


<a name="v1AdvisorMessagePost"></a>
# **v1AdvisorMessagePost**
> InlineResponse2001 v1AdvisorMessagePost(advisorMessageRequest)

Send messages to the Bamba Advisor

Send mesages to the Bamba Advisor from new or existing customers

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = V1Api()
val advisorMessageRequest : AdvisorMessageRequest =  // AdvisorMessageRequest | 
try {
    val result : InlineResponse2001 = apiInstance.v1AdvisorMessagePost(advisorMessageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling V1Api#v1AdvisorMessagePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1Api#v1AdvisorMessagePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advisorMessageRequest** | [**AdvisorMessageRequest**](AdvisorMessageRequest.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1CustomerCustomerIdServicesGet"></a>
# **v1CustomerCustomerIdServicesGet**
> Subscription v1CustomerCustomerIdServicesGet(customerId)

Get customer services

Get all customer services

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = V1Api()
val customerId : kotlin.Int = 56 // kotlin.Int | Bamba customer unique identifier
try {
    val result : Subscription = apiInstance.v1CustomerCustomerIdServicesGet(customerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling V1Api#v1CustomerCustomerIdServicesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1Api#v1CustomerCustomerIdServicesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **kotlin.Int**| Bamba customer unique identifier |

### Return type

[**Subscription**](Subscription.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1CustomerCustomerIdServicesSkuCancelPut"></a>
# **v1CustomerCustomerIdServicesSkuCancelPut**
> Subscription v1CustomerCustomerIdServicesSkuCancelPut(customerId, sku)

Cancel customer services

Cancel customer services

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = V1Api()
val customerId : kotlin.String = customerId_example // kotlin.String | Bamba customer unique identifier
val sku : kotlin.String = sku_example // kotlin.String | Service sku
try {
    val result : Subscription = apiInstance.v1CustomerCustomerIdServicesSkuCancelPut(customerId, sku)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling V1Api#v1CustomerCustomerIdServicesSkuCancelPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1Api#v1CustomerCustomerIdServicesSkuCancelPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **kotlin.String**| Bamba customer unique identifier |
 **sku** | **kotlin.String**| Service sku |

### Return type

[**Subscription**](Subscription.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1StoreOrdersPost"></a>
# **v1StoreOrdersPost**
> InlineResponse200 v1StoreOrdersPost(order)

Place an order

Place an order

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = V1Api()
val order : Order =  // Order | 
try {
    val result : InlineResponse200 = apiInstance.v1StoreOrdersPost(order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling V1Api#v1StoreOrdersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1Api#v1StoreOrdersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1StoreProductsGet"></a>
# **v1StoreProductsGet**
> kotlin.collections.List&lt;Product&gt; v1StoreProductsGet()

Get products

Retrieve all products

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = V1Api()
try {
    val result : kotlin.collections.List<Product> = apiInstance.v1StoreProductsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling V1Api#v1StoreProductsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1Api#v1StoreProductsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Product&gt;**](Product.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

