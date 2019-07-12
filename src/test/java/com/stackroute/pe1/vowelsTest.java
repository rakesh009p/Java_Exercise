package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class vowelsTest {

    @Test

        public void givenAStringShouldReturnVowelsAndConsonants () {
            //arrange

            //act
            String actualResult = vowels.vowelcons("rakesh");
            //assert
            assertEquals("rakesh", actualResult);

        }
    }
