package grp27.dogpark.Frontend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import grp27.dogpark.R;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == login) {
            Intent main = new Intent(Login.this, Main.class);
            startActivity(main);
            Login.this.finish();
        }
    }
}
