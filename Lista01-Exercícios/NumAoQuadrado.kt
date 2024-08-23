/******************************************************************************

 Faça um programa na Linguagem Kotlin para efetuar a leitura de um número inteiro 
 e apresentar o resultado do quadrado desse número.
 
*******************************************************************************/

fun main() {

    var numero: Int 
    println("Digite um número inteiro:") 
    numero = readLine().toString().toInt() 
    var resultado = numero * numero 
    println("O resultado de $numero ao quadrado é $resultado") 
    
}