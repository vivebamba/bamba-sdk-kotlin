# CustomerApi

All URIs are relative to *https://sandbox.api.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCustomerIdServicesGet**](CustomerApi.md#customerCustomerIdServicesGet) | **GET** /customer/{customerId}/services | Get customer services
[**customerCustomerIdServicesServiceIdCancelPut**](CustomerApi.md#customerCustomerIdServicesServiceIdCancelPut) | **PUT** /customer/{customerId}/services/{serviceId}/cancel | Cancel customer services


<a name="customerCustomerIdServicesGet"></a>
# **customerCustomerIdServicesGet**
> kotlin.collections.List&lt;CustomerServices&gt; customerCustomerIdServicesGet(customerId)

Get customer services

Get all customer services

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = CustomerApi()
val customerId : kotlin.String = d625aefa-73ba-4458-a107-5b3eea9f112b // kotlin.String | Bamba customer unique identifier
try {
    val result : kotlin.collections.List<CustomerServices> = apiInstance.customerCustomerIdServicesGet(customerId)
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
 **customerId** | **kotlin.String**| Bamba customer unique identifier |

### Return type

[**kotlin.collections.List&lt;CustomerServices&gt;**](CustomerServices.md)

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
val customerId : kotlin.String = d625aefa-73ba-4458-a107-5b3eea9f112b // kotlin.String | The customer UUID assigned by Bamba
val serviceId : kotlin.String = z625aefa-73ba-4458-a107-5b3eea9526a // kotlin.String | The service UUID to cancel assigned by Bamba
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
 **customerId** | **kotlin.String**| The customer UUID assigned by Bamba |
 **serviceId** | **kotlin.String**| The service UUID to cancel assigned by Bamba |

### Return type

[**CancellationResponse**](CancellationResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

