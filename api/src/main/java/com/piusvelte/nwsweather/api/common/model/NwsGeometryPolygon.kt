package com.piusvelte.nwsweather.api.common.model

import com.google.gson.annotations.SerializedName

data class NwsGeometryPolygon(
    @SerializedName("type") val type: String,
    @SerializedName("coordinates") val coordinates: List<List<NwsCoordinate>>,
)
