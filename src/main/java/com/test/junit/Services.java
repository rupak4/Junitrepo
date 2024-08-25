package com.test.junit;

public class Services {


 public static int addTwoNumbers(int a, int b) {
 return a + b;
}

    public static int productTwoNumbers(int a, int b ) {
        return a * b;
    }

    public static int devideTwoNumbers(int a, int b) {
     return a/b;
    }

    public static int sumAnyNumber(int ...numbers) {
        int sum = 0;
        for(int n:numbers) {
            sum = sum + n;
        }
        return sum;
    }


}
