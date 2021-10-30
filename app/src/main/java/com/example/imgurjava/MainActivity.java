package com.example.imgurjava;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.imgurjava.dataClass.ImgurApiResponse;
import com.example.imgurjava.network.ApiClient;
import com.example.imgurjava.network.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    List<String> list = new ArrayList<>();
    private SliderAdapter sliderAdapter;
    private Handler sliderHandler = new Handler();
    private ViewPager2 viewPager2;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.view_pager);
        progressBar = findViewById(R.id.bar);
        callApi();
    }

    private void sliderItems() {


        sliderAdapter = new SliderAdapter(this, viewPager2, list);
        viewPager2.setAdapter(sliderAdapter);

        progress();
        CompositePageTransformer comPosPageTrans = new CompositePageTransformer();
        comPosPageTrans.addTransformer(new MarginPageTransformer(40));
        comPosPageTrans.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
                progress();
            }
        });
        viewPager2.setPageTransformer(comPosPageTrans);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 5000);
            }
        });

    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };


    private void callApi() {

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<ImgurApiResponse> response = apiInterface.getList("Client-ID 546c25a59c58ad7");
        response.enqueue(new Callback<ImgurApiResponse>() {
            @Override
            public void onResponse(Call<ImgurApiResponse> call, Response<ImgurApiResponse> response) {
                if (response.body() != null) {
                    ImgurApiResponse imgurApiResponse = response.body();
                    int i;
                    for (i = 0; i < imgurApiResponse.getData().size(); i++) {
                        String a = imgurApiResponse.getData().get(i).getLink();
                        list.add(a);
                    }

                    sliderItems();
                    Toast.makeText(MainActivity.this, "" + list.size(), Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Empty List", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ImgurApiResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "" + t.getMessage().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void progress() {
        new CountDownTimer(5000, 100) {

            public void onTick(long millisUntilFinished) {
                float finishedSeconds = 5100 - millisUntilFinished;
                int total = (int) (finishedSeconds / 5100.0 * 100.0);
                progressBar.setProgress(total);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {

            }

        }.start();
    }
}



