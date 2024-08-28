/******************************************************************************

Faça um programa na Linguagem Kotlin que leia 3 números inteiros e mostre o maior
deles.
*******************************************************************************/

fun main() {
    val numeros = mutableListOf<Int>()
    
    for (i in 1..3){
       println("Digite o $i º número: ")
        var numero: Int = readLine().toString().toInt()
        numeros.add(numero)  
    }
    
    val maiorNumero = numeros.maxOrNull()
    println("O maior número entre os três é: $maiorNumero")
}

