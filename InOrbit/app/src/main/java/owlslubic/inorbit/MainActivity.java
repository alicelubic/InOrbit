package owlslubic.inorbit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import owlslubic.inorbit.ApiServices.Endpoints;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** hi sunil */

        Endpoints.connectAPOD();


    }
}
