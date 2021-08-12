# CustomerApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCustomerIdServicesGet**](CustomerApi.md#customerCustomerIdServicesGet) | **GET** /customer/{customerId}/services | Get customer services
[**customerCustomerIdServicesSkuCancelPut**](CustomerApi.md#customerCustomerIdServicesSkuCancelPut) | **PUT** /customer/{customerId}/services/{sku}/cancel | Cancel customer services


<a name="customerCustomerIdServicesGet"></a>
# **customerCustomerIdServicesGet**
> Subscription customerCustomerIdServicesGet(customerId)

Get customer services

Get all customer services

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = CustomerApi()
val customerId : kotlin.Int = 56 // kotlin.Int | Bamba customer unique identifier
try {
    val result : Subscription = apiInstance.customerCustomerIdServicesGet(customerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerCustomerIdServicesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerCustomerIdServicesGet")
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

<a name="customerCustomerIdServicesSkuCancelPut"></a>
# **customerCustomerIdServicesSkuCancelPut**
> Subscription customerCustomerIdServicesSkuCancelPut(customerId, sku)

Cancel customer services

Cancel customer services

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = CustomerApi()
val customerId : kotlin.String = customerId_example // kotlin.String | Bamba customer unique identifier
val sku : kotlin.String = sku_example // kotlin.String | Service sku
try {
    val result : Subscription = apiInstance.customerCustomerIdServicesSkuCancelPut(customerId, sku)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerCustomerIdServicesSkuCancelPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerCustomerIdServicesSkuCancelPut")
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

