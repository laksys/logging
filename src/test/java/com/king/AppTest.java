package com.king;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void num1Test() {
        Assert.assertEquals(13, App.add(8,5));
    }

    @Test
    public void num2Test() {
        Assert.assertEquals( 10, App.add(5,5));
    }
}
