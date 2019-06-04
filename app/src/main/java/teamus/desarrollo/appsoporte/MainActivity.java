package teamus.desarrollo.appsoporte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Solicitudes(View view)
    {

        Intent intent = new Intent(this,SolicitudActivity.class);
        startActivity(intent);
    }

}
