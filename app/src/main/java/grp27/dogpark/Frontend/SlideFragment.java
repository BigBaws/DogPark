package grp27.dogpark.Frontend;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.support.v4.app.FragmentManager;
import android.widget.TextView;

import grp27.dogpark.R;

public class SlideFragment extends android.support.v4.app.Fragment {
    int pos;

    public SlideFragment(int position){
        this.pos=position;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_slide, container, false);

        TextView cpage=(TextView)rootView.findViewById(R.id.txt1);
        cpage.setText("Hello World  " + this.pos );
        return rootView;
    }
}