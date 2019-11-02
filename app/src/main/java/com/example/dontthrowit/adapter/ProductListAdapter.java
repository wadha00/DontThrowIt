package com.example.dontthrowit.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.dontthrowit.R;
import com.example.dontthrowit.helper.ImageDialog;
import com.example.dontthrowit.model.ProductsModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mostafa kamal khedr on 09,July,2019
 */
public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ViewHolder> {


    private List<ProductsModel> productsModelList;
    private Context context;

    public ProductListAdapter(List<ProductsModel> productsModelList, Context context) {
        this.productsModelList = productsModelList;
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
        int productImage = productsModelList.get(position).getProductImage();
        final String productLink = productsModelList.get(position).getProductLink();
        String productName = productsModelList.get(position).getProductName();
        String productPrice = productsModelList.get(position).getProductPrice();
        String day = productsModelList.get(position).getDay();
        viewHolder.txtDeviceDay.setText(day);
        viewHolder.txtDevicePrice.setText(productPrice);

        Glide.with(context).load(productImage).apply(ImageDialog.getRequestOption())
                .into(viewHolder.imgCategoryList);

        viewHolder.txtDeviceName.setText(productName);

        viewHolder.cvCategoryContainer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(productLink)));

            }
        });


    }


    @Override
    public int getItemCount() {
        return productsModelList.size();
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
