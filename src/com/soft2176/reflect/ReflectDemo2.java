package com.soft2176.reflect;

import com.soft2176.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
//0.获取Person的CLass对象
        Class<Person> personClass = Person.class;
//1.FieLd[] getFieLds()获取所有pubLic修饰的成员变 量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==================");
//2.FieLd getField(String name )
        Field a = personClass.getField("a");
//获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
//设置a的p属性的值
        a.set(p, "张三");
        System.out.println(p);
        System.out.println("==================");

//Field[] getDeclaredFields(): 获取所有的成员变量，不考虑修饰符
        Field[] decLaredFields = personClass.getDeclaredFields();
        for (Field declaredField : decLaredFields) {
            System.out.println(declaredField);
        }
//Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
//忽略访问权限修饰符的安全检查一暴力反射
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);

    }

}
