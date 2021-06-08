package com.benni.getyourrecipe.network.model

import com.benni.getyourrecipe.domain.model.Recipe
import com.benni.getyourrecipe.domain.util.DomainMapper

class RecipeDtoMapper : DomainMapper<RecipeDto, Recipe>{
    override fun mapToDomainModel(model: RecipeDto): Recipe {
        return Recipe(
            id = model.pk,
            title = model.title,
            featured_image = model.featuredImage,
            rating = model.rating,
            publisher = model.publisher,
            source_url = model.source_url,
            description = model.description,
            cooking_instructions = model.cookingInstructions,
            ingredients = model.ingredients?: listOf(),
            date_added = model.dateAdded,
            date_updated = model.dateUpdated,
        )
    }

    override fun mapFromDomainModel(domainModel: Recipe): RecipeDto {
        return RecipeDto(
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

    fun toDomainList (initial: List<RecipeDto>): List<Recipe>{
        return initial.map { mapToDomainModel(it) }
    }

    fun fromDomainList(initial: List<Recipe>): List<RecipeDto>{
        return initial.map { mapFromDomainModel(it) }
    }

}