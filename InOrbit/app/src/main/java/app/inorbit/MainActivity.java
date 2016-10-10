package app.inorbit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.UnsupportedEncodingException;

import app.inorbit.ApiServices.Endpoints;
import app.inorbit.ApiServices.TempTwitterClass;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a Client & Interceptor, pass it to api call methods in Endpoints
        OkHttpClient client = Endpoints.createClient();


        try {
            TempTwitterClass.connectTwitter(client,this);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }



        /*        THE FOLLOWING ENDPOINTS WORK:
        APOD, NYT, Guardian, LaunchLibrary, Where is the ISS       */

//        Endpoints.connectFlickr(client);



    }
}
