package com.example.serie5exo3.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.serie5exo3.dao.InterventionDAO
import com.example.serie5exo3.entites.Interventions

@Database(entities = [Interventions::class], version = 1, exportSchema = false)
abstract class InterventionsDatabase : RoomDatabase(){

    companion object {
        var interventionsDatabase: InterventionsDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): InterventionsDatabase {
            if (interventionsDatabase == null) {
                interventionsDatabase = Room.databaseBuilder(
                    context
                    , InterventionsDatabase::class.java
                    , "interventions.db"
                ).build()
            }
            return interventionsDatabase!!
        }
    }

    abstract fun interventionDao():InterventionDAO
}


