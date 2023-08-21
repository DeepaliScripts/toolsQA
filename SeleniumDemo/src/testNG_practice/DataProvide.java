package testNG_practice;


import org.testng.annotations.Test;

public class DataProvide {

    // The data provider method returns a two-dimensional array of test data
    @Test(groups = "regression")
    public Object[][] provideTestData() {
        return new Object[][] {
            {"John", 25},
            {"Alice", 30},
            {"Bob", 22}
        };
    }

    // The test method uses the data from the data provider
    @Test(groups = "regression")
    public void testWithDataProvider(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}


