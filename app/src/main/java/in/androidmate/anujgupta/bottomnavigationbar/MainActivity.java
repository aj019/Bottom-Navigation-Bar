package in.androidmate.anujgupta.bottomnavigationbar;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_favorites:
                                Toast.makeText(MainActivity.this,"Favorites" ,Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_schedules:
                                Toast.makeText(MainActivity.this,"Schedules",Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_music:
                                Toast.makeText(MainActivity.this,"Music",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
    }
}
