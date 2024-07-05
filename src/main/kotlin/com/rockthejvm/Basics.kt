package org.example.com.rockthejvm

object Basics {
    @JvmStatic
    fun main(args: Array<String>) {
        val meaningOfLife= 42 // type inference
        val meaningOfLife_2: Int= 43 //val are not mutable

        var objectiveInLife = 32

        objectiveInLife= 45 // var can be changed

        val aString= "I love kotlin"
        val aChar= 'a'
        val aCombinedString= "I"+ " "+ "love kotlin"
        val aTemplate= "The meaning of life is $meaningOfLife"

        val aCondition= 1>2

        val anIfexpression= if(aCondition) 22 else 99 //this is an expression. Structures can be expressions.

        //switch on steroids

        when(meaningOfLife){
            42 -> println("meaning of life from HGG")
            else -> println("something else m8")

        }

        //evaluates to expression

        val whenExpression=  when(meaningOfLife){
            42 -> "meaning of life from HGG"
            else -> "something else m8"

        }

        //looping over inclusive range

        for(i in 1 .. 10){
            println(i)
        }
        //looping over collection

        val aList= listOf(3,6,9,12)
        for(item in aList){
            println(item)
        }
        var i=1

        while(i<=10){
            println(i)
            i=i+1
        }
        //counting backwards using do-while

        do{
            println(i)
            i-=1
        }while(i>0)

        fun concatenateString(aString:String, count: Int): String{
            var result= ""
            for(c in 1..count ){
                result+=aString
            }
            return result
        }

        //single expression function syntax
        fun combineStrings( strA: String, strB: String):String =
            "$strA----$strB"

        //unit= void in other langs

        fun functionReturnsnothing(arg:String): Unit{
            println("This returns nothing")
        }


    }
}