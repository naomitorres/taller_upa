package com.example.myapplication.data.remote.client
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object ServiceGenerator {

    private var BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=" // IP Local

    private val builder = Retrofit.Builder()
        .addCallAdapterFactory(RxJavaCallAdapterFactory.createAsync())
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().serializeNulls().setDateFormat("yyyy-MM-dd-'T'HH:mm:ssZZZ").create()))

    private val logging = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)


    private var retrofit: Retrofit? = null

    fun <S> createService(serviceClass: Class<S>): S {
        val httpClient = OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)

        httpClient.addNetworkInterceptor(logging)
        if (retrofit == null) {
            retrofit = builder.client(httpClient.build()).build()
        }
        return retrofit!!.create(serviceClass)
    }


}
