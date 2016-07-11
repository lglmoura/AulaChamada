package br.edu.iff.pooa20161.chamada;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(onClickLogin());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private View.OnClickListener onClickLogin() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView)
                        findViewById(R.id.tLogin);
                TextView tSenha = (TextView)
                        findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if("luiz".equals(login) && "123456".equals(senha)) {
                    // Navega para a próxima tela

                    Intent intent = new Intent(getContext(),BemVindoActivity.class);
                    Bundle params = new Bundle();
                    params.putString("nome", login);
                    params.putString("senha",senha);
                    intent.putExtras(params);
                    startActivity(intent);
                } else {
                    alert("Login e senha incorretos.");
                }
            }
        };
    }

    private Context getContext() {


        return this;
    }


    private void alert(String s) {

        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            // Clicou no botão settings da action bar (o toast é um breve alerta que vai sumir)
            Toast.makeText(this,"Clicou no settings",Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
