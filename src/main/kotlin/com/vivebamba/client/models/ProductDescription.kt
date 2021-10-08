/**
* Bamba API
* SDK for Bamba API
*
* The version of the OpenAPI document: 1.3.2
* Contact: desarrollo@vivebamba.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.vivebamba.client.models


import com.squareup.moshi.Json

/**
 * 
 * @param section Section title
 * @param body 
 */

data class ProductDescription (
    /* Section title */
    @Json(name = "section")
    val section: kotlin.String? = null,
    @Json(name = "body")
    val body: kotlin.collections.List<kotlin.String>? = null
)

