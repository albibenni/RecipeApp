package com.benni.getyourrecipe.repository

import com.benni.getyourrecipe.domain.model.Recipe
import com.benni.getyourrecipe.network.model.RecipeDtoMapper
import com.benni.getyourrecipe.network.responses.RecipeService

class RecipeRepository_Impl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper
): RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper
            .toDomainList(
                recipeService
                    .search(token, page, query)
                    .recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper
            .mapToDomainModel(
                recipeService
                    .get(token, id))
    }
}