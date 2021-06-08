package com.benni.getyourrecipe.network.responses

import com.benni.getyourrecipe.network.model.RecipeDto
import com.google.gson.annotations.SerializedName

data class RecipeSeachResponse (
    @SerializedName("count")
    var count: Int,

    @SerializedName("result")
    var recipes: List<RecipeDto>
)