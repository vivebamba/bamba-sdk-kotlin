package com.vivebamba.client.models

import com.squareup.moshi.Json
import java.time.OffsetDateTime

data class CustomerService(
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "sku")
    val sku: String,
    @Json(name = "brief")
    val brief: String,
    @Json(name = "state")
    val state: String,
    @Json(name = "validFrom")
    val validFrom: OffsetDateTime? = null,
    @Json(name = "validTo")
    val validTo: OffsetDateTime? = null,
    @Json(name = "certificate_link")
    val certificateLink: String
)
