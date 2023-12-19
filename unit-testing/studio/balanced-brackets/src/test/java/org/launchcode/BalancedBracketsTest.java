package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here


    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void doesHaveDoubleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void doesSayLaunchcode() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stillBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void stillBalancedThisTime() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void hasOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void notBalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

//    @Test
//    public void isThisFalseToo() {
//        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
//    }

//    @Test
//    public void whatAboutThisOne() {
//        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
//    }

    @Test
    public void isEqual() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void notEqual() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void empty() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }



}