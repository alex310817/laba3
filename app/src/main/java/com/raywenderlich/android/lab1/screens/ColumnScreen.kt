package com.raywenderlich.android.lab1.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

@Composable
fun ColumnScreen(){
    MyColumn()
    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyColumn() {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxSize()
        ) {


            THREE_ELEMENT_LIST.forEach() { textResId ->
                Text(
                    text = stringResource(id = textResId),
                    fontSize = 22.sp
                )
            }
        }
    }

    //TODO("Not yet implemented")


fun Text(text: String, fontSize: Any) {

}

fun Column(
    horizontalAlignment: Alignment.Horizontal,
    verticalArrangement: Arrangement.HorizontalOrVertical,
    modifier: Any,
    function: () -> Unit
) {
    TODO("Not yet implemented")
}
