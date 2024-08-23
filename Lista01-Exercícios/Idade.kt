/******************************************************************************

Faça um programa na Linguagem Kotlin  para calcular e apresentar o valor do volume
de uma lata de óleo, utilizando a fórmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA. 

*******************************************************************************/

fun main() { 
    
    println("Digite sua idade em anos:") 
    val anos = readLine().toString().toInt() 
    println("Digite a quantidade de meses:") 
    val meses = readLine().toString().toInt() 
    println("Digite a quantidade de dias:") 
    val dias = readLine().toString().toInt() 
    val diasTotal = (anos * 365) + (meses * 30) + dias
    println("A idade em dias é: $diasTotal") 
    
}