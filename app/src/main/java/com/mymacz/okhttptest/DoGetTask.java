package com.mymacz.okhttptest;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;

/**
 * Created by mynameismaxz on 11/2/2015 AD.
 */
public class DoGetTask extends AsyncTask<String,Void,String> {
    @Override
    protected String doInBackground(String... params) {
        WebClient webClient = new WebClient();
        String getRes = null;
        try {
            getRes = webClient.doGetReq(params[0]);
            Log.d("TestLog",getRes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return getRes;
    }

    @Override
    protected void onPostExecute(String s) {
        Log.d("TestLog",s);
    }
}
