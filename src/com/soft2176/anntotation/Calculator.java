package com.soft2176.anntotation;

public class Calculator {
    @Check
    public void add(){
        String str=null;
        int length=str.length();
        System.out.println("1+0="+(1+0));
    }

    @Check
    public void sub(){
        System.out.println("1-0="+(1-0));
    }

    @Check
    public void div(){
        System.out.println("1/0="+(1/0));
    }

    @Check
    public void show(){
        System.out.println("永无bug...");
    }
}
