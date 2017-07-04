package com.example.stevenmacdonald.wordcounter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class WordCounterTest {

    WordCounter user_input;

    @Before
    public void before(){
        user_input = new WordCounter("testing this is working");
    }


    @Test
    public void checkingSetup(){
        assertEquals("testing this is working", user_input.getUserinput());
    }

    @Test
    public void checkingSetTheUserInput(){
        user_input.setUserinput("checking its all working as expected");
        assertEquals("checking its all working as expected", user_input.getUserinput());
    }

    @Test
    public void checkingWordCount(){
        assertEquals(4, user_input.wordCount(user_input.getUserinput()));
    }
}
