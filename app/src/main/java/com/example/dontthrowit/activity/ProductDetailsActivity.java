package com.example.dontthrowit.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.dontthrowit.R;
import com.example.dontthrowit.db.Products;
import com.example.dontthrowit.model.ProductsModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProductDetailsActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.txt_product_title)
    TextView txtProductTitle;
    @BindView(R.id.img_product_icon)
    ImageView imgProductIcon;
    @BindView(R.id.txt_product_name)
    TextView txtProductName;
    @BindView(R.id.txt_ad_date)
    TextView txtAdDate;
    @BindView(R.id.txt_product_price)
    TextView txtProductPrice;
    @BindView(R.id.txt_product_specifications)
    TextView txtProductSpecifications;
    @BindView(R.id.txt_product_description)
    TextView txtProductDescription;
    @BindView(R.id.txt_advertiser_title)
    TextView txtAdvertiserTitle;
    @BindView(R.id.txt_advertiser_name)
    TextView txtAdvertiserName;
    @BindView(R.id.img_call)
    ImageView imgCall;
    @BindView(R.id.txt_product_readMore)
    TextView txtProductReadMore;
    private int position;
    private Products products;
    private List<ProductsModel> productsList;
    private String userPhone;
    private String productLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        ButterKnife.bind(this);
        init();

        inflateDataToDesign();

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        imgCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + userPhone)));

            }
        });
    }

    private void inflateDataToDesign() {
        String productName = productsList.get(position).getProductName();
        int productImage = productsList.get(position).getProductImage();
        String day = productsList.get(position).getDay();
        String productPrice = productsList.get(position).getProductPrice();
        String descreption = productsList.get(position).getDescreption();
        String specification = productsList.get(position).getSpecification();
        productLink = productsList.get(position).getProductLink();
        userPhone = productsList.get(position).getUserPhone();
        String userEmail = productsList.get(position).getUserEmail();
        String userName = productsList.get(position).getUserName();

        txtProductTitle.setText(productName);
        txtProductName.setText(productName);
        Glide.with(ProductDetailsActivity.this).load(productImage)
                .into(imgProductIcon);
        txtAdDate.setText(day);
        txtProductPrice.setText(productPrice);

        txtProductSpecifications.setText(specification);
        txtProductDescription.setText(descreption);
        txtAdvertiserName.setText(userEmail);
        txtAdvertiserTitle.setText(userName);


    }

    private void init() {


        position = getIntent().getIntExtra("position", 0);
        products = new Products();
        productsList = products.getProductsList();
    }

    @OnClick(R.id.txt_product_readMore)
    public void onViewClicked() {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(productLink)));

    }
}
