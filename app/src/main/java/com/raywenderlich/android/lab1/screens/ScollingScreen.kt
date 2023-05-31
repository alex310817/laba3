package com.raywenderlich.android.lab1.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import androidx.compose.foundation.rememberScrollState as rememberScrollState
import com.raywenderlich.android.lab1.screens.BookImage as BookImage

@Composable
fun ScollingScreen(){
    MyScollingScreen()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)

    }
}

@Composable
fun MyScollingScreen() {
    fun Column(modifier: Unit, function: () -> Unit) {
        TODO("Not yet implemented")
    }

    run {
        val modifier = null
        Column(modifier = with(modifier) {
            val verticalScroll: Modifier =
                (this?.verticalScroll(state = rememberScrollState()) ?: this?.verticalScroll()) as Modifier
        }) {
            BookImage(
                imageResId = R.drawable.android,
                contentDescriptionResId = R.string.android,
                android = R.drawable.android
            )
            BookImage(R.drawable.java, R.string.learn_java, R.drawable.android)
            BookImage(R.drawable.python, R.string.python, R.drawable.android)
        }
    }
}

fun BookImage(imageResId: Int, contentDescriptionResId: Int, android: Int) {
    TODO("Not yet implemented")
}

private fun Nothing?.verticalScroll() {

}
@Composable
fun BookImage(@DrawableRes imageResId: Int, @StringRes contentDescriptionResId: Int){
    Image(
        bitmap = ImageBitmap.imageResource(imageResId),
        contentDescription = stringResource(contentDescriptionResId),
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.size(476.dp, 616.dp)
    )
}




