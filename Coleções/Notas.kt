/******************************************************************************

Fazer um procedimento para receber as notas da primeira e da segunda prova de 
cinco alunos. Armazenar as notas da primeira e da segunda prova em vetores 
distintos. Calcular e escrever a média de cada aluno.
 
*******************************************************************************/

fun main() {

    val notasProva1 = DoubleArray(5)
    val notasProva2 = DoubleArray(5)

    for (i in 0 until 5) {
        println("Digite a nota da 1ª prova do aluno ${i + 1}:")
        notasProva1[i] = readLine()!!.toDouble()

        println("Digite a nota da 2ª prova do aluno ${i + 1}:")
        notasProva2[i] = readLine()!!.toDouble()
    }

    for (i in 0 until 5) {
        val media = (notasProva1[i] + notasProva2[i]) / 2
        println("A média do aluno ${i + 1} é: $media")
    }
}