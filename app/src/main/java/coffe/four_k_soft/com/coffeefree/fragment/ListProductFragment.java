package coffe.four_k_soft.com.coffeefree.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import coffe.four_k_soft.com.coffeefree.R;
import coffe.four_k_soft.com.coffeefree.adapter.recycler.TableProductAdapter;
import coffe.four_k_soft.com.coffeefree.databinding.FragmentListProductBinding;
import coffe.four_k_soft.com.coffeefree.model.CoffeProduct;
import coffe.four_k_soft.com.coffeefree.model.FakeListCoffe;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListProductFragment extends Fragment {
    private static final String TAG = ListProductFragment.class.getSimpleName();
    private FragmentListProductBinding binding;
    private RecyclerView recyclerView;
    private List<CoffeProduct> mList;


    public ListProductFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_list_product, container, false);
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_product, container, false);
        View view = binding.getRoot();

        recyclerView = view.findViewById(R.id.recycler_table_shop);
        TableProductAdapter adapter = new TableProductAdapter(getActivity(), AddCard(mList));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(adapter);
        return view;
    }


    public List<CoffeProduct> AddCard(List<CoffeProduct> products){
        products = new ArrayList<>();
        CoffeProduct coffeProduct = new CoffeProduct("Capyshino", "100", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Djflkhgjlfhkjgkljd;flhkjdflghkjdfkjhgdfkjgh", "100", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "150", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "75", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "80", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Dghf gfjkgh kfjhgd dfjghkdh fkdgjhr", "120", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capywfshino", "100", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("wepyshino", "666", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capysno", "798", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        return products;
    }
}
