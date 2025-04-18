package com.example.devoirarendre

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph(viewModel: TacheViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MainScreen(viewModel, navController)
        }
        composable("add") {
            AddTaskScreen(viewModel, navController)
        }
        composable("detail/{taskId}") { backStackEntry ->
            val taskId = backStackEntry.arguments?.getString("taskId")?.toIntOrNull()
            taskId?.let {
                val task = viewModel.getTaskById(it)
                task?.let {
                    DetailScreen(task, navController)
                }
            }
        }
    }
}