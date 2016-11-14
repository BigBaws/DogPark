package grp27.dogpark.Frontend;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import grp27.dogpark.R;

public class Newsfeed extends Fragment implements View.OnClickListener {

    int pos;

    public Newsfeed(int position){
        this.pos=position;
    }

    @Override
    public View onCreateView(LayoutInflater i, ViewGroup container, Bundle savedInstanceState) {
        View newsfeed = i.inflate(R.layout.fragment_newsfeed, container, false);

        ViewGroup rootView = (ViewGroup) i.inflate(R.layout.fragment_newsfeed, container, false);

            TextView cpage=(TextView)rootView.findViewById(R.id.txt1);
            cpage.setText("Hello World  " + this.pos );
            return rootView;

        /* Set Username */

        /* Set Level */
    }

    @Override
    public void onClick(View v) {

    }
}
