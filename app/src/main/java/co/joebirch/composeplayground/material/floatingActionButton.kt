package co.joebirch.composeplayground.material

import androidx.compose.foundation.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import co.joebirch.composeplayground.ComposableLayout

object FloatingActionButtonView: ComposableLayout {

    @Composable
    override fun build() {
        Column(
            modifier = Modifier.fillMaxSize().padding(32.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IconFloatingActionButton()
            ColoredFloatingActionButton()
            ElevatedFloatingActionButton()
            ShapeFloatingActionButton()
        }
    }

}

@Composable
fun IconFloatingActionButton() {
    FloatingActionButton(onClick = {

    }) {
        Icon(asset = Icons.Filled.Star)
    }
}

@Composable
fun ColoredFloatingActionButton() {
    FloatingActionButton(
        onClick = {

        },
        backgroundColor = Color.Red,
        contentColor = Color.White
    ) {
        Icon(asset = Icons.Filled.Star)
    }
}

@Composable
fun ElevatedFloatingActionButton() {
    FloatingActionButton(
        onClick = {

        },
        elevation = 20.dp
    ) {
        Icon(asset = Icons.Filled.Star)
    }
}

@Composable
fun ShapeFloatingActionButton() {
    FloatingActionButton(
        onClick = {

        },
        shape = RectangleShape
    ) {
        Icon(asset = Icons.Filled.Star)
    }
}
