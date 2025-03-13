package com.example.myapplication.model

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class CarrinhoDeCompras(
    val cliente: Cliente
){
    val listaItens = mutableListOf<Produto>()

    fun adicionarProduto(p: Produto, quantidade: Int){
        for (i in 1..quantidade){
            listaItens.add(p)
        }
    }

    fun removerProduto(p: Produto, quantidade: Int){
        if (p in listaItens){
            for (i in 1..quantidade){
                listaItens.remove(p)
            }
        }
    }

    @Composable
    fun ExibirCarrinho(){
        Text("-- Carrinho Cliente - "+ cliente.nome)

        var total = 0.0
        listaItens.forEach{
            Text(it.nome+" - R$ "+it.preco)
            total += it.preco
        }

        Text("-- Preco Total - R$ "+ total)
    }

    fun calcularTotal() : Double{
        var total = 0.0
        listaItens.forEach{
            total += it.preco
        }

        return total
    }
}
