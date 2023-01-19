import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
   // println("Hello World!")

    val s = Scanner(System.`in`)
    println("Please enter the desired size of the array")
    val size = s.nextLine() // Reading input from STDIN
    var i = 0
   // val myArr = IntArray(size.toInt())
    val myarr2 = ArrayList<Int>(size.toInt())

    while(i < size.toInt() ){
         println("enter array value")
         val value = s.nextLine().toInt()
         myarr2.add(value)
         i++

     }

    println("which item do you want to replace?")
    val replacer:Int = s.nextInt()
    println("enter the value you want to replace $replacer with:")
    val replaced =s.nextInt()
    Collections.replaceAll(myarr2,replacer,replaced)
    println(" here is the replaced and sorted list list")
    println(myarr2.sorted())


}

/*
- take input and use it to set size of array
- loop through array and for each slot given for the defininition allow entry( cant do because array empty)
-
 */