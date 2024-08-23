/******************************************************************************

Faça um programa na Linguagem Kotlin que efetue a apresentação do valor da 
conversão em real de um valor lido em dólar. O programa deve solicitar o valor da
cotação do dólar e também a quantidade de dólares disponível com o usuário, para 
que seja apresentado o valor em moeda brasileira

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