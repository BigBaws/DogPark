package grp27.dogpark.Frontend;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import grp27.dogpark.R;

public class Newsfeed extends Fragment implements View.OnClickListener {

    public View onCreateView(LayoutInflater i, ViewGroup container, Bundle savedInstanceState) {

        View newsfeed = i.inflate(R.layout.fragment_newsfeed, container, false);

        /* Set Username */

        /* Set Level */
        return newsfeed;
    }

    @Override
    public void onClick(View v) {

    }
}
