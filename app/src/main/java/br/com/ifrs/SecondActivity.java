package br.com.ifrs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        Intent intencao = getIntent();

        String nome = intencao.getStringExtra("nome");
        String email = intencao.getStringExtra("email");
        String dtNasc = intencao.getStringExtra("dataNasc");
        String escolaridade = intencao.getStringExtra("escolaridade");

        TextView txtNomeEnviado = findViewById(R.id.txtNomeView);
        TextView txtEmailEnviado = findViewById(R.id.textEmailView);
        TextView txtDtNascEnviado = findViewById(R.id.textDataNascView);
        TextView txtEscolaridadeEnviada = findViewById(R.id.textEscolaridadeView);

        // setters
        txtNomeEnviado.setText(nome);
        txtEmailEnviado.setText(email);
        txtDtNascEnviado.setText(dtNasc);
        txtEscolaridadeEnviada.setText(escolaridade);

    }
}