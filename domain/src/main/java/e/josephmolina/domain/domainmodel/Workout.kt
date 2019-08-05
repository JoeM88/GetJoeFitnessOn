package e.josephmolina.domain.domainmodel

data class Workout(
    val name: String,
    val createdOn: String,
    val exercises: List<Exercise>
)