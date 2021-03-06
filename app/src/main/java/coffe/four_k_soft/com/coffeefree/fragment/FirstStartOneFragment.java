package coffe.four_k_soft.com.coffeefree.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import coffe.four_k_soft.com.coffeefree.R;
import coffe.four_k_soft.com.coffeefree.databinding.FragmentFirstStartOneBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstStartOneFragment extends Fragment {
    private FragmentFirstStartOneBinding binding;

    public FirstStartOneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first_start_one, container, false);
        View view = binding.getRoot();


        binding.button.setOnClickListener(v -> getFragmentManager().beginTransaction()
                .replace(R.id.splash_container, new FirstStartTwoFragment())
                .commit());

        return view;
    }

}
