package com.example.td3.data;

import com.example.td3.presentation.model.RestPokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeAPI {


    @GET("/api/v2/pokemon/")
    Call<RestPokemonResponse> getPokemonResponse();
}
