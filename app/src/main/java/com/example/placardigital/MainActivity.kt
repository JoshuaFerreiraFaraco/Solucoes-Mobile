package com.example.placardigital

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.placardigital.ui.theme.PlacarDigitalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //O projeto começa aqui

        //setContent espera receber uma view @Compusable
        setContent {
            TesteCompose()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TesteCompose(){
    var textoInterface by remember { mutableStateOf("") }
    var numeroTotal by remember { mutableIntStateOf(0) }
    var primeiroNumero by remember { mutableStateOf("") }
    var verificarNumero by remember { mutableIntStateOf(0) }
    var segundoNumero by remember { mutableStateOf("") }
    var simboloNumero by remember { mutableStateOf("") }


    //verificarNumero = 1 - segundoNumero
    //verificarNumero = 0 - primeiroNumero
    Column {
        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Column (
                horizontalAlignment = Alignment.End,
                modifier = Modifier.fillMaxWidth().padding(20.dp)
            ) {
                Text(textoInterface, fontSize = 30.sp)
            }
        }
        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Column (
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.fillMaxWidth()
                    .padding(20.dp)
            ){
                Row (
                    modifier = Modifier.fillMaxWidth()
                ){
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        if(verificarNumero == 1){
                            segundoNumero += "1"
                            textoInterface += "1"
                        } else{
                            primeiroNumero += "1"
                            textoInterface += "1"
                        }
                    }) {
                        Text(text = "1", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        if(verificarNumero == 1){
                            segundoNumero += "2"
                            textoInterface += "2"
                        } else{
                            primeiroNumero += "2"
                            textoInterface += "2"
                        }
                    }) {
                        Text(text = "2", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        if(verificarNumero == 1){
                            segundoNumero += "3"
                            textoInterface += "3"
                        } else{
                            primeiroNumero += "3"
                            textoInterface += "3"
                        }
                    }) {
                        Text(text = "3", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        simboloNumero = "+"
                        textoInterface += "+"
                        verificarNumero = 1
                    }) {
                        Text(text = "+", fontSize = 20.sp)
                    }
                }
                Row (
                    modifier = Modifier.fillMaxWidth()
                ){
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        if(verificarNumero == 1){
                            segundoNumero += "4"
                            textoInterface += "4"
                        } else{
                            primeiroNumero += "4"
                            textoInterface += "4"
                        }
                    }) {
                        Text(text = "4", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        if(verificarNumero == 1){
                            segundoNumero += "5"
                            textoInterface += "5"
                        } else{
                            primeiroNumero += "5"
                            textoInterface += "5"
                        }
                    }) {
                        Text(text = "5", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        if(verificarNumero == 1){
                            segundoNumero += "6"
                            textoInterface += "6"
                        } else{
                            primeiroNumero += "6"
                            textoInterface += "6"
                        }
                    }) {
                        Text(text = "6", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        simboloNumero = "-"
                        textoInterface += "-"
                        verificarNumero = 1
                    }) {
                        Text(text = "-", fontSize = 20.sp)
                    }
                }
                Row (
                    modifier = Modifier.fillMaxWidth()
                ){
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        if(verificarNumero == 1){
                            segundoNumero += "7"
                            textoInterface += "7"
                        } else{
                            primeiroNumero += "7"
                            textoInterface += "7"
                        }
                    }) {
                        Text(text = "7", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        if(verificarNumero == 1){
                            segundoNumero += "8"
                            textoInterface += "8"
                        } else{
                            primeiroNumero += "8"
                            textoInterface += "8"
                        }
                    }) {
                        Text(text = "8", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        if(verificarNumero == 1){
                            segundoNumero += "9"
                            textoInterface += "9"
                        } else{
                            primeiroNumero += "9"
                            textoInterface += "9"
                        }
                    }) {
                        Text(text = "9", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        simboloNumero = "*"
                        textoInterface += "*"
                        verificarNumero = 1
                    }) {
                        Text(text = "*", fontSize = 20.sp)
                    }
                }
                Row (
                    modifier = Modifier.fillMaxWidth()
                ){
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        simboloNumero = ""
                        textoInterface = ""
                        segundoNumero = ""
                        primeiroNumero = ""
                        verificarNumero = 0
                        numeroTotal = 0
                    }) {
                        Text(text = "C", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        if(verificarNumero == 1){
                            segundoNumero += "0"
                            textoInterface += "0"
                        } else{
                            primeiroNumero += "0"
                            textoInterface += "0"
                        }
                    }) {
                        Text(text = "0", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {

                        if(simboloNumero == "+"){
                            numeroTotal = primeiroNumero.toInt() + segundoNumero.toInt()
                        } else if (simboloNumero == "-"){
                            numeroTotal = primeiroNumero.toInt() - segundoNumero.toInt()
                        } else if (simboloNumero == "*"){
                            numeroTotal = primeiroNumero.toInt() * segundoNumero.toInt()
                        } else {
                            numeroTotal = primeiroNumero.toInt() / segundoNumero.toInt()
                        }

                        textoInterface = numeroTotal.toString()
                    }) {
                        Text(text = "=", fontSize = 20.sp)
                    }
                    Button(modifier = Modifier.width(100.dp).padding(end = 10.dp), onClick = {
                        simboloNumero = "/"
                        textoInterface += "/"
                        verificarNumero = 1
                    }) {
                        Text(text = "/", fontSize = 20.sp)
                    }
                }
            }
        }
    }
}