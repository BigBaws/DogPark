package grp27.dogpark;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Header extends Fragment implements View.OnClickListener {

    public View onCreateView(LayoutInflater i, ViewGroup container, Bundle savedInstanceState) {

        View head = i.inflate(R.layout.fragment_header, container, false);

        return head;
    }

    @Override
    public void onClick(View v) {

    }
}
