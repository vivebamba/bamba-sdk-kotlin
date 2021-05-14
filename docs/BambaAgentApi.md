# BambaAgentApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bambaAgentMessagePost**](BambaAgentApi.md#bambaAgentMessagePost) | **POST** /bamba-agent/message | Bamba agent


<a name="bambaAgentMessagePost"></a>
# **bambaAgentMessagePost**
> bambaAgentMessagePost(message)

Bamba agent

All related with Bamba Agent

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = BambaAgentApi()
val message : Message =  // Message | 
try {
    apiInstance.bambaAgentMessagePost(message)
} catch (e: ClientException) {
    println("4xx response calling BambaAgentApi#bambaAgentMessagePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BambaAgentApi#bambaAgentMessagePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**Message**](Message.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

