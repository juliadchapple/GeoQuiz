package com.bignerdranch.geoquiz;

/**
 * Created by jchapple on 5/12/14.
 */
public class TrueFalse {

    private int mQuestion;

    private boolean mTrueQuestion;

    private boolean mHasCheated;

    public boolean isHasCheated() {
        return mHasCheated;
    }

    public void setHasCheated(boolean hasCheated) {

        mHasCheated = hasCheated;
    }

    public TrueFalse(int question, boolean trueQuestion) {
        this.mQuestion = question;
        this.mTrueQuestion = trueQuestion;
        mHasCheated = false;

    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }
}
