package org.example.project.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import edu.ppsm.androidnavigationproject.Screen

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Main Screen", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate(Screen.DetailsScreen.route) }) {
            Text("Go to Details")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navController.navigate(Screen.InfoScreen.route) }) {
            Text("Go to Info")
        }
    }
}