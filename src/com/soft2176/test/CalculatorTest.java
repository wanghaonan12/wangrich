package com.soft2176.test;

import com.soft2176.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void AddTest(){
        System.out.println("我被执行了...");
        System.out.println("testAdd");
        Calculator c=new Calculator();
         int result=c.add(1,3);
        System.out.println(result);
        Assert.assertEquals(4,result);
    }

    @Test
    public void SubTest(){
        System.out.println("我被执行了...");
        System.out.println("testSub");
        Calculator c=new Calculator();
        int result=c.sub(6,3);
        System.out.println(result);
        Assert.assertEquals(3,result);
    }
    @Test
    public void init(){
        System.out.println("init....");
    }
    @Test
    public void close(){
        System.out.println("close...");
    }
}
