# CustomerApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCustomerIdServicesGet**](CustomerApi.md#customerCustomerIdServicesGet) | **GET** /customer/{customerId}/services | Get customer services
[**customerCustomerIdServicesServiceIdCancelPut**](CustomerApi.md#customerCustomerIdServicesServiceIdCancelPut) | **PUT** /customer/{customerId}/services/{serviceId}/cancel | Cancel customer services


<a name="customerCustomerIdServicesGet"></a>
# **customerCustomerIdServicesGet**
> kotlin.collections.List&lt;kotlin.Any&gt; customerCustomerIdServicesGet(customerId)

Get customer services

Get all customer services

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = CustomerApi()
val customerId : java.util.UUID = d625aefa-73ba-4458-a107-5b3eea9f112b // java.util.UUID | Bamba customer unique identifier
try {
    val result : kotlin.collections.List<kotlin.Any> = apiInstance.customerCustomerIdServicesGet(customerId)
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
 **customerId** | [**java.util.UUID**](.md)| Bamba customer unique identifier |

### Return type

[**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customerCustomerIdServicesServiceIdCancelPut"></a>
# **customerCustomerIdServicesServiceIdCancelPut**
> CancellationResponse customerCustomerIdServicesServiceIdCancelPut(customerId, serviceId)

Cancel customer services

Cancel customer services

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = CustomerApi()
val customerId : java.util.UUID = d625aefa-73ba-4458-a107-5b3eea9f112b // java.util.UUID | Bamba customer unique identifier
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Service Id
try {
    val result : CancellationResponse = apiInstance.customerCustomerIdServicesServiceIdCancelPut(customerId, serviceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerCustomerIdServicesServiceIdCancelPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerCustomerIdServicesServiceIdCancelPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | [**java.util.UUID**](.md)| Bamba customer unique identifier |
 **serviceId** | [**java.util.UUID**](.md)| Service Id |

### Return type

[**CancellationResponse**](CancellationResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

