package com.example.app;

import android.test.AndroidTestCase;

import junit.framework.Assert;


public class MySecondTest extends AndroidTestCase
{

    @Override
    public void setUp() throws Exception
    {
        super.setUp();
    }

    public void testAPI1() throws Exception
    {
        Assert.assertTrue(true);
    }

    public void testAPI2() throws Exception
    {
        //Should fail here

        Assert.assertTrue(false);

    }

    public void testAPI3() throws Exception
    {
        Assert.assertTrue(true);
    }

    public void testAPI4() throws Exception
    {
        Assert.assertTrue(true);
    }

    public void testAPI5() throws Exception
    {
        Assert.assertTrue(false);
    }

    @Override
    public void tearDown() throws Exception
    {
        super.tearDown();
    }
}