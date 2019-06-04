package teamus.desarrollo.appsoporte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import  android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Verificar(View view) {

        EditText Usuario = (EditText) findViewById(R.id.editText_usuario);
        EditText Contraseña = (EditText) findViewById(R.id.editText_Pass);
        TextView alarma = (TextView) findViewById(R.id.textViewAlert);
        if (Usuario.getText().toString().equals("javier_jfo@hotmail.com")) {
            if (Contraseña.getText().toString().equals("123")) {
                Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            } else {
                alarma.setText("password Incorrecto");
                alarma.setVisibility(View.VISIBLE);
            }
        } else {
            alarma.setText("Usuario Incorrecto");
            alarma.setVisibility(View.VISIBLE);
        }
    }

    public void Registrar(View view)
    {
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }
}

