package com.example.serie5exo3.dao

import androidx.room.*
import com.example.serie5exo3.entites.Interventions

@Dao
interface InterventionDAO {

    @Query("SELECT * FROM interventions ORDER BY number DESC")
    suspend fun getAllInterventions() : List<Interventions>

    @Query("SELECT * FROM interventions WHERE number =:number")
    suspend fun getIntervention(number:Int) : Interventions

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertInterventions(intervention:Interventions)

    @Delete
    suspend fun deleteIntervention(note:Interventions)

    @Query("DELETE FROM interventions WHERE number =:id")
    suspend fun deleteSpecificNote(id:Int)

    @Update
    suspend fun updateIntervention(intervention: Interventions)
}
