package in.androidmate.anujgupta.bottomnavigationbar;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import in.androidmate.anujgupta.bottomnavigationbar.Fragments.FavoriteFragment;
import in.androidmate.anujgupta.bottomnavigationbar.Fragments.MusicFrag;
import in.androidmate.anujgupta.bottomnavigationbar.Fragments.ScheduleFrag;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_favorites:
                                FavoriteFragment fav_frag = new FavoriteFragment();
                                loadFragment(fav_frag);
                                Toast.makeText(MainActivity.this,"Favorites" ,Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_schedules:
                                Toast.makeText(MainActivity.this,"Schedules",Toast.LENGTH_SHORT).show();
                                ScheduleFrag schedule_frag = new ScheduleFrag();
                                loadFragment(schedule_frag);
                                break;
                            case R.id.action_music:
                                Toast.makeText(MainActivity.this,"Music",Toast.LENGTH_SHORT).show();
                                MusicFrag music_frag = new MusicFrag();
                                loadFragment(music_frag);
                                break;
                        }
                        return true;
                    }
                });
    }

    private void setupViews() {

        frameLayout = (FrameLayout) findViewById(R.id.frame);
    }

    private void loadFragment(Fragment frag){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,frag);
        fragmentTransaction.commit();

    }
}
