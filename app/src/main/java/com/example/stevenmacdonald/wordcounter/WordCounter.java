package com.example.stevenmacdonald.wordcounter;

/**
 * Created by stevenmacdonald on 04/07/2017.
 */

public class WordCounter {

    String user_input;
    int counter = 0;

    public WordCounter(String user_input){
        this.user_input = user_input;

    }

    public String getUserinput() {
        return user_input;
    }

    public void setUserinput(String user_input) {
        this.user_input = user_input;
    }

    public int wordCount(String user_input){

        for(String word: user_input.split(" ") ) counter++;


        return counter;

    }
}
