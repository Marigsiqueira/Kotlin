/******************************************************************************

 Criar um vetor A do tipo inteiro de 5 elementos–	Solicitar os valores para o
 usuário e inserir no vetor A–	Criar um vetor B do tipo inteiro  –	Ler o vetor 
 A e para cada elemento lido calcular o fatorial e gravar no B–	Após de todos 
 os elementos do vetor A, mostrar os dois vetores.
 
*******************************************************************************/

fun main() {
   
    val A = IntArray(5)
    val B = IntArray(5)

    for (i in 0..4) {  
        println("Digite o valor para a posição ${i + 1} do vetor A:")
        A[i] = readLine()!!.toInt()
    }

    for (i in 0..4) {  
        var fatorial = 1
        for (j in 1..A[i]) {
            fatorial *= j
        }
        B[i] = fatorial
    }
    
    println("Vetor A:")
    for (i in 0..4) {
        print("${A[i]} ")
    }

    println("Fatoriais:")
    for (i in 0..4) {
        print("${B[i]} ")
    }
}

