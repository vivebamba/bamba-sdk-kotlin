/**
 * Bamba API
 *
 * SDK for Bamba API
 *
 * The version of the OpenAPI document: 1.3.4
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

import com.vivebamba.client.models.AdvisorMessageRequest
import com.vivebamba.client.models.ErrorResponse
import com.vivebamba.client.models.InlineResponse2001
import com.vivebamba.client.models.InlineResponse422

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

class BambaAdvisorApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.vivebamba.client.baseUrl", "https://sandbox.vivebamba.com/v1")
        }
    }

    /**
    * Send messages to the Bamba Advisor
    * Send mesages to the Bamba Advisor from new or existing customers
    * @param advisorMessageRequest  (optional)
    * @return InlineResponse2001
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun advisorMessagePost(advisorMessageRequest: AdvisorMessageRequest?) : InlineResponse2001 {
        val localVariableConfig = advisorMessagePostRequestConfig(advisorMessageRequest = advisorMessageRequest)

        val localVarResponse = request<AdvisorMessageRequest, InlineResponse2001>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InlineResponse2001
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
    * To obtain the request config of the operation advisorMessagePost
    *
    * @param advisorMessageRequest  (optional)
    * @return RequestConfig
    */
    fun advisorMessagePostRequestConfig(advisorMessageRequest: AdvisorMessageRequest?) : RequestConfig<AdvisorMessageRequest> {
        val localVariableBody = advisorMessageRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/advisor/message",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
