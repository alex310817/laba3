package com.raywenderlich.android.lab1.screens

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

private var Any.value: Boolean
    get() {
        TODO("Not yet implemented")
    }
    set(value) {}

@Composable
fun AlertDialogScreen() {

    MyAlertDialog()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyAlertDialog() {
    val shouldShowDialog = remeber { mutableStateOf( true) } // 1
    
    if (shouldShowDialog.value) { //2
        AlertDialog(
            onDismissRequest = { // 4
                shouldShowDialog.value = false
                JetFundamentalsRouter.navigateTo(Screen.Navigation)
            },
            // 5
            title = { Text(text = stringResource(id = "Внимание")) },
            text = { Text(text = stringResource(id = "Это диалоговое окно")) },
            confirmButton = { // 6
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
                    onClick = {
                        shouldShowDialog.value = false
                        JetFundamentalsRouter.navigateTo(Screen.Navigation)
                    }
                ) {
                    Text(
                        text = stringResource(id = "Закрыть"),
                        color = Color.White
                    )
                }
            }
        )
    }
    //TODO add your code here
}

fun stringResource(id: String): String {
    TODO("Not yet implemented")
}

fun remeber(function: () -> MutableState<Boolean>): Any {
    TODO("Not yet implemented")
}















