package pe.edu.idat.ec02_macuri_arnold

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.idat.ec02_macuri_arnold.ui.theme.EC02_Macuri_ArnoldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EC02_Macuri_ArnoldTheme {

            }
        }
    }
}

@Composable
fun Ejercicio1(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        Formulario()
    }
}

@Composable
fun Formulario(){
    var nombre by remember {
        mutableStateOf("")
    }
    var apellido by remember {
        mutableStateOf("")
    }
    var dni by remember {
        mutableStateOf("")
    }
    var celular by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var seleccionarPrograma by remember {
        mutableStateOf(listOf<String>())
    }
    var seleccionarColor by remember {
        mutableStateOf("")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {


}