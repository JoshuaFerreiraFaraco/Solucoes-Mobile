package com.example.cacaaotesouro

import android.os.Bundle
import android.view.textclassifier.TextLanguage
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.internal.composableLambdaN
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cacaaotesouro.ui.theme.CacaAoTesouroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //site começa aqui
        setContent {
            val navigationController = rememberNavController()
            NavHost(
                navController = navigationController,
                startDestination = "/idTela1" ) {

                //tela 01
                composable("/idTela1"){
                    //views
                    Tela1(navigationController)
                }
                composable("/idTela2"){
                    //views
                    Enigma(
                        enigma = "O que é o que é: tudo devora e a água mata?",
                        respostaCerta = "fogo",
                        Verificar = {
                            navigationController.navigate("/idTela3")
                        },
                        Voltar = {
                            navigationController.navigate("/idTela1")
                        }
                    )
                }
                composable("/idTela3") {
                    //views
                    Enigma(
                        enigma = "O que é o que é: corre deitado e cai de pé",
                        respostaCerta = "agua",
                        Verificar = {
                            navigationController.navigate("/idTela4")
                        },
                        Voltar = {
                            navigationController.navigate("/idTela2")
                        }
                    )
                }
                composable("/idTela4") {
                    //views
                    Parabens {
                        navigationController.navigate("/idTela1")
                    }
                }
            }
        }
    }
}



@Composable
fun Tela1(navigationController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("Caça ao Tesouro!")
        Button(onClick = {navigationController.navigate("/idTela2")}) {
            Text("Start")
        }
    }
}

@Composable
fun Enigma(
    enigma: String,
    respostaCerta: String,
    Verificar: () -> Unit,
    Voltar: () -> Unit
){
    var resposta by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(enigma)
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = resposta,
            onValueChange = {resposta = it},
            label = { Text("Digite sua resposta...") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row (modifier = Modifier.align(Alignment.End)){
            Button(onClick = Voltar) {
                Text("Retornar")
            }
            Button(onClick = {
                if (resposta.trim().equals(respostaCerta, ignoreCase = true)){
                    resultado = "Resposta Correta!"
                    Verificar()
                }else {
                    resultado = "Resposta Incorreta, favor tentar novamente!"
                }

            }
            ) {
                Text("Validar")
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
        Text(resultado)
    }
}

@Composable
fun Parabens(Voltar: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Parabéns! Você concluiu o Jogo Caça ao Tesouro!")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = Voltar) {
            Text("Retornar para o Início")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Tela1(rememberNavController())
}