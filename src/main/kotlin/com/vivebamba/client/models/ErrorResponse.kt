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
 * @param errors The error description
 */

data class ErrorResponse (
    /* The error description */
    @Json(name = "errors")
    val errors: kotlin.collections.List<kotlin.String>? = null
)

