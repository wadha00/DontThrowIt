package com.example.dontthrowit.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dontthrowit.R;
import com.example.dontthrowit.adapter.ProductListAdapter;
import com.example.dontthrowit.db.Products;
import com.example.dontthrowit.model.ProductsModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity {

    @BindView(R.id.etxt_search)
    SearchView etxtSearch;
    @BindView(R.id.rcy_products)
    RecyclerView rcyProducts;
    private ProductListAdapter productListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(SearchActivity.this);


        setRecycler();
       /* etxtSearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {


                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });*/

    }

    private void setRecycler() {
        Products products = new Products();

        rcyProducts.setLayoutManager(new LinearLayoutManager(SearchActivity.this, RecyclerView.VERTICAL,false));
        List<ProductsModel> productsList = products.getProductsList();
        productListAdapter = new ProductListAdapter(productsList, SearchActivity.this);
      rcyProducts.setAdapter(productListAdapter);

      etxtSearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
          @Override
          public boolean onQueryTextSubmit(String s) {
              return false;
          }

          @Override
          public boolean onQueryTextChange(String s) {

              productListAdapter.getFilter().filter(s);

              return true;
          }
      });



    }
}
