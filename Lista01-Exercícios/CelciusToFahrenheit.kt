/******************************************************************************
Faça um programa na Linguagem Kotlin que leia uma temperatura em graus Celsius e 
apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é 
F <-- (9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C a temperatura em 
Celsius.

*******************************************************************************/

fun main() {

    var C: Double 
    println("Digite uma temperatura em graus Celcius:") 
    C = readLine().toString().toDouble() 
    var F = (9 * C + 160) / 5
    println("A temperatura $C em Fahrenheit é: $F") 
    
    
}