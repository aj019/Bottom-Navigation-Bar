package in.androidmate.anujgupta.bottomnavigationbar.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.androidmate.anujgupta.bottomnavigationbar.R;

/**
 * Created by anujgupta on 22/08/17.
 */

public class FavoriteFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_favorite,container,false);
        return v;
    }
}
