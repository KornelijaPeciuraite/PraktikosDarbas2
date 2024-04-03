package com.example.praktikosdarbas2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Given_EmptyText_getCharsCount_ZeroReturned() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_EmptyText_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "";
        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_NormalText_getCharsCount_CorrectValueReturned() {
        String givenString = "Laba diena";
        int expectedValue = 10;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_NormalText_getWordsCount_CorrectValueReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "Laba diena";
        int expectedValue = 2;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_OnlySpaces_getCharsCount_CorrectValueReturned() {
        String givenString = "     "; // 5 spaces
        int expectedValue = 5;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_OnlySpaces_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "     "; // 5 spaces
        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_SemicolonsAndSpaces_getCharsCount_CorrectValueReturned() {
        String givenString = ";; : ;;;;";
        int expectedValue = 9;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_SemicolonsAndSpaces_getWordsCount_ZeroReturned() {
        String givenString = ";; : ;;;;";
        int expectedValue = 0;
        TextCounter tc = new TextCounter();
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
}