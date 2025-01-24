import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG {
    
    @BeforeClass
    public void setUp(){
        System.out.println("Ini adalah setup");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Ini adalah setup method");
    }

    @BeforeTest
    public void setUpTest(){
        System.out.println("Ini adalah setup test");
    }

    
    @Test
    public void Test1(){
        System.out.println("Ini adalah test 1");
        System.out.println("Thread 1 : "+ Thread.currentThread().getId());
        Assert.assertEquals(2, 2);
    }

    @Test
    public void Test2(){
        System.out.println("Thread 2 : "+ Thread.currentThread().getId());
        System.out.println("Ini adalah test 1");
    }

    @Test
    public void Test3(){
        System.out.println("Thread 3 : "+ Thread.currentThread().getId());
        System.out.println("Ini adalah test 3");
    }

    @DataProvider(name = "testData")
    public Object[][] dataProvider() {
        return new Object[][] {
            { 1, 2 },
            { 3, 4 }
        };
    }

    @Test(dataProvider = "testData")
    public void testMethod(int a, int b) {
        System.out.println("Test with: " + a + " and " + b);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }
}
