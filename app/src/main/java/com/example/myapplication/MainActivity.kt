package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.model.CarrinhoDeCompras
import com.example.myapplication.model.Cliente
import com.example.myapplication.model.Loja
import com.example.myapplication.model.Produto
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //O SOFTWARE COMEÇA AQUI

        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                val cliente = Cliente(1, "Joshua", 5000.00)
                val p = Produto(1, "Mouse", 749.90, 10)
                val p2 = Produto(2, "Headset", 980.90, 5)

                var listaProdutos = mutableListOf(p, p2)

                val carrinho = CarrinhoDeCompras(cliente)
                carrinho.adicionarProduto(p, 2)
                carrinho.adicionarProduto(p2, 2)

                val loja = Loja(listaProdutos)

                Column (
                    modifier = Modifier.padding(top = 50.dp)
                ) {
                    p.ExibirDetalhes()
                    carrinho.ExibirCarrinho()
                    loja.ListarProdutos()
                    loja.RealizarCompra(cliente, carrinho)
                }
            }
        }
    }
}