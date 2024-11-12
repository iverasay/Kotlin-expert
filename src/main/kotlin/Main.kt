import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.DragData
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    val text = remember { mutableStateOf("") }

    MaterialTheme {
        Column {
            TextField(value = "", onValueChange = { newText -> TODO() })
            Text(text = "")
            Button(onClick = { text.value = TODO() }) { Text("Clean") }
        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "My Application") {
        App()
    }
}
