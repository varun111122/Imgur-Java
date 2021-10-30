package com.example.imgurjava.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static String Base_Url = "https://api.imgur.com/3/gallery/r/pics/top/all/";


        private static Retrofit retrofit = null;

        public static Retrofit getClient() {
            final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .build();

            if (retrofit == null) {
                Gson gson = new GsonBuilder()
                        .setLenient()
                        .create();


                retrofit = new Retrofit.Builder()
                        .baseUrl(Base_Url)
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .client(okHttpClient).build();
            }
            return retrofit;
        }

}
