// write the BankAccount class here
class BankAccount(deposited:Long,withdrawn:Long){
    val deposited:Long =deposited
    val withdrawn:Long = withdrawn
    val balance:Long = deposited - withdrawn
}

fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}