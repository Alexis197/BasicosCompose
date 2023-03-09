package com.example.basicoscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basicoscompose.ui.theme.BasicosComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicosComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Articulo()
                }
            }
        }
    }
}

@Composable
fun Articulo(){
    presentacionArticulo(
        titulo = stringResource(id = R.string.titulo_compose),
        descrpcionCorta = stringResource(id = R.string.descripcion_cor),
        descrpcionLarga = stringResource(id = R.string.descripcion_larga),
        imagenPainter = painterResource(id = R.drawable.bg_compose_background)
        )
}
@Composable
private fun presentacionArticulo(titulo: String, descrpcionCorta : String, descrpcionLarga : String, imagenPainter: Painter, modifier: Modifier=Modifier){
    Column(modifier = modifier) {
        Image(painter = imagenPainter, contentDescription = null )
        Text(text = titulo, fontSize = 24.sp, modifier = Modifier.padding(16.dp)
        )
        Text(
            text = descrpcionCorta,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = descrpcionLarga,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicosComposeTheme {
        Articulo()
    }
}