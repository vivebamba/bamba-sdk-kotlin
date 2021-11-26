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

package com.vivebamba.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param type Message type
 * @param message The text of the message
 */

data class Message (

    /* Message type */
    @Json(name = "type")
    val type: kotlin.String,

    /* The text of the message */
    @Json(name = "message")
    val message: kotlin.String

)

