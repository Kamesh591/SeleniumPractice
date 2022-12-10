package suitelevel;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteClasses {

    @BeforeSuite(alwaysRun = true)
    public  static void beforeSuite(){
        System.out.println("We load properties files and excel objectes etc");
    }

    @AfterSuite(alwaysRun = true)
    public static void afterSuite(){
        System.out.println("We will unable all the objects created above");
    }
}
