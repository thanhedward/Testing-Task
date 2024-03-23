import static org.junit.Assert.*;

/*
* VIP, Male, true = 500
* VIP, Female, true = 550
* VIP, false  = 300
* Normal, Male, true = 250;
* Mormal, Femal, true = 300;
* Normal, false = 150
* None = 50
* */
public class TestCase{
    @org.junit.Test
    public void R1CustomerTestCase() {
        Customer customer = new Customer("VIP", "Male", true);
        assertEquals(500, customer.outputGift());
    }

    @org.junit.Test
    public void R2CustomerTestCase() {
        Customer customer = new Customer("VIP", "Female", true);
        assertEquals(550, customer.outputGift());
    }

    @org.junit.Test
    public void R3CustomerTestCase() {
        Customer customer = new Customer("VIP", false);
        assertEquals(300, customer.outputGift());
    }

    @org.junit.Test
    public void R4CustomerTestCase() {
        Customer customer = new Customer("Normal", "Male", true);
        assertEquals(250, customer.outputGift());
    }

    @org.junit.Test
    public void R5CustomerTestCase() {

    Customer customer = new Customer("Normal", "Female", true);
    assertEquals(300, customer.outputGift());
}
    @org.junit.Test
    public void R6CustomerTestCase() {
        Customer customer = new Customer("Normal", false);
        assertEquals(150, customer.outputGift());
    }

    @org.junit.Test
    public void R7CustomerTestCase() {
        Customer customer = new Customer("None");
        assertEquals(50, customer.outputGift());
    }
}