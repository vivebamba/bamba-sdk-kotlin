/**
* Bamba API
* SDK for Bamba API
*
* The version of the OpenAPI document: 1.3.0
* Contact: desarrollo@vivebamba.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.vivebamba.client.models

import com.vivebamba.client.models.AnyOfLessThanObjectCommaObjectGreaterThan

import com.squareup.moshi.Json

/**
 * 
 * @param section Section title
 * @param details 
 */

data class SectionWhatNotIncludes (
    /* Section title */
    @Json(name = "section")
    val section: kotlin.String? = null,
    @Json(name = "details")
    val details: kotlin.collections.List<AnyOfLessThanObjectCommaObjectGreaterThan>? = null
)

