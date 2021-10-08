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

import com.vivebamba.client.models.ProductDescription

import com.squareup.moshi.Json

/**
 * 
 * @param sku A unique identifier for the product variant
 * @param name The name of the product
 * @param price The price of the product
 * @param image Image of the product
 * @param brief Plan benefit summary
 * @param description Commercial information of the product by sections, the number of elements of each array is dynamic
 * @param terms Link to terms and conditions detailed by product
 */

data class Product (
    /* A unique identifier for the product variant */
    @Json(name = "sku")
    val sku: kotlin.String? = null,
    /* The name of the product */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The price of the product */
    @Json(name = "price")
    val price: kotlin.Double? = null,
    /* Image of the product */
    @Json(name = "image")
    val image: kotlin.String? = null,
    /* Plan benefit summary */
    @Json(name = "brief")
    val brief: kotlin.String? = null,
    /* Commercial information of the product by sections, the number of elements of each array is dynamic */
    @Json(name = "description")
    val description: kotlin.collections.List<ProductDescription>? = null,
    /* Link to terms and conditions detailed by product */
    @Json(name = "terms")
    val terms: kotlin.String? = null
)

