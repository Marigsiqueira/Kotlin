/******************************************************************************

 Faça um programa na Linguagem Kotlin que leia 3 (três) valores inteiros e 
 apresente os 3 números em ordem crescente.

*******************************************************************************/

fun main() {
    val numeros = mutableListOf<Int>()
    
    for (i in 1..3){
       println("Digite o $i º número: ")
        var numero: Int = readLine().toString().toInt()
        numeros.add(numero)  
    }
    
    val ordenar = numeros.sorted()
    println("Os três valores em ordem crescente é: $ordenar")
}
