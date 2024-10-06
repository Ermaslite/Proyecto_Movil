package com.itsur.movil

import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.itsur.movil.components.NavegacionInferior
import com.itsur.movil.navigation.BancNavigation
import com.itsur.movil.screens.Directorio
import com.itsur.movil.screens.HomeScreen
import com.itsur.movil.screens.Inicio
import com.itsur.movil.screens.splashscreen
import com.itsur.movil.ui.theme.MovilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovilTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                MainScreen()
                }

            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar={
            NavegacionInferior(navController)
        }
    ){
        padding->
        Box(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ){
           BancNavigation(navController = navController)
        }
    }
    }
