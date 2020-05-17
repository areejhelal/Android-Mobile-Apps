package com.example.android.miwok;

/**
 * Created by Areej_Helal on 4/1/2018.
 */

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

            /** Miwok translation for the word */
            private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

           /** Constant value that represents no image was provided for this word */
           private static final int NO_IMAGE_PROVIDED = -1;

           private int mAudioResourceId;
            /**
             *
 +     * Create a new Word object.
 +     *
 +     * @param defaultTranslation is the word in a language that the user is already familiar with
 +     *                           (such as English)
 +     * @param miwokTranslation is the word in the Miwok language
 +     */
            public Word(String defaultTranslation, String miwokTranslation, int audioResourceId ) {
                mDefaultTranslation = defaultTranslation;
                mMiwokTranslation = miwokTranslation;
                mAudioResourceId = audioResourceId ;
            }
            /*
 +     * Create a new Word object.
            +     *
            +     * @param defaultTranslation is the word in a language that the user is already familiar with
 +     *                           (such as English)
            +     * @param miwokTranslation is the word in the Miwok language
            +     * @param imageResourceId is the drawable resource ID for the image associated with the word
            * @param audioResourceId is the resource ID for the audio file associated with this word
 +     */
    public Word(String defaultTranslation, String miwokTranslation , int imageResourceId , int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }



            /**
             *
 +     * Get the default translation of the word.
 +     */
            public String getDefaultTranslation() {
                return mDefaultTranslation;
          }

           /**
 +     * Get the Miwok translation of the word.
 +     */
            public String getMiwokTranslation() {
                return mMiwokTranslation;
           }

            public int getImageResourceId() {
               return mImageResourceId;
           }


    /**
                * Returns whether or not there is an image for this word.
               */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
            }

            public int getAudioResourceId(){
        return mAudioResourceId;
            }



}
