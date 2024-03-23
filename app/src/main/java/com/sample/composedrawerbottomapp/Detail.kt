package com.sample.composedrawerbottomapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Detail(navigationController : NavHostController){

    Box(){
        Column(modifier = Modifier
            .fillMaxSize().clickable { navigationController.navigate(Screens.History.screen) }
            .align(Alignment.Center), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Detail", fontSize = 14.sp, color = Color.Black)
        }
    }
}

/*
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewDetail(){
    Detail()
}*/
