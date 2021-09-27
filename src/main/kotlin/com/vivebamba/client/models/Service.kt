/**
* Bamba API
* SDK for Bamba API
*
* The version of the OpenAPI document: 1.3.1
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
 * @param description The description of the service
 * @param policyNumber The policy number of the customer service, some services does not have it
 */

data class Service (
    /* The description of the service */
    @Json(name = "description")
    val description: kotlin.String,
    /* The policy number of the customer service, some services does not have it */
    @Json(name = "policyNumber")
    val policyNumber: kotlin.String? = null
)

