package com.trivka.frameWork

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.trivka.dataSource.ITrivkLocalDAO
import com.trivka.dataSource.TrivkEntity

@Database(
    entities = [
        TrivkEntity::class
    ],
    version = 1,
    exportSchema = false
)

abstract class DataBase : RoomDatabase() {

    companion object {
        @Volatile
        private var INSTANCE: DataBase? = null
        fun getInstance(context: Context): DataBase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        DataBase::class.java,
                        "trivk"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
                return instance
            }
        }
    }

    abstract fun iTrivkLocalDAO(): ITrivkLocalDAO
}