package grp27.dogpark;

import android.app.FragmentManager;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.MenuItem;

public class Main extends AppCompatActivity {

    public static String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            Fragment head = new Header();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_head, head)
                    .commit();
            Fragment newsfeed = new Newsfeed();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_body, newsfeed)
                    .commit();
            Fragment footer = new Footer();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_footer, footer)
                    .commit();
        }

    }


}