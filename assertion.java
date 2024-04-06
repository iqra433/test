package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {
    @Test
    public void testAddition() {
        int a = 5;
        int b = 7;
        int result = a + b;

        // Assert that the result of addition is equal to 12
        Assert.assertEquals(result, 12, "Addition result is not as expected");
    }

    @Test
    public void testStringLength() {
        String str = "TestNG";

        // Assert that the length of the string is 6
        Assert.assertEquals(str.length(), 6, "Length of string is not as expected");
    }
}
