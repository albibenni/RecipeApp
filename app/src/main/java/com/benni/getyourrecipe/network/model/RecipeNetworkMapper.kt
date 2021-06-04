package com.benni.getyourrecipe.network.model

import com.benni.getyourrecipe.domain.model.Recipe
import com.benni.getyourrecipe.domain.util.EntityMapper

class RecipeNetworkMapper : EntityMapper<RecipeNetworkEntity, Recipe>{
    override fun mapFromEntity(entity: RecipeNetworkEntity): Recipe {
        return Recipe(
            id = entity.pk,
            title = entity.title,
            featured_image = entity.featuredImage,
            rating = entity.rating,
            publisher = entity.publisher,
            source_url = entity.source_url,
            description = entity.description,
            cooking_instructions = entity.cookingInstructions,
            ingredients = entity.ingredients?: listOf(),
            date_added = entity.dateAdded,
            date_updated = entity.dateUpdated,
        )
    }

    override fun mapToEntity(domainModel: Recipe): RecipeNetworkEntity {
        return RecipeNetworkEntity(
            pk = domainModel.id,
            title = domainModel.title,
            featuredImage = domainModel.featured_image,
            rating = domainModel.rating,
            publisher = domainModel.publisher,
            source_url = domainModel.source_url,
            description = domainModel.description,
            cookingInstructions = domainModel.cooking_instructions,
            ingredients = domainModel.ingredients,
            dateAdded = domainModel.date_added,
            dateUpdated = domainModel.date_updated,
        )
    }

    fun fromEntityList (initial: List<RecipeNetworkEntity>): List<Recipe>{
        return initial.map { mapFromEntity(it) }
    }

    fun toEntitylist(initial: List<Recipe>): List<RecipeNetworkEntity>{
        return initial.map { mapToEntity(it) }
    }

}