/******************************************************************************

Faça um programa na Linguagem Kotlin que leia tenha 3 opções:     
1 - Fatorial  
2 - Quadradro de um número    
3 - Volume de uma lata    
4 – Sair do Programa 
Utilize os conceitos de funções em Kotlin.

*******************************************************************************/

fun main() {
    println("Escolha uma opção:")
    println("1 - Fatorial")
    println("2 - Quadrado de um número")
    println("3 - Volume de uma lata")
    println("4 - Sair do Programa")

    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> {
            println("Digite um número para calcular o fatorial:")
            val numero = readLine()?.toIntOrNull()
            if (numero != null) {
                println("O fatorial de $numero é: ${fatorial(numero)}")
            } else {
                println("Entrada inválida!")
            }
        }
        2 -> {
            println("Digite um número para calcular o quadrado:")
            val numero = readLine()?.toIntOrNull()
            if (numero != null) {
                println("O quadrado de $numero é: ${quadrado(numero)}")
            } else {
                println("Entrada inválida!")
            }
        }
        3 -> {
            println("Digite o raio da lata:")
            val raio = readLine()?.toDoubleOrNull()
            println("Digite a altura da lata:")
            val altura = readLine()?.toDoubleOrNull()
            if (raio != null && altura != null) {
                println("O volume da lata é: ${volume(raio, altura)}")
            } else {
                println("Entradas inválidas!")
            }
        }
        4 -> {
            println("Saindo do programa")
        }
        else -> {
            println("Opção inválida!")
        }
    }
}

fun fatorial(n: Int): Int {
    var resultado = 1
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}

fun quadrado(numero: Int): Int {
    return numero * numero
}

fun volume(raio: Double, altura: Double): Double {
    return 3.14159 * (raio * raio) * altura
}

