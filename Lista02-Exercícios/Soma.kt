/******************************************************************************
Faça um programa na Linguagem Kotlin para apresentar o total da soma obtida dos 
cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).

*******************************************************************************/

fun  main(){
    
    var a:Int = 0 
    
    for ( i in 1..100){
        a = a + i
    }
    println("A soma dos 100 primeiros múmeros inteiros é: $a" )

}

