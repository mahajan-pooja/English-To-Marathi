package com.example.android.miwok;

/**
 * Contains english and marathi translation for each word.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //Constructor for color,family and number activity
    public Word(String defalutTranslation, String miwokTranslation){
        mDefaultTranslation = defalutTranslation;
                mMiwokTranslation = miwokTranslation;
    }

    //Constructor for phrase activity
    public Word(String defalutTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defalutTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //Get default translation of the word.
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get miwok translation of the word.
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){ return mImageResourceId; }

    //return whether there is  image for word or not.
    public boolean hasImmage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
