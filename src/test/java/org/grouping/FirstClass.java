package org.grouping;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstClass {

    @Parameters({"URL","userName"})
    @Test(groups = {"Sanity","Smoke","Regressiom"})
    public void test1(String name,String grade){
        //
        System.out.println("name of the parameter:"+name);
        System.out.println("grade is:"+grade);
        System.out.println("This is test1");
    }

    @Test(groups = {"Regressiom"})
    public void test2(){
        System.out.println("This is test2");
    }

    @Test (groups = {"Sanity","Smoke"})
    public void test3(){
        System.out.println("This is test3");
    }

    @Test(groups = {"Smoke","Regressiom"})
    public void test4(){
        System.out.println("This is test4");
    }
    @Test(groups = {"Sanity","Regressiom"})
    public void test5(){
        System.out.println("This is test5");
    }

}
