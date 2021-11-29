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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param name The customer's name
 * @param lastName The customer's last name
 * @param cellphone The customer's cellphone number
 * @param uuid Customer UUID assigned by Bamba
 */

data class AdvisorUser (

    /* The customer's name */
    @Json(name = "name")
    val name: kotlin.String,

    /* The customer's last name */
    @Json(name = "lastName")
    val lastName: kotlin.String,

    /* The customer's cellphone number */
    @Json(name = "cellphone")
    val cellphone: kotlin.String,

    /* Customer UUID assigned by Bamba */
    @Json(name = "uuid")
    val uuid: kotlin.String? = null

)

