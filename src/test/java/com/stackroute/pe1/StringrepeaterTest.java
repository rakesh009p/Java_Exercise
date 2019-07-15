package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class StringrepeaterTest {

    Stringreverser stringreverser ;
    @Before
    public void setUp() {

        System.out.println("Inside Before");//arrange
        CapitalChecker capitalChecker=new CapitalChecker();

        this.stringreverser = new Stringreverser();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.stringreverser = new Stringreverser();
    }

    @BeforeClass
    public static void beforeClass() {

        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("After Class");
    }



    @Test
    public void main(){}
}