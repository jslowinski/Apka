package com.mrkanapka.mrkanapkakotlin.api.model.Response

data class ResponseCartDetail(
    var amount: Int,
    var id_product: Int,
    var name: String,
    var photo_url: String,
    var price: String,
    var price_per_one: String
)