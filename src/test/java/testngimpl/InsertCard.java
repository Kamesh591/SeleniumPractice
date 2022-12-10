package testngimpl;

import org.testng.annotations.Test;

public class InsertCard {

    @Test
    public void insertCard() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("User inserted the card");
    }
}
