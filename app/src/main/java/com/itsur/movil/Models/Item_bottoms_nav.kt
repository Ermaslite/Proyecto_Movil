package com.itsur.movil.Models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.itsur.movil.navigation.NavScreen

sealed class Item_bottoms_nav (
    val icon: ImageVector,
    val title: String,
    val ruta: String
){
    object Item_bottoms_nav1: Item_bottoms_nav(
        Icons.Outlined.Home,
        "Home",
        NavScreen.HomeScreen.name
    )
    object Item_bottoms_nav2: Item_bottoms_nav(
        Icons.Outlined.Favorite,
        "Favoritos",
        NavScreen.Favoritos.name
    )
    object Item_bottoms_nav3: Item_bottoms_nav(
        Icons.Outlined.List,
        "Directorio",
        NavScreen.Directorio.name
    )
    object Item_bottoms_nav4: Item_bottoms_nav(
        Icons.Outlined.Settings,
        "Configuración",
        NavScreen.Configuracion.name
    )
}