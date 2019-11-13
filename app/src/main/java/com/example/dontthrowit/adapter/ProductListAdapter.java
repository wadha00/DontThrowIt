package com.example.dontthrowit.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.dontthrowit.R;
import com.example.dontthrowit.activity.ProductDetailsActivity;
import com.example.dontthrowit.helper.ImageDialog;
import com.example.dontthrowit.model.ProductsModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *
 */
public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ViewHolder> implements Filterable {


    private List<ProductsModel> mArrayList;
    private List<ProductsModel> productsModelList;
    private Context context;
    private List<ProductsModel> items;

    public ProductListAdapter(List<ProductsModel> arrayList, Context context) {
        this.productsModelList = arrayList;
        this.mArrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category_list, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        if (productsModelList.get(position).getProductImage2()==null){
            int productImage = productsModelList.get(position).getProductImage();
            Glide.with(context).load(productImage).apply(ImageDialog.getRequestOption())
                    .into(viewHolder.imgCategoryList);
        }else {
            String productImage = productsModelList.get(position).getProductImage2();
            Glide.with(context).load(productImage).apply(ImageDialog.getRequestOption())
                    .into(viewHolder.imgCategoryList);
        }
        final String productLink = productsModelList.get(position).getProductLink();
        String productName = productsModelList.get(position).getProductName();
        String productPrice = productsModelList.get(position).getProductPrice();
        String day = productsModelList.get(position).getDay();
        viewHolder.txtDeviceDay.setText(day);
        viewHolder.txtDevicePrice.setText(productPrice);



        viewHolder.txtDeviceName.setText(productName);

        viewHolder.cvCategoryContainer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int productPosition = productsModelList.get(position).getPosition();
                if (productPosition != -1) {
                    context.startActivity(new Intent(context, ProductDetailsActivity.class).putExtra("position", productPosition));
                }


            }
        });


    }


    @Override
    public int getItemCount() {
        return productsModelList.size();
    }

    @Override
    public Filter getFilter() {

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String charString = charSequence.toString();

                if (charString.isEmpty()) {

                    productsModelList = mArrayList;
                } else {

                    ArrayList<ProductsModel> filteredList = new ArrayList<>();

                    for (ProductsModel productList : mArrayList) {

                        if (productList.getProductName().toLowerCase().contains(charString) || productList.getDay().toLowerCase().contains(charString) || productList.getProductPrice().toLowerCase().contains(charString)) {

                            filteredList.add(productList);
                        }
                    }

                    productsModelList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = productsModelList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                productsModelList = (ArrayList<ProductsModel>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.img_category_list)
        ImageView imgCategoryList;
        @BindView(R.id.txt_device_name)
        TextView txtDeviceName;
        @BindView(R.id.txt_device_price)
        TextView txtDevicePrice;
        @BindView(R.id.txt_device_day)
        TextView txtDeviceDay;
        @BindView(R.id.cv_categoryContainer)
        CardView cvCategoryContainer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}
