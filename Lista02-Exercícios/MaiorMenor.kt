/******************************************************************************

Faça um programa na Linguagem Kotlin que leia 5 números inteiros e mostre o 
maior e o menor valor.

*******************************************************************************/

fun main() {
    val numeros = mutableListOf<Int>()
    
    for (i in 1..5){
       println("Digite o $i º número: ")
        var numero: Int = readLine().toString().toInt()
        numeros.add(numero)  
    }
    
    val maiorNumero = numeros.maxOrNull()
    val menorNumero = numeros.minOrNull()
    println("O maior número entre os cinco é: $maiorNumero")
    println("O menor número entre os cinco é: $menorNumero")
}