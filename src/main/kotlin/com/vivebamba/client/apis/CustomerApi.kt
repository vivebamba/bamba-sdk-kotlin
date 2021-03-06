/**
 * Bamba API
 *
 * SDK for Bamba API
 *
 * The version of the OpenAPI document: 1.3.5
 * Contact: desarrollo@vivebamba.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.vivebamba.client.apis

import com.vivebamba.client.models.CancellationResponse
import com.vivebamba.client.models.CustomerServices
import com.vivebamba.client.models.ErrorResponse
import com.vivebamba.client.models.InlineResponse4221

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

class CustomerApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.vivebamba.client.baseUrl", "https://sandbox.api.vivebamba.com/v1")
        }
    }

    /**
    * Get customer services
    * Get all customer services
    * @param customerId Bamba customer unique identifier 
    * @return kotlin.collections.List<CustomerServices>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun customerCustomerIdServicesGet(customerId: kotlin.String) : kotlin.collections.List<CustomerServices> {
        val localVariableConfig = customerCustomerIdServicesGetRequestConfig(customerId = customerId)

        val localVarResponse = request<Unit, kotlin.collections.List<CustomerServices>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<CustomerServices>
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
    * To obtain the request config of the operation customerCustomerIdServicesGet
    *
    * @param customerId Bamba customer unique identifier 
    * @return RequestConfig
    */
    fun customerCustomerIdServicesGetRequestConfig(customerId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/customer/{customerId}/services".replace("{"+"customerId"+"}", "$customerId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Cancel customer services
    * Cancel customer services
    * @param customerId The customer UUID assigned by Bamba 
    * @param serviceId The service UUID to cancel assigned by Bamba 
    * @return CancellationResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun customerCustomerIdServicesServiceIdCancelPut(customerId: kotlin.String, serviceId: kotlin.String) : CancellationResponse {
        val localVariableConfig = customerCustomerIdServicesServiceIdCancelPutRequestConfig(customerId = customerId, serviceId = serviceId)

        val localVarResponse = request<Unit, CancellationResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CancellationResponse
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
    * To obtain the request config of the operation customerCustomerIdServicesServiceIdCancelPut
    *
    * @param customerId The customer UUID assigned by Bamba 
    * @param serviceId The service UUID to cancel assigned by Bamba 
    * @return RequestConfig
    */
    fun customerCustomerIdServicesServiceIdCancelPutRequestConfig(customerId: kotlin.String, serviceId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/customer/{customerId}/services/{serviceId}/cancel".replace("{"+"customerId"+"}", "$customerId").replace("{"+"serviceId"+"}", "$serviceId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
