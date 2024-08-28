/******************************************************************************

  Faça um programa na Linguagem Kotlin que leia quatros valores referentes a 
  quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno
  foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno 
  não foi aprovado, indicar uma mensagem informando esta condição. Apresentar 
  junto das mensagens o valor da média do aluno para qualquer condição.

*******************************************************************************/

fun main(){
    
    println("Digite a primeira nota: ")
    var Nota1: Double = readLine().toString().toDouble()
    println("Digite a segunda nota: ")
    var Nota2: Double = readLine().toString().toDouble()
    println("Digite a terceira nota: ")
    var Nota3: Double = readLine().toString().toDouble()
    println("Digite a quarta nota: ")
    var Nota4: Double = readLine().toString().toDouble()
    
    var media = (Nota1 + Nota2 + Nota3 + Nota4) / 4
    
    if (media >= 7){
        println("Aluno aprovado com média $media")
    } else {
        println("Aluno reprovado com média $media")
    }
    
}