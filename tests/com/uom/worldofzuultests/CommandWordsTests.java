package com.uom.worldofzuultests;

import com.uom.worldofzuul.CommandWords;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CommandWordsTests {

    private static CommandWords commandWords;

    @BeforeClass
    public static void beforeAllTests() {
        commandWords = new CommandWords();
    }

    @AfterClass
    public static void afterAllTests() {
        commandWords = null;
        System.out.println("The Tests for CommandWords.class are completed!");
    }


    @Test
    public void isCommand_GetsValidCommand_ReturnsTrue() {
        assertTrue("User types go", commandWords.isCommand("go"));
    }

    @Test
    public void isCommand_GetsInvalidCommand_ReturnsFalse(){
        assertFalse("User types sit", commandWords.isCommand("sit"));
    }
}
