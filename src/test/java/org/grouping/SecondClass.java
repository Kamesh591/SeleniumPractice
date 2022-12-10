package org.grouping;

import org.testng.annotations.Test;

public class SecondClass {

    @Test(groups = {"Sanity","Smoke","Regression"})
    public void secondtest1(){
        System.out.println("This is test12");
    }

    @Test(groups = {"Sanity","Smoke"})
    public void secondtest2(){
        System.out.println("This is test17");
    }

    @Test(groups = {"Sanity"})
    public void secondtest3(){
        System.out.println("This is test18");
    }

    @Test(groups = {"Sanity","Smoke","Regressiom"})
    public void secondtest4(){
        System.out.println("This is test19");
    }
    @Test(groups = {"Smoke","Regressiom"})
    public void secondtest5(){
        System.out.println("This is test20");
    }
}
