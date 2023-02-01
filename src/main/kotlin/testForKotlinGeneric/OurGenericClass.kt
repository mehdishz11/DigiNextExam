package testForKotlinGeneric

import java.util.Objects

open class Base1{
    fun makeChangesOnBase1(){

    }
}
open class Base2 : Base1(){
    fun makeChangesOnBase2(){

    }
}
class MyGeneric<T>{

     fun testIn(value:T){

    }

}

fun mmmm(){
    val myGenericA : MyGeneric<String> = MyGeneric()
    val myGenericB : MyGeneric<out CharSequence> =myGenericA
}


class MyClass{
    private  val myNamr:String =""
    inline fun <reified T :Base1> myFunctionHere(
    clazz:Class<T>,
    list:List<Base1>,
    result: Base1.()->Unit
){}

    fun testIt(){

        myFunctionHere(
            Base2::class.java,
            listOf<Base2>()
        ) {

        }

        val a1:MyGeneric<out Base2> = MyGeneric<Base2>()
        //some changes 1 in feature 3
        //some changes 2 in feature 3
        //some changes 2 in feature 4
        //some changes 2 in feature 5
        //some changes 2 in feature 1
        //some changes 5 in feature 3



        val a2:MyGeneric<in Base2> = MyGeneric()
        a2.testIn(Base2())


        val a3:MyGeneric<Base2> = MyGeneric<Base2>()

        val sss : List<out Number> = listOf(
            1,5f,2L
        )

        val testList : ArrayList <out Number> = arrayListOf<Int>()
        testList.add(15)
        testList.add(15f)
        testList.add(15L)




    }

}
