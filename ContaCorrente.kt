class ContaCorrente (val numeroDaConta: Int, var saldo: Double){
        fun imprimir(){
            println("Conta: %numeroDaConta \nSaldo: $saldo")
        }
    
    	fun depositar(valor: Double){
            saldo = saldo + valor
        }
        
        fun sacar(valor: Double){
            saldo = saldo - valor
        }
        
        fun main(){
        }
}
