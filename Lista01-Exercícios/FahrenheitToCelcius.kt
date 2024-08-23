/******************************************************************************

Faça um programa na Linguagem Kotlin que leia uma temperatura em graus Fahrenheit 
e apresentá-la convertida em graus Celsius. A formula de conversão é 
C <-- (F - 32) * (5/9), sendo f a temperatura em Fahrenheit e C a temperatura em 
Celsius. 

*******************************************************************************/

fun main() { 
    var F: Double 
    println("Digite uma temperatura em graus Fahrenheit:") 
    F = readLine().toString().toDouble() 
    var C = (F - 32.0) * (5.0/9.0) 
    println("A temperatura $F em graus Celcius é: $C") 
    
}