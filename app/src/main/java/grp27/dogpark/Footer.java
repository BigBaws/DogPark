package grp27.dogpark;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

public class Footer extends Fragment implements View.OnClickListener {

    public View onCreateView(LayoutInflater i, ViewGroup container, Bundle savedInstanceState) {
        View footer = i.inflate(R.layout.fragment_footer, container, false);
        return footer;
    }

    @Override
    public void onClick(View v) {

    }
}
