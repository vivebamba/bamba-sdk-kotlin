/**
* Bamba API
* SDK for Bamba API
*
* The version of the OpenAPI document: 1.1.0
* Contact: desarrollo@vivebamba.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.vivebamba.client.models

import com.vivebamba.client.models.AdvisorUser
import com.vivebamba.client.models.Message

import com.squareup.moshi.Json

/**
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

