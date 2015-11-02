package com.mymacz.okhttptest;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by mynameismaxz on 11/2/2015 AD.
 */
public class WebClient {
    private OkHttpClient client;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public WebClient() {
        client = new OkHttpClient();
    }

    // TODO ; Request getting method if you're want to using services
    public String doGetReq(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();

        Response res = client.newCall(request).execute();
        return res.body().string();
    }
}
