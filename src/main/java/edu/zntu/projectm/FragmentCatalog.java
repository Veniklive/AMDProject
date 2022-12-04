package edu.zntu.projectm;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FragmentCatalog extends Fragment implements View.OnClickListener {
    private TextView tv;
    private FragmentMythycal fragmentMythycal;
    private LinearLayout ll1;
    private LinearLayout ll2;
    private LinearLayout ll3;
    private LinearLayout ll4;
    private LinearLayout ll5;
    private LinearLayout ll6;
    private LinearLayout ll7;
    private LinearLayout ll8;
    private LinearLayout ll9;
    private LinearLayout ll10;
    private LinearLayout ll11;
    private LinearLayout ll12;
    private LinearLayout ll13;
    private LinearLayout ll14;
    private LinearLayout ll15;
    private LinearLayout ll16;
    private LinearLayout ll17;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_catalog, container, false);
        tv = view.findViewById(R.id.tv1FM);
        fragmentMythycal = new FragmentMythycal();

            ll1 = view.findViewById(R.id.Layout1);
            ll2 = view.findViewById(R.id.Layout2);
            ll3 = view.findViewById(R.id.Layout3);
            ll4 = view.findViewById(R.id.Layout4);
            ll5 = view.findViewById(R.id.Layout5);
            ll6 = view.findViewById(R.id.Layout6);
            ll7 = view.findViewById(R.id.Layout7);
            ll8 = view.findViewById(R.id.Layout8);
            ll9 = view.findViewById(R.id.Layout9);
            ll10 = view.findViewById(R.id.Layout10);
            ll11 = view.findViewById(R.id.Layout11);
            ll12 = view.findViewById(R.id.Layout12);
            ll13 = view.findViewById(R.id.Layout13);
            ll14 = view.findViewById(R.id.Layout14);
            ll15 = view.findViewById(R.id.Layout15);
            ll16 = view.findViewById(R.id.Layout16);
            ll17 = view.findViewById(R.id.Layout17);

            ll1.setOnClickListener(this);
            ll2.setOnClickListener(this);
            ll3.setOnClickListener(this);
            ll4.setOnClickListener(this);
            ll5.setOnClickListener(this);
            ll6.setOnClickListener(this);
            ll7.setOnClickListener(this);
            ll8.setOnClickListener(this);
            ll9.setOnClickListener(this);
            ll10.setOnClickListener(this);
            ll11.setOnClickListener(this);
            ll12.setOnClickListener(this);
            ll13.setOnClickListener(this);
            ll14.setOnClickListener(this);
            ll15.setOnClickListener(this);
            ll16.setOnClickListener(this);
            ll17.setOnClickListener(this);

        return view;
    }

    public void transitionFragment(){
        try{
            FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame1A1, fragmentMythycal);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Layout1:transitionFragment();fragmentMythycal.nameMythycal="Кентаври";break;
            case R.id.Layout2:transitionFragment();fragmentMythycal.nameMythycal="Цербер";break;
            case R.id.Layout3:transitionFragment();fragmentMythycal.nameMythycal="Харибда";break;
            case R.id.Layout4:transitionFragment();fragmentMythycal.nameMythycal="Химера";break;
            case R.id.Layout5:transitionFragment();fragmentMythycal.nameMythycal="Циклопи";break;
            case R.id.Layout6:transitionFragment();fragmentMythycal.nameMythycal="Фурії";break;
            case R.id.Layout7:transitionFragment();fragmentMythycal.nameMythycal="Грифони";break;
            case R.id.Layout8:transitionFragment();fragmentMythycal.nameMythycal="Гарпії";break;
            case R.id.Layout9:transitionFragment();fragmentMythycal.nameMythycal="Гідра";break;
            case R.id.Layout10:transitionFragment();fragmentMythycal.nameMythycal="Медуза";break;
            case R.id.Layout11:transitionFragment();fragmentMythycal.nameMythycal="Мінотавр";break;
            case R.id.Layout12:transitionFragment();fragmentMythycal.nameMythycal="Пегас";break;
            case R.id.Layout13:transitionFragment();fragmentMythycal.nameMythycal="Сатири";break;
            case R.id.Layout14:transitionFragment();fragmentMythycal.nameMythycal="Сцилла";break;
            case R.id.Layout15:transitionFragment();fragmentMythycal.nameMythycal="Сирени";break;
            case R.id.Layout16:transitionFragment();fragmentMythycal.nameMythycal="Сфінкс";break;
            case R.id.Layout17:transitionFragment();fragmentMythycal.nameMythycal="Тифон";break;
        }
    }
}