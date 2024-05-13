class Produto(var nome: String, var preco: Double, var quantidade: Int) {
    fun apresentar(): String {
        return "Nome: $nome\nPreço: R$$preco\nQuantidade: $quantidade unidades"
    }
}

fun main() {
    val produto = Produto("BOLA DO NEYMAR", 49.99, 10)
    println(produto.apresentar())
}
