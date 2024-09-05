/******************************************************************************
Criar uma coleção na linguagem Kotlin com 10 elementos–	Inserir os elementos 
de 1 a 10 no vetor–	Após a inserção, somente após a inserção mostrar o vetor.

*******************************************************************************/
fun main() {
val numeros = Array<Int>( 10, {i -> i + 1})
for( numero in numeros)
{
println(numero)
}
}