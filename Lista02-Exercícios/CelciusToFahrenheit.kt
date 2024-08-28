/******************************************************************************

Faça um programa na Linguagem Kotlin que apresente os valores de conversão de 
graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus
Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores
das duas temperaturas.

*******************************************************************************/

fun main()
{
    for (temperatura in 10..100 step 10){
        println("Temperatura em graus Celcius: $temperatura")
        val conversao = (9 * temperatura + 160) / 5
        println("Conversão para graus Fahrenheit: $conversao")
    }
}