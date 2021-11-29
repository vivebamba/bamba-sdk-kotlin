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

import com.vivebamba.client.models.InlineResponse422Errors

import com.squareup.moshi.Json

/**
 * 
 *
 * @param errors 
 */

data class InlineResponse4221 (

    @Json(name = "errors")
    val errors: kotlin.collections.List<InlineResponse422Errors>? = null

)

