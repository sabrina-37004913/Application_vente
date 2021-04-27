package com.example.application_vente.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.application_vente.object.Boutique;
import com.example.application_vente.R;

import java.util.List;

public class Liste_boutiquesFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private RecyclerView mRecycle;
    private List<Boutique> boutique;
//    private BoutiqueAdapter mAdapt;
  //  private BoutiqueAdapter mAdapt2;
    // private DataBaseOpenhelp data;

    boolean tapped;

    public Liste_boutiquesFragment() {

    }

    public static Liste_boutiquesFragment newInstance(String param1, String param2) {
        Liste_boutiquesFragment fragment = new Liste_boutiquesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //Context menu
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecycle = view.findViewById(R.id.recycle1);
        registerForContextMenu(mRecycle);
    }

}