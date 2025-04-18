package com.example.devoirarendre

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class TacheViewModel : ViewModel() {
    private var taskIdCounter = 0

    private val _tasks = mutableStateListOf<Tache>()
    val tasks: List<Tache> get() = _tasks

    fun addTask(title: String) {
        if (title.isNotBlank()) {
            _tasks.add(Tache(id = taskIdCounter++, title = title))
        }
    }

    fun getTaskById(id: Int): Tache? {
        return _tasks.find { it.id == id }
    }
}