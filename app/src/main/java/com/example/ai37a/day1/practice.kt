package com.example.ai37a.day1

import android.app.TaskInfo

fun main() {
    //mutable------------------------------------------
    //values can be reassigned to the variables
    //var age:Int=15
    //age=5

    //immutable-------------------------------------
    //values cannot be reassigned
    //val age2:Int=10
    //age2=3 -> error because not mutable !!!!!!!!!!!!!!!!!!!!!!!!!!

    //Between val and var using val is better
    //with var accidental reassignments can happen
    //with val accidents are removed can rest assured

    //-----------------------------------------------------------------
    //data types

//    var a:Int=420003
//    var b:Float=2.32F
//    var c:Char='R'
//    var d:Boolean=true
//
//    println(a)
//    println(b)
//    println(c)
//    println(d)

    //-------------------------------------------------------------------
    //conversion

//    var abc:Float=423.23F
//    var bcd:Int=abc.toInt()
//    println(abc)
//    println(bcd)

    //-------------------------------------------------------------------
    //string operations

//    var s:String="Helloooo"
//    var l:Int=s.length
//    var school:String="   abc boarding school"
//
//    println(school.trim())
//    println(s)
//    println(l)
//    println(s.lowercase())
//    println(s.uppercase())

    //------------------------------------------------------------------
    //arrays

//    var newvar = arrayOf(1,2,3,4,5)
//    println(newvar)
//    println("first - ${newvar[0]}, second - ${newvar[1]} and last - ${newvar[4]}")
//
//    println(newvar.size)

    //------------------------------------------------------------------
    //arraylist

////Method 1
//    var a1=ArrayList<Int>()
//    a1.add(1)
//    a1.add(1,3)
//    a1.add(2)
//    a1.add(3,5)
//    println(a1)
////Method 2
//    var a2=arrayListOf<Int>(1,5,7,2,4,9,2)
//    println(a2)
//    var namelist=arrayListOf<String>("hari","shyam","Hari")
//    println(namelist)
//    namelist.add(3,"sita")
//    println(namelist)
//    namelist.remove("hari")
//    println(namelist)
//    namelist.removeAt(2)
//    println(namelist)
//
////ArrayList with a mix of datatypes
//    var mixedArrayList=arrayListOf<Any>('a',"abc",2,3,4.5,2.34F)
//    println(mixedArrayList)

    //----------------------------------------------------------------
    //List

//    val listofnumbers=listOf("one","Two","Three","Four")
//    println("Number of elements is ${listofnumbers.size}")
//    println("second element is ${listofnumbers[1]}")
//
//    //Immutable list
//
//    val lst1=listOf("one","two","three")
//    println("Immutable list")
//    for(i in lst1.indices){
//        println(lst1[i])
//    }
//
//    //Mutable List
//
//    val mutablelst=mutableListOf("one","two","three")
//    mutablelst.add("four")
//    println("Mutable list")
//    for(i in mutablelst.indices){
//        println(mutablelst[i])
//    }

    //------------------------------------------------------------
    //sets

//    val set1=setOf(1,2,3,4,5)
//    for(elements in set1){
//        println(elements)
//    }
    //    for(k in set1.indices){
    //        println(set1[k])
    //    } !!!!!!!!!!!!!!!!!!!error

    //------------------------------------------------------------
    //Maps
    //Dictionaries in kotlin are maps

    //immutable when mapOf, mutable when mutablemapOf

//    val countrymaps=mapOf(
//        "Nepal" to "Kathmandu",
//        "china" to "Baijing"
//        )
//
//    println("Keys:${countrymaps.keys}")
//    println("values:${countrymaps.values}")

    //------------------------------------------------------------
    //Task

//    val dict = mapOf(
//        "sophisticated" to "difficult to understand",
//        "glow" to "bright and luminiscent",
//        "breeze" to "a strong gust of wind",
//        "crave" to "a strong urge to"
//    )
//
//    while (true) {
//        println("Available words in dictionary ")
//        println("[sophisticated],[glow],[breeze],[crave]")
//        println("Enter a word: ")
//        val input: String = readln().trim().lowercase()
//
//        if (dict[input] == null) { //error handling for word out of dict
//            println("Word '$input' not found in dictionary")
//        } else {
//            println(dict[input])
//        }
//
//        println("Press 0 to Quit, Enter 1 to continue : ")
//        //var input2: Int = readln().toInt()
//
//        var input2: Int = readln().toIntOrNull() ?: 1
//        //toIntOrNull is used incase user enters something except 0 or 1
//        //If user enters 'abc' converts anything except Int to Null
//        //if null value is received ?:1 changes it to 1
//
//        if (input2 == 0) {
//            println("exiting")
//            break //exits out of program
//            //while loops condition is deferred so exit
//            //while(true) creates infinite loop
//        }
//    }

    //----------------------------------------------------------------
    //operators
    // + - * / % are just the same as other languages
    // assignment operators are also the same
    //unary operators are also the same

//    var number: Double = 7.6
//    var isCheck: Boolean = true;
//    println("+number = ${+number}" ); //just the sign
//    println("-number = ${-number}" ); //just the sign
//    println("++number = ${++number}" ); //operator
//    println(" -- number = ${ -- number}" ); //operator
//    println("!isCheck = ${!isCheck}" );
//    println("--------------------------------")
//        var result: Double = 4.7
//    println("result :$result")
////when the result++ is executed, the original value is evaluated first
////and value of result is increased only after that
//    println("result++:" + result++)

    //-----------------------------------------------------------------------
    // I N P U T      I N     K O T L I N

//  print("Enter Name :: ")
//  var nem:String = readln().trim().lowercase()
//
//  print("Enter age :: ")
//  var aeg:Int=readln().toInt() //simple but can crash
//
//  var aeg2:Int=readln()!!.toInt() //insets non-null assertion with !!
//
//  var aeg3:Int=readln().toIntOrNull()?:1 //different way of handling non int values


    //----------------------------------------------------------------------

    //Control Statements

    //  if() {
    //  }else{
    //  }

    // when(days)
    //  {
    // 1-> day="Sunday"
    // ...
    // else-> day="Invalid day choice"
    // }

    // for (i in 0..10)
    // {
    // }

    //for (i in 1..10) ::: 1 <= i <= 10
    //for (i in 1 until 10)  ::: 1 <= i < 10
    //for (i in 10 downTo 1) ::: 10>= i >= 1

    //---------------------------------------------------------------------
    // F U N C T I O N S
//    fun subNumber(x:Int,y:Int):Unit{} //Unit is void returntype
//    fun addNumber (x:Int, y:Int):Int{ //Int is returntype
//
//     var sum=0
//     sum=x+y
//    return sum
//}
//    var result=0;
//    result=addNumber(10,20)
//    println(result)




}