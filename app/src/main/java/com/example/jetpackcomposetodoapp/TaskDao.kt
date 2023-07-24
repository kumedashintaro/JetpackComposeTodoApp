package com.example.jetpackcomposetodoapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Insert
    suspend fun insertAll(task: Task)

    @Query("SELECT * FROM Task")
    fun loadAllTasks(): Flow<List<Task>>

    @Update
    suspend fun updateTask(task: Task)

    @Delete
    suspend fun deleteTask(task: Task)
}