package com.openbox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     * VERY rigorous Test :-)
     */
    @Test
    public void shouldSayHelloWorld() {
        assertEquals("Hello World!", App.hello());
    }
}
