package br.com.ifrs;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{
    private EditText nome;
    private EditText email;
    private EditText dataNasc;
    private Spinner spnEscolaridade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
            nome = findViewById(R.id.txtNome);
            email = findViewById(R.id.txtEmail);
            dataNasc = findViewById(R.id.txtDataNascimento);
            spnEscolaridade = findViewById(R.id.selectEscolaridade);
    }

    public void onClickBtnEnviar(View view){
        Intent intencao = new Intent(this, SecondActivity.class);
        intencao.putExtra("nome", nome.getText().toString());
        intencao.putExtra("email", email.getText().toString());
        intencao.putExtra("dataNasc", dataNasc.getText().toString());
        intencao.putExtra("escolaridade", spnEscolaridade.getSelectedItem().toString());

        Log.d("Valor do nome", nome.getText().toString());
        Log.d("Valor do email", email.getText().toString());
        Log.d("Valor do nascimento ", dataNasc.getText().toString());
        Log.d("Valor da escolaridade ", spnEscolaridade.getSelectedItem().toString());
        startActivity(intencao);
    }
}