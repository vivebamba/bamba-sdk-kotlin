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
 * @param id The unique identifier for the order
 * @param state The state of the order
 * @param customerId The unique identifier for the customer on Bamba®, you MUST relate this with user/customer on your platform
 * @param createdAt The date and time (ISO 8601 format) when the order was created
 * @param updatedAt The date and time (ISO 8601 format) when the order was last modified.
 */

data class InlineResponse200 (

    /* The unique identifier for the order */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The state of the order */
    @Json(name = "state")
    val state: kotlin.String? = null,

    /* The unique identifier for the customer on Bamba®, you MUST relate this with user/customer on your platform */
    @Json(name = "customerId")
    val customerId: kotlin.String? = null,

    /* The date and time (ISO 8601 format) when the order was created */
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime? = null,

    /* The date and time (ISO 8601 format) when the order was last modified. */
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null

)

