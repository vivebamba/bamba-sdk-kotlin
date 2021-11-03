/**
* Bamba API
* SDK for Bamba API
*
* The version of the OpenAPI document: 1.3.3
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

