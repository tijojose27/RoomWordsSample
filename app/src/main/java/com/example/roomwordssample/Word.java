package com.example.roomwordssample;

import androidx.annotation.NonNull;
import androidx.room.Entity;

@Entity(tableName = "word_table")
public class Word {
    private String mWord;
    private Word(@NonNull String word){
        this.mWord = word;
    }

    public String getmWord() {
        return mWord;
    }
}
