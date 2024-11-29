package com.mt.sample.test;

import com.mt.sample.HelloWorld;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for HelloWorld.
 */
public class HelloWorldTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloWorldTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(HelloWorldTest.class);
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp() {
        // Testing the HelloWorld message
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello, Welcome to FEWA IT Consulting!", hello.getMessage());
    }
}