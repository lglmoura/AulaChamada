package br.edu.iff.pooa20161.chamada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BemVindoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");
        String senha = args.getString("senha");

        TextView text = (TextView) findViewById(R.id.text);
        text.setText(nome + ", seja bem vindo. "+senha);

        // Adiciona o botão "up navigation"
        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
