package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class evenoddTest {

    @Test
    public void givenAnIntegerShouldReturnStringValue(){

            //arrange
            evenodd next = new evenodd();
            //act
            int actualResult=next.compareeven(26);
            //assert
            assertEquals(26,actualResult);
    }


}