# CustomerApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCustomerIdServiceGet**](CustomerApi.md#customerCustomerIdServiceGet) | **GET** /customer/{customerId}/service | Get customer services


<a name="customerCustomerIdServiceGet"></a>
# **customerCustomerIdServiceGet**
> Service customerCustomerIdServiceGet(customerId)

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
    val result : Service = apiInstance.customerCustomerIdServiceGet(customerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerCustomerIdServiceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerCustomerIdServiceGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **kotlin.Int**| Bamba customer unique identifier |

### Return type

[**Service**](Service.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

