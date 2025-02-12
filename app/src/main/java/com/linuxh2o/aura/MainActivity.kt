package com.linuxh2o.aura

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.linuxh2o.aura.navigation.Route
import com.linuxh2o.aura.navigation.NavRouter
import com.linuxh2o.aura.ui.theme.AuraTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var startRoute: Route

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        startRoute = Route.AboardInvite

        setContent {
            val navController = rememberNavController()

            AuraTheme {
                NavRouter(
                    navHostController = navController,
                    startRoute = startRoute
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AuraTheme {
        Greeting("Android")
    }
}