package com.a10miaomiao.bilimiao.comm.entity.bangumi

data class EpisodeInfo(
    val aid: Int,
    val badge: String,
    val badge_type: Int,
    val cid: Int,
    val cover: String,
    val dimension: DimensionXInfo,
    val from: String,
    val id: String,
    val long_title: String,
    val share_url: String,
    val status: Int,
    val title: String,
    val vid: String
)
