package e.josephmolina.domain.domainmodel

import e.josephmolina.domain.constants.ExerciseTarget

data class WorkoutTemplate(
    val id: Int,
    val name: String,
    val thumbnailRes: String,
    val description: String,
    val difficulty: Int,
    val isCustom: Boolean,
    val targets: List<ExerciseTarget>,
    val workout: Workout
)