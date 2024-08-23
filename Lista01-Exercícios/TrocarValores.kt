/******************************************************************************

Faça um programa na Linguagem Kotlin  para ler dois valores inteiros para as 
variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a 
possuir o valor da variável B e a variável B passe a possuir o valor da variável 
A. Apresentar os valores trocados.

*******************************************************************************/

fun main() { 
    
    var valorA:Int 
    println("Digite um número inteiro para A:") 
    valorA = readLine().toString().toInt() 
    var valorB:Int 
    println("Digite um número inteiro para B:") 
    valorB = readLine().toString().toInt() 
    var reserva: Int 
    reserva = valorA 
    valorA = valorB 
    valorB = reserva 
    println("Variavel A é $valorA e variavel B é $valorB") 
    
}
