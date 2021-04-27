package com.example.application_vente.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Liste_BoutiquesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Liste_BoutiquesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}