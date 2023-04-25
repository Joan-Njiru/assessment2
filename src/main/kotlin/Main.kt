fun main() {
    val words=TakeRandomString("Joan")
    println(words.firstChar())
    println(words.lastChar())
    println(words.checksVowel())
    val result= printMultiples(48)
    println(result)


    val joan=CurrentAccount("214567j","Joannjiru",3240.2)
    println(joan.deposit(256.2))
    println(joan.withdraw(360.0))
    println(joan.details())

    val ian=SavingsAccount("473957i","Iannjiru",4000.5,4)
    println(Ian.deposit(350.6))
    println(Ian.withdraw(450.5))
    println(Ian.details())
    println(Ian.withdraw())



}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

 data class TakeRandomString (var word:String){
     fun firstChar():Char{
         return word.first()
     }
     fun lastChar():Char{
         return word.last()
     }
     fun stringLength():Int{
         return word.length
     }
     fun checksVowel():Boolean{
         val vowels= arrayOf('a','e','i','o','u')
         for (w in word){
             if (w in vowels)
         return true

     }
 }

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun takesPassword(pass:String):Boolean{
    if (pass.length in 8..16){
        return true
    }

    if (pass!=="password"){
        return true
    }
    return true
}

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun printMultiples(num:Int){
    while (num in 1..1000){
        if (num%6==0&&num%8==0){
            println("Bingo")
        }
        if(num%6==0){
            println(num)
        }
        if (num%8==0){
            println(num)
        }
    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount( var accountNumber:String,var accountName:String,var balance:Double){
     fun deposit(amount:Double):Double{
         balance=+amount
         return balance
     }
    open fun withdraw(amount: Double):Double{
         balance-=amount
        return balance
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(accountNumber: String,accountName: String,balance: Double ,var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
    override fun withdraw(amount: Double): Double {

        if (withdrawals<4)
            withdrawals++
            return super.withdraw(amount)
        }
    }
}