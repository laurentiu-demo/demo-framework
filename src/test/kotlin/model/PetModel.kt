package model

import model.components.Category
import model.components.Tag

@kotlinx.serialization.Serializable
data class PetModel(
    val category: Category? = null,
    val id: Long? = null,
    val name: String?,
    val photoUrls: List<String>?,
    val status: String? = null,
    val tags: List<Tag>? = null
)