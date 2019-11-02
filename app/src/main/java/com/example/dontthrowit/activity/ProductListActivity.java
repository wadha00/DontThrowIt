package com.example.dontthrowit.activity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dontthrowit.R;
import com.example.dontthrowit.adapter.ProductListAdapter;
import com.example.dontthrowit.db.Products;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductListActivity extends AppCompatActivity {

    @BindView(R.id.rcy_products)
    RecyclerView rcyProducts;
    private ProductListAdapter productListAdapter;
    private String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        inflateLayOut();
        setRecycler();

    }
    public void onBackPress(View view) {
        super.onBackPressed();
    }
    private void inflateLayOut() {
        ButterKnife.bind(this);
        category = getIntent().getStringExtra("category");
        Toolbar customToolbar = findViewById(R.id.custom_toolbar);

        setSupportActionBar(customToolbar);
        TextView appBarTitle = findViewById(R.id.appbar_title);

        appBarTitle.setText(category);
    }

    private void setRecycler() {
        Products products = new Products();

        rcyProducts.setLayoutManager(new LinearLayoutManager(ProductListActivity.this, RecyclerView.VERTICAL,false));
  /*      ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(ProductListActivity.this, R.dimen.item_offset);
        rcyProducts.addItemDecoration(itemDecoration);
*/
        if (category.equals("DesktopComputer")) {
            productListAdapter = new ProductListAdapter(products.getComputerSystemsDesktopList(), ProductListActivity.this);

        } else if (category.equals("Laptops")) {
            productListAdapter = new ProductListAdapter(products.getComputerSystemsLapTopList(), ProductListActivity.this);

        } else if (category.equals("Monitors")) {
            productListAdapter = new ProductListAdapter(products.getMonitorsList(), ProductListActivity.this);

        } else if (category.equals("PowerProtection")) {
            productListAdapter = new ProductListAdapter(products.getPowerProtectionList(), ProductListActivity.this);

        } else if (category.equals("CPUs-Processors")) {
            productListAdapter = new ProductListAdapter(products.getCpusList(), ProductListActivity.this);

        } else if (category.equals("Memorys")) {
            productListAdapter = new ProductListAdapter(products.getMemoryList(), ProductListActivity.this);

        } else if (category.equals("Motherboards")) {
            productListAdapter = new ProductListAdapter(products.getMotherBoardList(), ProductListActivity.this);

        }else if (category.equals("Cables")) {
            productListAdapter = new ProductListAdapter(products.getCablesList(), ProductListActivity.this);

        }else if (category.equals("ComputerAccessories")) {
            productListAdapter = new ProductListAdapter(products.getComputerAccessoriesList(), ProductListActivity.this);

        }
        rcyProducts.setAdapter(productListAdapter);

    }
}
