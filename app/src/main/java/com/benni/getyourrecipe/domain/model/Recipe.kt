package com.benni.getyourrecipe.domain.model

import android.icu.text.CaseMap
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Recipe( //variable for a json object in https://food2fork.ca/
    val id: Int? = null,
    val title: String? = null,
    val publisher: String? = null,
    val featured_image: String? = null,
    val rating: Int? = 0,
    val source_url: String? = null,
    val description: String? = null,
    val cooking_instructions: String? = null,
    val ingredients: List<String>? = null,
    val date_added: String? = null,
    val date_updated: String? = null,

): Parcelable