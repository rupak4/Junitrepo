package com.test.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExample {

    //Assertion - validate actual result with expected result
    @Test
    public void test1(){
        System.out.println("Assertion test");
        int Actual = 12;
        int Expected = 12;
        Assertions.assertEquals(Actual, Expected);
        int actualarray[] = {1,2,3,4,5};
        int expectedArray[] = {1,2,3,4,5};
        Assertions.assertArrayEquals(actualarray, expectedArray, "array asserted");

        String actualobject = new String("testobject");
        String expectedlobject = new String("testobject");

        //Check object refrences
        Assertions.assertSame(actualobject,expectedlobject);

        //Check object values
        Assertions.assertEquals(actualobject.length(),actualarray.length);

    }


}
