package com.cotrust.myapplication;

import android.app.Application;
import android.test.ApplicationTestCase;

import junit.framework.Assert;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application>
{
    public ApplicationTest()
    {
        super(Application.class);
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
}