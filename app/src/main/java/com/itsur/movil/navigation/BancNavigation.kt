package com.itsur.movil.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.itsur.movil.screens.Configuracion
import com.itsur.movil.screens.Directorio
import com.itsur.movil.screens.Favoritos
import com.itsur.movil.screens.HomeScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun BancNavigation(
    navController:NavHostController
){
    NavHost(navController= navController,startDestination= NavScreen.HomeScreen.name)
    {
        composable(NavScreen.HomeScreen.name){
            HomeScreen()
        }
        composable(NavScreen.Favoritos.name){
            Favoritos()
        }
        composable(NavScreen.Directorio.name){
            Directorio()
        }
        composable(NavScreen.Configuracion.name){
            Configuracion()
        }
    }
}