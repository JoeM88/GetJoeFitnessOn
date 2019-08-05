package e.josephmolina.domain.domainmodel.repository

import e.josephmolina.domain.ResultWrapper
import e.josephmolina.domain.constants.DateRange
import e.josephmolina.domain.domainmodel.Workout
import java.lang.Exception

interface IWorkoutRepository {
    fun getWorkoutsByDay(date: String, selection: DateRange) : ResultWrapper<Exception, List<Workout>>
    fun updateWorkout(workout: Workout) : ResultWrapper<Exception, Unit>
    fun deleteWorkout(creationDateId: String) : ResultWrapper<Exception, Unit>
}