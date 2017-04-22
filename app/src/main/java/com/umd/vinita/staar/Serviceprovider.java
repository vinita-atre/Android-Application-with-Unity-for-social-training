package com.umd.vinita.staar;

/**
 * Created by Vinita on 3/1/2017.
 */

import com.umd.vinita.staar.Service.ProductService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Serviceprovider {

    private Serviceprovider(){}

    public static ProductService provideProductService(){

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.zappos.com/")
                .build();

        return retrofit.create(ProductService.class);

    }


}