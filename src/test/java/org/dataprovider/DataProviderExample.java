package org.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {


    @Test(dataProvider = "getData")
    public void test(String name, int age){
        System.out.println(String.valueOf(name)+String.valueOf(age));

    }


    @DataProvider
    public Object[][] getData(){

        Object[][] result={{"Raghu",10},{"Ram",15},{"Shalini",1},{"Sai",6}};
        return result;
    }
}
