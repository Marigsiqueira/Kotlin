
class Funcionario(var nome: String, var salarioBruto: Double, var desconto: Double){

    fun salarioLiquido(): Double {
        return salarioBruto - desconto
    }

    fun aumentarSalario(porcentagem: Double) {
        var aumento = salarioBruto * (porcentagem / 100)
        salarioBruto += aumento
    }
}

fun main(){
    
    var funcionario = Funcionario(nome, salarioBruto, desconto) //objeto funcionario

    println("Digite o nome do funcionario: ")
    var nome: String 
    nome = readLine().toString()
    
    println("Digite o salário bruto do funcionario: ")
    var salarioBruto: Double
    salarioBruto = readLine().toString().toDouble()
    
    println("Digite o desconto: ")
    var desconto: Double
    desconto = readLine().toString().toDouble()
    
    // Salário do funcionario antes do aumento 
    println("Dados do funcionário:")
    println("Nome: ${funcionario.nome}")
    println("Salário líquido: R$ ${funcionario.salarioLiquido()}") 

    print("Digite a porcentagem de aumento: ")
    var porcentagem: Double
    porcentagem = readLine().toString().toDouble()
    funcionario.aumentarSalario(porcentagem)

    // Salário do funcionario após o aumento
    println(" Dados do funcionário após aumento de salário:")
    println("Nome: ${funcionario.nome}")
    println("Salário líquido: R$ ${funcionario.salarioLiquido()}")
}

