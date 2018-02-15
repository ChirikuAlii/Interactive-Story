package com.example.chirikualii.interactivestory.model;

/**
 * Created by chirikualii on 15/02/18.
 */

public class Choice {

    private int textId;
    private int nextPage;

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
