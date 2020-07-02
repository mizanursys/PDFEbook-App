package com.divinetechs.ebooksapp.Webservice;


import org.apache.http.conn.ssl.SSLSocketFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseURL {

    public static final String BASE_URL = "https://www.yourdomain.com/ebook/";

    public static final String BASE_URL_API = BASE_URL + "index.php/api/";
    public static final String Image_URL = BASE_URL + "assets/images/app/";
    public static final String pdf_URL = BASE_URL + "assets/images/book/";




}
