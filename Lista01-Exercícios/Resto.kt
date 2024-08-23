/******************************************************************************

Faça um programa na Linguagem Kotlin que receba um número e mostre o resto da 
divisão por 6. 

*******************************************************************************/

fun main() { 
    
    var numero: Double 
    println("Digite um número:") 
    numero = readLine().toString().toDouble() 
    var resto = numero % 6 
    println("O resto da divisão de $numero 6 é: $resto") 
    
}
