package pe.edu.idat.ec02_macuri_arnold

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.idat.ec02_macuri_arnold.ui.theme.EC02_Macuri_ArnoldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EC02_Macuri_ArnoldTheme {
                Ejercicio1()
            }
        }
    }
}

@Composable
fun Ejercicio1() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Formulario()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Formulario() {
    var nombre by remember { mutableStateOf("") }
    var apellido by remember { mutableStateOf("") }
    var dni by remember { mutableStateOf("") }
    var celular by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var seleccionarPrograma by remember { mutableStateOf(listOf<String>()) }
    var otroprograma by remember { mutableStateOf("") }
    var seleccionarColor by remember { mutableStateOf("") }
    val programas = listOf("MS SQL Server", "VStudioCode", "Android Studio", "Otro")
    val colores = listOf("Azul", "Rojo", "Verde", "Otro")

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "INFORMACIÓN", fontSize = 24.sp, modifier = Modifier.padding(bottom = 16.dp))

        BasicTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            decorationBox = { innerTextField ->
                TextFieldDecorationBox(
                    value = nombre, visualTransformation = VisualTransformation.None,
                    innerTextField = innerTextField,
                    enabled = true,
                    singleLine = true,
                    interactionSource = remember { MutableInteractionSource() },
                    colors = TextFieldDefaults.textFieldColors()
                )
            },
            singleLine = true
        )

        BasicTextField(
            value = apellido,
            onValueChange = { apellido = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            decorationBox = { innerTextField ->
                TextFieldDecorationBox(
                    value = apellido, visualTransformation = VisualTransformation.None,
                    innerTextField = innerTextField,
                    enabled = true,
                    singleLine = true,
                    interactionSource = remember { MutableInteractionSource() },
                    colors = TextFieldDefaults.textFieldColors()
                )
            },
            singleLine = true
        )

        BasicTextField(
            value = dni,
            onValueChange = { dni = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            decorationBox = { innerTextField ->
                TextFieldDecorationBox(
                    value = dni, visualTransformation = VisualTransformation.None,
                    innerTextField = innerTextField,
                    enabled = true,
                    singleLine = true,
                    interactionSource = remember { MutableInteractionSource() },
                    colors = TextFieldDefaults.textFieldColors()
                )
            },
            singleLine = true
        )

        BasicTextField(
            value = celular,
            onValueChange = { celular = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            decorationBox = { innerTextField ->
                TextFieldDecorationBox(
                    value = celular, visualTransformation = VisualTransformation.None,
                    innerTextField = innerTextField,
                    enabled = true,
                    singleLine = true,
                    interactionSource = remember { MutableInteractionSource() },
                    colors = TextFieldDefaults.textFieldColors()
                )
            },
            singleLine = true
        )

        BasicTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            decorationBox = { innerTextField ->
                TextFieldDecorationBox(
                    value = email, visualTransformation = VisualTransformation.None,
                    innerTextField = innerTextField,
                    enabled = true,
                    singleLine = true,
                    interactionSource = remember { MutableInteractionSource() },
                    colors = TextFieldDefaults.textFieldColors()
                )
            },
            singleLine = true
        )

        Text("Seleccione Programas que domine:", modifier = Modifier.padding(vertical = 8.dp))
        programas.forEach { programas ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = seleccionarPrograma.contains(programas),
                    onCheckedChange = {
                        seleccionarPrograma = if (seleccionarPrograma.contains(programa)) {
                            seleccionarPrograma - programas
                        } else {
                            seleccionarPrograma + programas
                        }
                    }
                )
                Text(programas)
            }
        }

        BasicTextField(
            value = otroprograma,
            onValueChange = { otroprograma = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            decorationBox = { innerTextField ->
                TextFieldDefaults.TextFieldDecorationBox(
                    value = otroprograma,
                    visualTransformation = VisualTransformation.None,
                    innerTextField
                )
            }
        )

        Text("Seleccione su color favorito:", modifier = Modifier.padding(vertical = 8.dp))
        colores.forEach { color ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = seleccionarColor == color,
                    onClick = { seleccionarColor = color }
                )
                Text(color)
            }
        }

        Button(
            onClick = { /* Acción al presionar el botón */ },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Acceder")
        }
    }
}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EC02_Macuri_ArnoldTheme {
        Ejercicio1()
    }
}