package e.josephmolina.domain.domainmodel

import e.josephmolina.domain.constants.ExerciseTarget
import e.josephmolina.domain.constants.ExerciseType

data class ExerciseTemplate(
    val name: String,
    val targets: List<ExerciseTarget>,
    val isCustom: Boolean,
    val type: ExerciseType
)