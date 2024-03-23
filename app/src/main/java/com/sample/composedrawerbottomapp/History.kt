package com.sample.composedrawerbottomapp

import android.util.Log
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun History(navHostController: NavHostController){

    val context = LocalContext.current

    var backPress = remember {
        mutableStateOf(false)
    }

    // Handle back button press
    BackHandler(
        enabled = true,
        onBack = {
            // Perform your action on back button press
            backPress.value = true
            Log.d("Check","Back Clicked")
            navHostController.popBackStack(Screens.Detail.screen,true)
        }
    )


    Box(){
        Column(modifier = Modifier
            .fillMaxSize()
            .align(Alignment.Center), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "History", fontSize = 14.sp, color = Color.Black)
        }
    }

}

/*

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewHistory(){
    History()
}*/
