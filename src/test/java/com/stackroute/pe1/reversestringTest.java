package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class reversestringTest {

    @Test
    public void givenStringShouldReturnReverseAsOutput() {
        //arrange
        reversestring g= new reversestring();
        //act
        String actualResult=g.reverse("rakesh");
        //assert
        assertEquals("hsekar",actualResult);
    }
    @Test
    public void givenStringAsNullShouldReturnErrorMessage() {

        //arrange
        reversestring g = new reversestring();
        //act
        String actualresult=g.reverse(null);
        //assert
        assertNotNull(actualresult);
        assertEquals("Should Not Be Null", actualresult);

    }


}