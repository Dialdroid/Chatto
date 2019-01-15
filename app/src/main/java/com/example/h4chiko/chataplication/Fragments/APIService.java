package com.example.h4chiko.chataplication.Fragments;

import com.example.h4chiko.chataplication.Notifications.MyResponse;
import com.example.h4chiko.chataplication.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAABSuoSUA:APA91bGh-C7CBYl0OCesmkYHd6fmbWRraUKUkjWzCFL4W1Yp1DJVtHuEQb_W0Ehw78YDBhIxb5Fw5ieZH5O107PigCwF62rXR3nptld9C2JL3G7r96tA4-hu7xLlqAlUXsQ5Qx4lvN0a"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
