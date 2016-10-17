package id.sch.smktelkom_mlg.learn.magicweb;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class splashscreen extends AppCompatActivity
{
    public static int splashInterval=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent i = new Intent(splashscreen.this , MainActivity.class);
                startActivity(i);
                this.finish();

            }

            private void finish() {
            }

        } ,splashInterval);
    };
}
