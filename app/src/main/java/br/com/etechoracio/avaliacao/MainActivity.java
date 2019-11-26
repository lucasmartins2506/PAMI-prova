package br.com.etechoracio.avaliacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {
     EditText editNum1;
     EditText editNum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNum1 = findViewById(R.id.editNum1);
        editNum2 = findViewById(R.id.editNum2);
    }
    public void onProcessar(View view) {
        double num1 = Double.parseDouble(editNum1.getText().toString());
        double num2 = Double.parseDouble(editNum2.getText().toString());
    }
    private ProjetoAPIService service;{
        this.service = new Retrofit.Builder().baseUrl("http://172.16.58.22:8001/api/funcoes/quadrado/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
                .create(ProjetoAPIService.class);
    }
}



