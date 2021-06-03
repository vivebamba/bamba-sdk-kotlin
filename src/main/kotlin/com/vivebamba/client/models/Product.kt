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

import com.vivebamba.client.models.ProductBundleItems

import com.squareup.moshi.Json

/**
 * 
 * @param sku A unique identifier for the product variant
 * @param name The name of the product
 * @param price The price of the product
 * @param type Type of the product, it can be *bundle* or *not_bundle*
 * @param bundleItems The collection of bundle items related to *bundle* products
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
    val price: kotlin.Float? = null,
    /* Type of the product, it can be *bundle* or *not_bundle* */
    @Json(name = "type")
    val type: kotlin.String? = null,
    /* The collection of bundle items related to *bundle* products */
    @Json(name = "bundleItems")
    val bundleItems: kotlin.collections.List<ProductBundleItems>? = null
)

