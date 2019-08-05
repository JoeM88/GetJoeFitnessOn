package e.josephmolina.domain.domainmodel.repository

import e.josephmolina.domain.ResultWrapper
import e.josephmolina.domain.domainmodel.WorkoutTemplate
import java.lang.Exception

interface IWorkoutTemplateRepository {
    fun getWorkoutTemplates(getCustom: Boolean) : ResultWrapper<Exception, List<WorkoutTemplate>>
    fun deleteWorkoutTemplate(id: Int) : ResultWrapper<Exception, Unit>
    fun updateWorkoutTemplate(template: WorkoutTemplate) : ResultWrapper<Exception, Unit>


}