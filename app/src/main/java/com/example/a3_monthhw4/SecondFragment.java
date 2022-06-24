package com.example.a3_monthhw4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnItemClick {
    private ArrayList<Country> countryArrayList;
    private CountryAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.rec2);
        adapter = new CountryAdapter(countryArrayList, this::openNewActivity);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        countryArrayList = new ArrayList<>();
        Bundle bundle = getArguments();
        Integer val = bundle.getInt(getString(R.string.key));


        switch (val) {
            case 1:
                countryArrayList.add(new Country("Belgium", R.drawable.ic_be, 1));
                countryArrayList.add(new Country("Estonia", R.drawable.ic_ee, 1));
                countryArrayList.add(new Country("Espana", R.drawable.ic_es, 1));
                countryArrayList.add(new Country("France", R.drawable.ic_fr, 1));
                countryArrayList.add(new Country("Horvatia", R.drawable.ic_hr, 1));
                break;
            case 2:
                countryArrayList.add(new Country("China", R.drawable.ic_cn, 2));
                countryArrayList.add(new Country("Kyrgyzstan", R.drawable.ic_kg, 2));
                countryArrayList.add(new Country("Kazakstan", R.drawable.ic_kz, 2));
                countryArrayList.add(new Country("Uzbekistan", R.drawable.ic_uz, 2));
                countryArrayList.add(new Country("Tadjikistan", R.drawable.ic_tj, 2));
                break;
            case 3:
                countryArrayList.add(new Country("Canada", R.drawable.ic_ca, 3));
                countryArrayList.add(new Country("Jamayka", R.drawable.ic_jm, 3));
                countryArrayList.add(new Country("Costa Rica", R.drawable.ic_kp, 3));
                countryArrayList.add(new Country("Mexico", R.drawable.ic_mx, 3));
                countryArrayList.add(new Country("Dominica", R.drawable.ic_resource_do, 3));
                break;
            case 4:
                countryArrayList.add(new Country("Argentina", R.drawable.ic_ar,4));
                countryArrayList.add(new Country("Chili", R.drawable.ic_cl,4));
                countryArrayList.add(new Country("Peru", R.drawable.ic_pe,4));
                countryArrayList.add(new Country("Paragvay", R.drawable.ic_py,4));
                countryArrayList.add(new Country("Urugvay", R.drawable.ic_uy,4));
                break;
            case 5:
                countryArrayList.add(new Country("CAR", R.drawable.ic_cf,5));
                countryArrayList.add(new Country("Egipt", R.drawable.ic_eg,5));
                countryArrayList.add(new Country("Gabon", R.drawable.ic_ga,5));
                countryArrayList.add(new Country("Ghana", R.drawable.ic_gh,5));
                countryArrayList.add(new Country("Nigeria", R.drawable.ic_ng,5));
                break;
            case 6:
                countryArrayList.add(new Country("Bisiktrisa", R.drawable.ic_bs,6));
                countryArrayList.add(new Country("Dijiya", R.drawable.ic_dj,6));
                countryArrayList.add(new Country("Gimalai", R.drawable.ic_gm,6));
                countryArrayList.add(new Country("Honoa", R.drawable.ic_hn,6));
                countryArrayList.add(new Country("Hotoyuia", R.drawable.ic_ht,6));
                break;
        }

    }

    @Override
    public void openNewActivity(Country country) {

    }
}
// switch (val) {
//         case 1:
//         countryArrayList.add(new Country("Europa", "Belgium", R.drawable.ic_be));
//         countryArrayList.add(new Country("Europa", "Estonia", R.drawable.ic_ee));
//         countryArrayList.add(new Country("Europa", "Espana", R.drawable.ic_es));
//         countryArrayList.add(new Country("Europa", "France", R.drawable.ic_fr));
//         countryArrayList.add(new Country("Europa", "Horvatia", R.drawable.ic_hr));
//         break;
//         case 2:
//         countryArrayList.add(new Country("Asia", "China", R.drawable.ic_cn));
//         countryArrayList.add(new Country("Asia", "Kyrgyzstan", R.drawable.ic_kg));
//         countryArrayList.add(new Country("Asia", "Kazakstan", R.drawable.ic_kz));
//         countryArrayList.add(new Country("Asia", "Uzbekistan", R.drawable.ic_uz));
//         countryArrayList.add(new Country("Asia", "Tadjikistan", R.drawable.ic_tj));
//         break;
//         case 3:
//         countryArrayList.add(new Country("North America", "Canada", R.drawable.ic_ca));
//         countryArrayList.add(new Country("North America", "Jamayka", R.drawable.ic_jm));
//         countryArrayList.add(new Country("North America", "Costa Rica", R.drawable.ic_kp));
//         countryArrayList.add(new Country("North America", "Mexico", R.drawable.ic_mx));
//         countryArrayList.add(new Country("North America", "Dominica", R.drawable.ic_resource_do));
//         break;
//         case 4:
//         countryArrayList.add(new Country("South America", "Argentina", R.drawable.ic_ar));
//         countryArrayList.add(new Country("South America", "Chili", R.drawable.ic_cl));
//         countryArrayList.add(new Country("South America", "Peru", R.drawable.ic_pe));
//         countryArrayList.add(new Country("South America", "Paragvay", R.drawable.ic_py));
//         countryArrayList.add(new Country("South America", "Urugvay", R.drawable.ic_uy));
//         break;
//         case 5:
//         countryArrayList.add(new Country("Africa", "CAR", R.drawable.ic_cf));
//         countryArrayList.add(new Country("Africa", "Egipt", R.drawable.ic_eg));
//         countryArrayList.add(new Country("Africa", "Gabon", R.drawable.ic_ga));
//         countryArrayList.add(new Country("Africa", "Ghana", R.drawable.ic_gh));
//         countryArrayList.add(new Country("Africa", "Nigeria", R.drawable.ic_ng));
//         break;
//         case 6:
//         countryArrayList.add(new Country("Oceania", "Bisiktrisa", R.drawable.ic_bs));
//         countryArrayList.add(new Country("Oceania", "Dijiya", R.drawable.ic_dj));
//         countryArrayList.add(new Country("Oceania", "Gimalai", R.drawable.ic_gm));
//         countryArrayList.add(new Country("Oceania", "Honoa", R.drawable.ic_hn));
//         countryArrayList.add(new Country("Oceania", "Hotoyuia", R.drawable.ic_ht));
//         break;
//         }


