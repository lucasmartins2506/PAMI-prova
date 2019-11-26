package br.com.etechoracio.avaliacao;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProjetoAPIService {

    @GET(".")
    Call<String> Quadrado(@Path("num") String num);
}
