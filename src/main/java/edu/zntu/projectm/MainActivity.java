package edu.zntu.projectm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class MainActivity extends AppCompatActivity {

    //Створення меню
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    //Створення фрагментів меню
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            //Реалізація переходу до фрагменту "FragmentAbout"
            case R.id.mainitem1:
                setContentView(R.layout.activity_main);

                FragmentAbout fragmentAbout = new FragmentAbout();

                try {
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame1A1, fragmentAbout);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

                break;

            //Реалізація переходу до фрагменту "FragmentCatalog"
            case R.id.mainitem2:
                setContentView(R.layout.activity_main);

                FragmentCatalog fragmentCatalog = new FragmentCatalog();

                try {
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame1A1, fragmentCatalog);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

                break;

            //Реалізація виходу з додатку
            case R.id.mainitem3:
                finish();
                break;
        }
        return true;
    }

    private SQL connector;
    private SQLiteDatabase db;
    private Cursor cursor;

    //Перехід у фрагмент після запуску додатку "FragmentCatalog" та реалізація БД
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentCatalog fragmentCatalog = new FragmentCatalog();

        try {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame1A1, fragmentCatalog);
            fragmentTransaction.commit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    //Стек для працездатності поверення до попереднього фрагменту
    @Override
    public void onBackPressed() {
        FragmentManager fm = getFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
            Log.i("MainActivity", "popping backstack");
            fm.popBackStack();
        } else {
            Log.i("MainActivity", "nothing on backstack, calling super");
            super.onBackPressed();
        }
    }
}