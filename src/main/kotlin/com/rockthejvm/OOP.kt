package org.example.com.rockthejvm

object OOP {
    //classes
    open class Pet {
        //property= piece of data
        val age= 0
        //function= piece of behaviour
        open fun eat(){ //now this function can be overridden in child classes
            println("I am eating something yummy")
        }
        companion object{
            //properties and methods of the Pet TYPE

            val humanLoveGuaranteed= true
            // "static" properties and methods
        }
    }
    val aPet= Pet() //instantiation= construction
    //^^ an instance of pet

    //inheritance
    class Dog(val name: String):Pet(){
        //additional properties, methods added on top of pet class since pet is now Open
        override fun eat(){
            println("I'm eating something, why are you starring at me?")
        }

    }
    val aDog= Dog("Tommy")
    // I can access aDog.name since constructor args are NOT properties. I would have to prefix them with a val or var to access them.

    //subtype polymorphism

    val myPet: Pet= Dog("Hachi")
    // abstract class
    abstract class WalkingPet {
        val hasLegs = true
        abstract fun walk(): Unit // may not necessarily have an implementation

    }
// interface
    interface Carnivore{
        fun eat(animal: Pet): Unit //all functions in interface are assumed to be abstract
    }

    interface ColdBlooded

    // inheritance model: a class can inherit from ONE class and >0 interfaces

    class Snake: Pet(), Carnivore, ColdBlooded{
        override fun eat(animal: Pet)= println("ssst, I'm swalllowing this poor sucker")
    }

    // access modifiers: protected, private
    // overloading
    // objects and companions
     object MySingleton{ //singleton pattern in one line= type + the only instance of that type

         //define properties/methods

         val aProperty= 42
        fun aMethod(arg:Int):Int{
            println("hello from singleton: $arg")
            return aProperty+arg
        }
     }
    //data classes (Java: records, Scala: case classes)

    data class Person(val name: String, val age: Int)// meant to be passed around and stored
    // equals, hashCode, toString
    // copy
    // destructuring

    //exceptions
    val maybeFailure= try{
        //code that can crash

        val language= "Kotlin"
        language.substring(10,20)

    } catch(e:Exception){
        "some faulty error message"
    } finally {
        //execute some code no matter what happens

    }
    //generics - Java, Scala, C#, TypeScript
    interface MyLinkedList<T>{
        // can use the type T inside the definitions of the methods/properties
        fun head(): T
        fun tail():MyLinkedList<T>
    }

    //real collections
    val numbers: List<Int> = listOf(1,2,3)
    val first= numbers[0]
    val strings= listOf("Kotlin","rocks")
    val firstStringLength= strings[0].length


        // ^^ an instance of Pet
        @JvmStatic
        fun main(args: Array<String>) {
        aPet.eat()
        aDog.eat()
            myPet.eat() //the eat() from Dog will be called at RUNTIME
        println(MySingleton.aProperty)
            println(MySingleton.aMethod(78))
            println(Pet.humanLoveGuaranteed)

            val bob= Person("Bob",32)
            val (name,age)= bob //destructing because we have a data class


        }


}