package edu.zntu.projectm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentMythycal extends Fragment{
    private TextView tv;
    private TextView tv2;

    public FragmentMythycal() {
    }

    private SQL connector;
    private SQLiteDatabase db;
    private Cursor cursor;
    public String nameMythycal;

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mythical, container, false);
        tv = view.findViewById(R.id.tv1FM);
        tv2 = view.findViewById(R.id.tv2FM);

        //Виклик БазиДаних
        connector = new SQL(this.getActivity(), "MythycalDB", 1);
        db = connector.getWritableDatabase();

        //Виклик курсору
        cursor = db.rawQuery("Select Mythycals.name, Mythycals.image1, Mythycals.image2, Mythycals.image3, Mythycals.description FROM Mythycals WHERE name LIKE '" + nameMythycal + "%'", null);
        cursor.moveToFirst();
        tv.setText(cursor.getString(0));

        imageView1 = view.findViewById(R.id.imageView1);
        imageView1.setImageResource(cursor.getInt(1));

        imageView2 = view.findViewById(R.id.imageView2);
        imageView2.setImageResource(cursor.getInt(2));

        imageView3 = view.findViewById(R.id.imageView3);
        imageView3.setImageResource(cursor.getInt(3));
        tv2.setText(cursor.getString(4));
        if (cursor != null) cursor.close();
        if (db != null) db.close();

        return view;
    }

}