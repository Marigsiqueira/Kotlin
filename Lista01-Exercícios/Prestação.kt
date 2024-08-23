/******************************************************************************

 Faça um programa na Linguagem Kotlin para efetuar o cálculo e a apresentação do 
 valor de uma prestação em atraso, utilizando a fórmula:
 PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).

*******************************************************************************/

fun main() {
    var valor: Double 
    println("Digite o valor da prestação:") 
    valor = readLine().toString().toDouble() 
    var tempo: Int 
    println("Digite o tempo de atraso em meses:") 
    tempo = readLine().toString().toInt() 
    var taxa: Double 
    println("Digite o valor da taxa de atraso:") 
    taxa = readLine().toString().toDouble() 
    var calculo = valor + (valor * (taxa/100) * tempo) 
    println("O valor da prestação em atraso é $calculo") 
    
}