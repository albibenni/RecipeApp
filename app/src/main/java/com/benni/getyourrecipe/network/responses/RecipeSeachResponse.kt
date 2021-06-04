package com.benni.getyourrecipe.network.responses

import com.benni.getyourrecipe.domain.model.Recipe
import com.benni.getyourrecipe.network.model.RecipeNetworkEntity
import com.google.gson.annotations.SerializedName

class RecipeSeachResponse (
    @SerializedName("count")
    var count: Int,

    @SerializedName("result")
    var recipes: List<RecipeNetworkEntity>
)