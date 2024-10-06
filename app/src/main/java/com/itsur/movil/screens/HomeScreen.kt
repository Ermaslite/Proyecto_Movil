package com.itsur.movil.screens

import android.text.Layout.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.itsur.movil.R

@Composable
fun HomeScreen (){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement= Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.black), contentDescription = null)
        Text(text = "Inicio")
    }



}