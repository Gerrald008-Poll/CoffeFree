package coffe.four_k_soft.com.coffeefree.adapter.recycler;

import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import coffe.four_k_soft.com.coffeefree.R;
import coffe.four_k_soft.com.coffeefree.databinding.ItemRestoreBinding;
import coffe.four_k_soft.com.coffeefree.databinding.ItemShopBinding;

/**
 *
 * Created by goryanskiy on 03.05.18.
 */

public class ListProductAdapter extends RecyclerView.Adapter<ListProductAdapter.ProductViewHolder>{


    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater;
        ProductViewHolder vh;
        switch (viewType)
        {
            default:
                layoutInflater = LayoutInflater.from(parent.getContext());
                ItemShopBinding itemShopBinding = ItemShopBinding.inflate(layoutInflater, parent, false);
                vh = new ProductViewHolder(itemShopBinding);
                break;
        /*    case 1:
                layoutInflater = LayoutInflater.from(parent.getContext());
                ItemRestoreBinding itemRestoreBinding = ItemRestoreBinding.inflate(layoutInflater, parent, false);
                //vh = new ProductViewHolder(itemRestoreBinding);
                break;*/
        }
        return vh;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return (1==position)? 1:0;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        private final ItemShopBinding itemShopBinding;
        //private final ItemRestoreBinding itemRestoreBinding;

        public ProductViewHolder(ItemShopBinding itemShopBinding) {
            super(itemShopBinding.getRoot());
            this.itemShopBinding = itemShopBinding;
            //itemRestoreBinding.getRoot();
            //this.itemRestoreBinding = itemRestoreBinding;
        }
    }

}
