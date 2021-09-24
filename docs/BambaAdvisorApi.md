# BambaAdvisorApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AdvisorMessagePost**](BambaAdvisorApi.md#v1AdvisorMessagePost) | **POST** /v1/advisor/message | Send messages to the Bamba Advisor


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

val apiInstance = BambaAdvisorApi()
val advisorMessageRequest : AdvisorMessageRequest =  // AdvisorMessageRequest | 
try {
    val result : InlineResponse2001 = apiInstance.v1AdvisorMessagePost(advisorMessageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BambaAdvisorApi#v1AdvisorMessagePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BambaAdvisorApi#v1AdvisorMessagePost")
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

