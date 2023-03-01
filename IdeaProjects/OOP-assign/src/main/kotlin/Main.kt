fun main() {
    val identity=Human("loice",23,56)
    identity.eat(5)
    identity.speak("that's her")
    identity.birthday()
 var theUser=User("mary","kamau","mwauloice@gmail.com","+254707562960","mary2023")
println(theUser.phoneNumber)
    println(theUser.email)

}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int) {
   println("I am eating $foodweight kgs of food")
        weight +=foodweight
        println(weight)

    }
    fun speak(speech:String){
        println(speech)


    }
    fun birthday(){
        ++age
        println(age)
    }
}
data class User(var firstName:String,var lastName:String,val email:String,var phoneNumber:String,var password:String){

}