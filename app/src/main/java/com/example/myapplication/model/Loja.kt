package com.example.myapplication.model

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Loja(
    val produtos: List<Produto>
){
    @Composable
    fun ListarProdutos(){
        Text("-- Produtos na Loja")

        produtos.forEach{
            Text(it.nome+" - R$ "+it.preco+" - Estoque: "+ it.estoque)
        }
    }

    @Composable
    fun RealizarCompra(cliente: Cliente, carrinho: CarrinhoDeCompras){
        val total = carrinho.calcularTotal()
        if (cliente.saldo >= total){
            cliente.saldo -= total
            carrinho.listaItens.forEach{
                it.estoque -= 1
            }
            Text("Compra Realizada com Sucesso!")
        }
    }
}
