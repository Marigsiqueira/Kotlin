/******************************************************************************

Faça um programa na Linguagem Kotlin que calcule a área da circunferência.

*******************************************************************************/


fun main() { 
    var raio: Double 
    println("Digite o valor do raio da circunferência:") 
    raio = readLine().toString().toDouble() 
    var area = 3.14159 * (raio*raio) 
    println("A área da circunferência é: $area") 
    
}
