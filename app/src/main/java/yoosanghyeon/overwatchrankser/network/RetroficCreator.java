package yoosanghyeon.overwatchrankser.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import yoosanghyeon.overwatchrankser.constant.NetworkDefineConstant;

/**
 * Created by Arous on 2017-01-23.
 */

public class RetroficCreator {

    public static Retrofit createRetrofit() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().
                readTimeout(60, TimeUnit.MINUTES).
                connectTimeout(60, TimeUnit.MINUTES).
                addInterceptor(interceptor).build();

        return new Retrofit.Builder()
                .client(client)
                .baseUrl(NetworkDefineConstant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
}
