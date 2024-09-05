/******************************************************************************
 Criar uma coleção “A” na linguagem Kotlin com 10 elementos.	
 Inserir os elementos de 1 a 10 na coleção – Criar uma outra coleção B que
 conterá o elemento da coleção A multiplicado por 2 - Mostrar as duas coleções.
 
*******************************************************************************/
fun main() {
    val A = Array<Int>(10) { i -> i + 1 }
    val B = Array<Int>(10) { i -> A[i] * 2 }
    
    print("Coleção A: ")
    for (numero in A) {
        println("$numero ")
    }

    print("Coleção B: ")
    for (numero in B) {
        println("$numero ")
    }
}