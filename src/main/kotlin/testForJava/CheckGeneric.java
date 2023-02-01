package testForJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CheckGeneric<T> {

    T testUpper;

    public CheckGeneric(CheckGeneric<? extends T> parameter){

        testUpper=parameter.testUpper;
    }


    public static void main(String[] args){
        ArrayList<? super MyUpperGenericClass> downBounded=new ArrayList<MyCustomNumberClass>();

        /*downBounded.add(125);
        downBounded.add(new MyUperUperGenericClass());
        downBounded.add(new MyUpperGenericClass());
        downBounded.add(new MyCustomNumberClass());// not allow*/




    }

}
