package com.soft2176.junit;

class CalculatorTest1 {
    public static void main(String[] args) {
        Calculator c=new Calculator();

        int result =c.add(2,3);
        System.out.println(result);
        int result2=c.sub(6,2);
        System.out.println(result2);
    }
}
