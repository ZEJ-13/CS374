package com.example.whowroteitloader;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import com.example.whowroteitloader.NetworkUtils;

public class BookLoader extends AsyncTaskLoader {
    private String mQueryString;
    @Nullable
    @Override
    public Object loadInBackground() {
        return NetworkUtils.getBookInfo(mQueryString);
    }
    public BookLoader(Context context, String queryString){
        super(context);
        mQueryString = queryString;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

}