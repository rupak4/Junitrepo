package com.test.junit;

import org.junit.jupiter.api.*;

public class ServiceTestJunit5 {

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("beforeEachTest");
    }

    @AfterEach
    public void afterEachTest(){
        System.out.println("afterEachTest");
    }

    @BeforeAll
    public static void init(){
        System.out.println("this is before class");
    }

    @Test
    public void addTwoNumberTest()
    {
        System.out.println("Add two number");
        int result = Services.addTwoNumbers(4,8);
        int expected = 12;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void sumAnyNumberTest(){

        System.out.println("sumAnyNumberTest");
        int result = Services.sumAnyNumber(1,2,3,4);
        int expected = 10;
        Assertions.assertEquals(expected,result);
    }

}
