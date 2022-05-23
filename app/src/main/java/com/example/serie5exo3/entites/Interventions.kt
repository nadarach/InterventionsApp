package com.example.serie5exo3.entites


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Interventions")
class Interventions: Serializable {

    @ColumnInfo(name = "number")
    var numero:Int? = null

    @ColumnInfo(name = "date")
    var date:String? = null

    @ColumnInfo(name = "name")
    var name:String? = null

    @ColumnInfo(name = "type")
    var type:String? = null
}