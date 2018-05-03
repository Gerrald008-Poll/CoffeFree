package coffe.four_k_soft.com.coffeefree.adapter.recycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import coffe.four_k_soft.com.coffeefree.R;
import coffe.four_k_soft.com.coffeefree.model.CoffeProduct;

/**
 *
 * Created by goryanskiy on 26.04.18.
 */

public class TableProductAdapter extends RecyclerView.Adapter<TableProductAdapter.ProductVewHolder>{
    private Context mContext;
    private List<CoffeProduct> mCoffeProducts;


    public TableProductAdapter(Context mContext, List<CoffeProduct> mCoffeProducts) {
        this.mContext = mContext;
        this.mCoffeProducts = mCoffeProducts;
    }

    @Override
    public ProductVewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ProductVewHolder vh;
        View itemLayoutView;

        switch (viewType)
        {
            default:
                itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shop, parent, false);
                vh = new ProductVewHolder(itemLayoutView);
                break;
            case 1:
                itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restore, parent, false);
                vh = new ProductVewHolder(itemLayoutView);
                break;
        }
        return vh;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ProductVewHolder holder, int position) {
        switch (this.getItemViewType(position)){
            default:
                holder.textViewTitleProduct.setText(mCoffeProducts.get(position).getTitleName());
                holder.imageViewProduct.setImageResource(R.drawable.img_default);
                holder.textViewPrice.setText("$ "+mCoffeProducts.get(position).getPrice());
                break;
            case 1:

        }
    }

    @Override
    public int getItemViewType(int position) {
        return (1 == position) ? 1:0;
    }

    @Override
    public int getItemCount() {
        return mCoffeProducts.size();
    }

    public class ProductVewHolder extends RecyclerView.ViewHolder{
        //private ItemShopBinding binding;

        private TextView textViewTitleProduct;
        private TextView textViewPrice;
        private ImageView imageViewProduct;



        public ProductVewHolder(View itemView) {
            super(itemView);

            textViewTitleProduct = (TextView)itemView.findViewById(R.id.tv_title_product);
            imageViewProduct = (ImageView) itemView.findViewById(R.id.img_product);
            textViewPrice = (TextView) itemView.findViewById(R.id.tv_price_product);
        }
    }
}
