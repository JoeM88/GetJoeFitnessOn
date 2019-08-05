package e.josephmolina.domain.domainmodel

import e.josephmolina.domain.constants.ExerciseType

data class Exercise(
    val name: String,
    val sets: List<Set>,
    val type: ExerciseType
)