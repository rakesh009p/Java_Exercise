package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class reversestringTest {

    @Test
    public  boolean isNullOrBlank(String s)
    {
        return (s==null || s.trim().equals(""));
    }
}