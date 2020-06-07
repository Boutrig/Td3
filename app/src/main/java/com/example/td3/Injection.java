package com.example.td3;

import com.example.td3.data.PokeAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Injection {

    private static Gson gsonInstance;
    private static PokeAPI pokeAPIInstance;



    public static Gson getGson(){

        if (gsonInstance == null){
            gsonInstance = new GsonBuilder().setLenient().create();
        }
        return gsonInstance;

    }


    public static PokeAPI getPokeAPI(){

        if (pokeAPIInstance == null){

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(getGson()))
                    .build();

            pokeAPIInstance = retrofit.create(PokeAPI.class);

        }
        return pokeAPIInstance;
    }
}


