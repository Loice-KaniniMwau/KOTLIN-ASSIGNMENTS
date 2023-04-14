import java.lang.invoke.VarHandle
import kotlin.io.path.fileVisitor

fun main(){
   capital()
    mynames()
    identities("loice",20)
    ourname()
    counting()
    sortt()
    println(myvalue(98,63,71,45).contentToString())
    logic("loice kanini",60, foodweight = 4)
    identify()
    myNumbers()
    theLIST()
    var namess="wikipedia"
    println(namess[2])
    for (x in namess)
        println(x)
    println(namess.length)
   var namess2="wikipedia"
    if (namess==namess2)
        println("its possible")
    else{
        println("its not possible")
    }
    numberss("seven")
    myNum()
    myCountry()
    var name1=Human("phelisia","female","blue",5.67F,56)
    name1.rest()
    name1.myname()
    var book1=Book("Trevor Noah","Born a crime",600,2018)
    println(book1.author)
    library_user(mutableListOf(Libraby_system("river and the source")))

    library_user(mutableListOf(Libraby_system("Born a crime")))
    var final=remove_names(mutableListOf(Libraby_system("mshtahiki meya"), Libraby_system("betrayal in the city"),Libraby_system("" +
            "the cat and the rat")))
    listing(mutableListOf(Libraby_system("decolonizing the mind"),Libraby_system("the cat and the dog"),Libraby_system("" +
            "mary and the snake")))
    myarray("loice","kanini","mwau","machakos")
    mynumbers(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    three_names("mary","john","faith")
    cities(arrayOf("kenya","nairobi","kisumu"))
}
fun capital(){
    var finals=arrayOf("kigali","lesotho","namibia")
    for (x in finals)
        println(x.uppercase())
    finals.forEach { finals -> println(finals) }



//  )
//   var library2 =library_user(mutableListOf(Libraby_system("Decolonizing the mind")))
//  var library_records3=library_user(mutableListOf( Libraby_system("River and the source")))
//




//remove_names(mutableListOf(Libraby_system("the cat and the rat")))
//    v mutableListOf(book1,book2,book3)
//    println(final_books)


}
fun mynames(){
    var first= arrayOf("mary","joanne","jecinta","june")
    first.set(1,"kimani")
    println(first.contentToString())
    first[2]="kanini"
    println(first.contentToString())

}
fun identities(name:String,Age:Int){
    var myidentify= arrayOf("my name is $name and i am $Age ")
    println(myidentify.contentToString())

}
fun ourname(){
    var mynamess= "kanini"
    println("${mynamess[0]}${mynamess[1]}${mynamess[2]}")
}
fun counting() {
    var mynumbers = arrayOf(20, 45, 70, 57)
    var final = arrayOf(mynumbers[2], mynumbers[3])
    println(final.sum())
    var num=mynumbers[0]
    var num1= arrayOf(num.plus(mynumbers[1]))
    println(num1.sum())
    for (x in mynumbers)
        println(x * x)
    println(mynumbers.sort())
    println(mynumbers.contentToString())
    println(mynumbers.sortedArray().contentToString())
}
fun sortt(){
    var mysortt= arrayOf(76,68,90,12)
    println(mysortt.sortDescending())
    println(mysortt.contentToString())
   println(mysortt.sortedArrayDescending().contentToString())
    var myfinalss=(mysortt[0] + mysortt[1])
    println(myfinalss)
    for (x in mysortt)
        println(x)
    println(mysortt.sortedArray().contentToString())

}
fun myvalue(num1:Int,num2:Int,num3:Int,num4:Int):Array<Int> {
    var numBers= arrayOf(num1+num2)
    return numBers

}
fun logic(Name:String,weight:Int,foodweight:Int){
   println("My name is $Name and i weigh $weight and current foodweight is $foodweight")

}
fun identify(){
   var ide= arrayOf("kanini","mercy","faith")
    ide[0]="jecinta"
    println(ide[0])
    ide.set(1,"maryanne")
    println(ide[1])
    ide.get(1)
    println(ide[1])
    println(ide.contentToString())
    for (id in ide)
        println(id.plus("lucy").toString())
    var final=ide.plus(arrayOf("njoki","lucy","lucyanne"))
    println(final.contentToString())


}
//iteration
fun myNumbers(){
    var theList = listOf("one", "two", "three", "four")
    //prints the list
    theList.forEach { y -> theList }
    println(theList)
    //prints each element of the list
    for (x in theList)
        println(x)

}
fun theLIST(){
    var num1= arrayOf(20,73,94,23,12,3,65,47)
    var num2=num1.sum()
    println(num2)
  var num3= arrayOf(num1[1],num1[2])
    println(num3.sum())
}
//i)Create a string variable access the third character  then loop through it and print it
// in a vertical order.ii)
// get the length of the string iii) use an inbuilt function to the created string "its possible"
//3 Write a function that takes in a parameter, if seven it prints out neutral if not prints base otherwise acidic
fun numberss(num1:String) {

    var num2 = "seven"
    if (num1==num2){
        println("neutral")}
   else if(num1==num2)
       println("acidic")
       else{
           println("base")
    }
}
//Create a function that takes in an a array and find the largest number
fun myNum(){
    var mynum= arrayOf(20,59,98,75,43,67,2,19)
    println(mynum.max())
    println(mynum.sum())

}
//Create a function that prints this in grammatical order  var names= array of("anita"b,"
// adalab", "hopperlab", "rwanda", //"kenya", "tanzania"
fun myCountry(){
    var names= arrayOf("adalab", "hopperlab", "rwanda","kenya", "tanzania","anitab")
    println(names.sortedArray().contentToString())
    println(names.sortedArrayDescending().contentToString())
    println("${names[0].replaceFirstChar { "A" }},${names[1].replaceFirstChar { "H" }}")
}
//create a class called Human with the properties name gender color height and weight. i) create two functions one called rest and the other one identitiy.
// function rest prints out "sleep eight hours and   am female and my name is Phelisia."
class Human(var name:String,var gender:String,var color:String,var height:Float,var weight: Int){
    fun rest(){
println("i eat eight hours")
    }
    fun myname(){
println("I am $gender and my name is $name")
    }
}
//2. create a data class called book with properties author title pages published year
// create one object.
data class Book(var author:String,var title:String,var pages:Int,var publishedYear:Int){

}
//Project: Simple Library Management System
//The goal of this project is to create a Simple Library Management System
// that allows users to manage a collection of books by adding, removing, and
// listing them. You will be working with Kotlin concepts like variables, data types
// , arrays, array methods, strings, string methods, functions, and classes.
data class Libraby_system(var title:String){

}
fun library_user(names:MutableList<Libraby_system>) {

    names.addAll(mutableListOf(Libraby_system("Born a crime"),Libraby_system("A man in green Dungaree"),Libraby_system("Lost " +
            "in the forest")))
    println(names)
}


fun remove_names(removename: MutableList<Libraby_system>){
   removename.removeAt(2)
    println(removename)

}
fun listing(listMy_books:MutableList<Libraby_system>){
    listMy_books.forEach { item-> println(item.title) }
}
//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun myarray(name1:String,name2:String,name3:String,name4:String){
    var final= arrayOf("$name1,$name2,$name3,$name4")
   println(final.contentToString())
}
//Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order
fun mynumbers(nums:Array<Int>){
    var sums=nums[1].plus(nums[4])
    println(sums)
    var sum=0
    nums.forEach { item->sum+=item }
    println(sum)
    println(nums.indexOf(158))
    println(nums.sortedArray().contentToString())
}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun three_names(first:String,second:String,last: String){
    println(arrayOf(first,second,last).contentToString())
}
//Create a function that given an array below:
//
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
//tittlecasechar
fun cities(cities:Array<String>){
    cities.forEach { city-> println( city[0].titlecase()) }

}