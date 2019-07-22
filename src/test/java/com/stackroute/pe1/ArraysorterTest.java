package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysorterTest {
    Arraysorter arraysorter = new Arraysorter();

    @Before
    public void setUp() throws Exception {
        Arraysorter arraysorter1;
    }

    @After
    public void tearDown() throws Exception {
        arraysorter = null;
    }

    @Test
    public void inputDataSortsInDescendingOrder() {
        int[] data = {4, 2, 1, 3, 5};
        assertEquals(6, arraysorter.arraySort(5, data));
    }

    @Test
    public void inputDataSortsInDescendingOrderAndSums() {
        int[] data = {4, 2, 1, 3, 5, 4, 2, 7};
        assertEquals(12, arraysorter.arraySort(8, data));
    }
    @Test
    public void inputDataSortsInDescendingGivesZero() {
        assertEquals(0, arraysorter.arraySort(8,null));
    }
    @Test
    public void inputDataSortsInDescendingGivesNotNullOutput() {
        assertNotNull(arraysorter.arraySort(8,null));
    }
}


