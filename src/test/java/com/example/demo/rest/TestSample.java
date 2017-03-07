package com.example.demo.rest;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestSample {

    @Test
    public void testSample(){
        assertEquals("is testing running","is testing running");
    }

    @Test
    public void testSampleFalse(){
        assertEquals("is testing wrong","is testing running");
    }

}
