package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class guessnumberTest {

    @Test

    public void givenAnIntegerShouldReturnString(){
        //arrange
        guessnumber c = new guessnumber();
        //act
        String actualResult=c.compareInt(34);
        //assert
        assertEquals("guessed properly",actualResult);



    }
}