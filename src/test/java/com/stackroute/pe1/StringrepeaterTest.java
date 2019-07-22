package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class StringrepeaterTest {

    Stringrepeater stringrepeater ;
    @Before
    public void setUp() {

        System.out.println("Inside Before");//arrange
        CapitalChecker capitalChecker=new CapitalChecker();

        this.stringrepeater = new Stringrepeater();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.stringrepeater = new Stringrepeater();
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
    public void inputStringConcateItself() {
        assertEquals("Stackrouteouteouteouteoute",stringrepeater.concateString(4,"Stackroute"));
    }
    @Test
    public void inputStringConcateItselfAndReturn() {
        assertEquals("rakeshesheshesh", stringrepeater.concateString(3,"rakesh"));
    }

    @Test
    public void inputStringWillReturnNotEqual() {
        assertNotEquals("rak", stringrepeater.concateString(3,"rak"));
    }
}