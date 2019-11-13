package com.example.dontthrowit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

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

public class MyAddsActivity extends AppCompatActivity {


    @BindView(R.id.BarContainer)
    RelativeLayout BarContainer;
    @BindView(R.id.rcy_products)
    RecyclerView rcyProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_adds);
        ButterKnife.bind(this);

        setRecycler();
    }

    private void setRecycler() {
        Products products = new Products();

        rcyProducts.setLayoutManager(new LinearLayoutManager(MyAddsActivity.this, RecyclerView.VERTICAL, false));
  /*      ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(ProductListActivity.this, R.dimen.item_offset);
        rcyProducts.addItemDecoration(itemDecoration);
*/

        List<ProductsModel> myAddsList = Products.getMyAddsList();
        rcyProducts.setAdapter(new ProductListAdapter(myAddsList, MyAddsActivity.this));

    }

    public void onBackPress(View view) {
        startActivity(new Intent(MyAddsActivity.this, MainActivity.class));
        finish();
    }
}
