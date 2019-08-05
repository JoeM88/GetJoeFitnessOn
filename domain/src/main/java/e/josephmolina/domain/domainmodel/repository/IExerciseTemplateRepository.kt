package e.josephmolina.domain.domainmodel.repository

import com.sun.corba.se.spi.orbutil.threadpool.Work
import e.josephmolina.domain.ResultWrapper
import e.josephmolina.domain.domainmodel.ExerciseTemplate
import java.lang.Exception

interface IExerciseTemplateRepository {
    fun getExerciseTemplatesByFilter(filter: String, isCustom: Boolean) : ResultWrapper<Exception, List<ExerciseTemplate>>
    fun updateExerciseTemplate() : ResultWrapper<Exception, List<ExerciseTemplate>>
}