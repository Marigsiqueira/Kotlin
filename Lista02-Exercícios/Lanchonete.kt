fun main() {

    println("Cardápio da Lanchonete:")
    println("Código  Item               Preço")
    println("100     Cachorro quente     R\$ 1,20")
    println("101     Bauru simples        R\$ 1,30")
    println("102     Bauru com ovo        R\$ 1,50")
    println("103     Hambúrguer           R\$ 1,20")
    println("104     Cheeseburguer        R\$ 1,30")
    println("105     Refrigerante         R\$ 1,00")
    
    print("Digite o código do item: ")
    val codigoItem = readLine().toString().toInt()
    
    print("Digite a quantidade: ")
    val quantidade = readLine().toString().toInt()
    
    val preco: Double
    
    if (codigoItem == 100) {
        preco = 1.20
    } else if (codigoItem == 101) {
        preco = 1.30
    } else if (codigoItem == 102) {
        preco = 1.50
    } else if (codigoItem == 103) {
        preco = 1.20
    } else if (codigoItem == 104) {
        preco = 1.30
    } else if (codigoItem == 105) {
        preco = 1.00
    } else {
        println("Código do item inválido.")
        return
    }
    
    val valorTotal = preco * quantidade
    
        println("O valor total a ser pago é: R\$ $valorTotal")
}
