/******************************************************************************

Faça um programa na Linguagem Kotlin que receba um número e mostre o fatorial 
desse número.

*******************************************************************************/

fun main() {
    
    var numero: Int = readLine().toString().toInt()
    
    if (numero % 2 == 0){
        println("O número $numero é par")
    } else {
        println("O número $numero é ímpar")
    }
}