package edu.zntu.projectm;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentAbout extends Fragment implements View.OnClickListener {
    private Button btn1;
    private TextView tv1;
    private FragmentCatalog fragmentCatalog;
    public FragmentAbout() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        btn1 = view.findViewById(R.id.btn1F1);
        btn1.setOnClickListener(this);
        fragmentCatalog = new FragmentCatalog();
        return view;
    }

    //Реалізація переходу до фрагменту "FragmentCatalog"
    @Override
    public void onClick(View view) {

        try{
            FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame1A1, fragmentCatalog);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}