# StoreApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1StoreOrdersPost**](StoreApi.md#v1StoreOrdersPost) | **POST** /v1/store/orders | Place an order
[**v1StoreProductsGet**](StoreApi.md#v1StoreProductsGet) | **GET** /v1/store/products | Get products


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

val apiInstance = StoreApi()
val order : Order =  // Order | 
try {
    val result : InlineResponse200 = apiInstance.v1StoreOrdersPost(order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoreApi#v1StoreOrdersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoreApi#v1StoreOrdersPost")
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

val apiInstance = StoreApi()
try {
    val result : kotlin.collections.List<Product> = apiInstance.v1StoreProductsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoreApi#v1StoreProductsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoreApi#v1StoreProductsGet")
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

