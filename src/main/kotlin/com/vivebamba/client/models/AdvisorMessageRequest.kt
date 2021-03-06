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

package com.vivebamba.client.models

import com.vivebamba.client.models.AdvisorUser
import com.vivebamba.client.models.Message

import com.squareup.moshi.Json

/**
 * 
 *
 * @param customer 
 * @param message 
 */

data class AdvisorMessageRequest (

    @Json(name = "customer")
    val customer: AdvisorUser,

    @Json(name = "message")
    val message: Message

)

