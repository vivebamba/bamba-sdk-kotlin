/**
* Bamba API
* SDK for Bamba API
*
* The version of the OpenAPI document: 1.3.0
* Contact: desarrollo@vivebamba.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.vivebamba.client.apis

import com.vivebamba.client.models.ErrorResponse
import com.vivebamba.client.models.InlineResponse200
import com.vivebamba.client.models.InlineResponse422
import com.vivebamba.client.models.Order
import com.vivebamba.client.models.Product

import com.vivebamba.client.infrastructure.ApiClient
import com.vivebamba.client.infrastructure.ClientException
import com.vivebamba.client.infrastructure.ClientError
import com.vivebamba.client.infrastructure.ServerException
import com.vivebamba.client.infrastructure.ServerError
import com.vivebamba.client.infrastructure.MultiValueMap
import com.vivebamba.client.infrastructure.RequestConfig
import com.vivebamba.client.infrastructure.RequestMethod
import com.vivebamba.client.infrastructure.ResponseType
import com.vivebamba.client.infrastructure.Success
import com.vivebamba.client.infrastructure.toMultiValue

class StoreApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.vivebamba.client.baseUrl", "https://sandbox.vivebamba.com/v1")
        }
    }

    /**
    * Place an order
    * Place an order
    * @param order  (optional)
    * @return InlineResponse200
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun storeOrdersPost(order: Order?) : InlineResponse200 {
        val localVariableConfig = storeOrdersPostRequestConfig(order = order)

        val localVarResponse = request<InlineResponse200>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InlineResponse200
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation storeOrdersPost
    *
    * @param order  (optional)
    * @return RequestConfig
    */
    fun storeOrdersPostRequestConfig(order: Order?) : RequestConfig {
        val localVariableBody: kotlin.Any? = order
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/store/orders",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get products
    * Retrieve all products
    * @return kotlin.collections.List<Product>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun storeProductsGet() : kotlin.collections.List<Product> {
        val localVariableConfig = storeProductsGetRequestConfig()

        val localVarResponse = request<kotlin.collections.List<Product>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<Product>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation storeProductsGet
    *
    * @return RequestConfig
    */
    fun storeProductsGetRequestConfig() : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/store/products",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
