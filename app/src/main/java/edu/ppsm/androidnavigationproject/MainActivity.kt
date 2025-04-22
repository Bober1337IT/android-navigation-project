package edu.ppsm.androidnavigationproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.ppsm.androidnavigationproject.ui.theme.AndroidNavigationProjectTheme
import org.example.project.screens.DetailsScreen
import org.example.project.screens.InfoScreen
import org.example.project.screens.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidNavigationProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val navController = rememberNavController()

                    NavHost(navController, startDestination = Screen.MainScreen.route){
                        composable(Screen.DetailsScreen.route){
                            DetailsScreen(navController)
                        }
                        composable(Screen.InfoScreen.route){
                            InfoScreen(navController)
                        }
                        composable(Screen.MainScreen.route){
                            MainScreen(navController)
                        }
                    }

                }
            }
        }
    }
}

