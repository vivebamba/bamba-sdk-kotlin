# StoreApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storeOrdersPost**](StoreApi.md#storeOrdersPost) | **POST** /store/orders | Place an order
[**storeProductsGet**](StoreApi.md#storeProductsGet) | **GET** /store/products | Get products


<a name="storeOrdersPost"></a>
# **storeOrdersPost**
> InlineResponse200 storeOrdersPost(order)

Place an order

Place an order

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = StoreApi()
val order : Order =  // Order | 
try {
    val result : InlineResponse200 = apiInstance.storeOrdersPost(order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoreApi#storeOrdersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoreApi#storeOrdersPost")
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

<a name="storeProductsGet"></a>
# **storeProductsGet**
> kotlin.collections.List&lt;Product&gt; storeProductsGet()

Get products

Retrieve all products

### Example
```kotlin
// Import classes:
//import com.vivebamba.client.infrastructure.*
//import com.vivebamba.client.models.*

val apiInstance = StoreApi()
try {
    val result : kotlin.collections.List<Product> = apiInstance.storeProductsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoreApi#storeProductsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoreApi#storeProductsGet")
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

