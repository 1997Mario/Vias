package com.example.mariomarcillo.vias.api;

import com.example.mariomarcillo.vias.Vias;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ViasService {

    @GET("qvqk-dtmf.json")
    Call<ArrayList<Vias>> obtenerLista();
}
