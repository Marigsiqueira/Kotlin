/******************************************************************************

 Faça um programa na Linguagem Kotlin que efetue a leitura de um número inteiro 
 e apresentar uma mensagem informando se o número é par ou ímpar.

*******************************************************************************/

fun main() {
    
    var numero: Int = readLine().toString().toInt()
    
    if (numero % 2 == 0){
        println("O número $numero é par")
    } else {
        println("O número $numero é ímpar")
    }
}
