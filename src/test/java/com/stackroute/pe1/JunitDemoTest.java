package com.stackroute.pe1;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.lang.*;

import static org.junit.Assert.*;

public class JunitDemoTest {

    JunitDemo junitDemo;

    @Before
    public void setup(){
        System.out.println("inside  Before");

        //arrange
        this.junitDemo=new JunitDemo();
    }

    @Test
    public void givenTwoStringsShouldReturnConcatedUpperCase() {
        //arrange

        //act
        String actualresult=junitDemo.concatAndUpperCase("hi","hello");
        //assert
        assertNotNull(actualresult);
        assertEquals("HIHELLO",actualresult);
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }
    @Test
        public void givenAStringAndNullShouldReturnErrorMessage(){
            //arrange
            JunitDemo junitDemo =new JunitDemo();
            //act
            String actualresult=junitDemo.concatAndUpperCase("hi",null);
            //assert
            assertNotNull(actualresult);
            assertEquals("null value is not allowed",actualresult);
        }
        @Test
        public void givenStingShouldReturnReverse(){
        //act
            String actualResult=junitDemo.reverseString("hello");
            //assert
            assertEquals("olleh",actualResult);
        }
        @Test
    public void givenNullShouldThrowNullPointException(){
        //act
            String actualResult=junitDemo.reverseString(null);

        }
    }
