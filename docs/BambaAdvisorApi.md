# BambaAdvisorApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advisorMessagePost**](BambaAdvisorApi.md#advisorMessagePost) | **POST** /advisor/message | Send messages to the Bamba Advisor


<a name="advisorMessagePost"></a>
# **advisorMessagePost**
> InlineResponse2001 advisorMessagePost(advisorMessageRequest)

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
    val result : InlineResponse2001 = apiInstance.advisorMessagePost(advisorMessageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BambaAdvisorApi#advisorMessagePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BambaAdvisorApi#advisorMessagePost")
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

