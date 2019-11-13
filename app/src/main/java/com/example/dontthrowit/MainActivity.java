package com.example.dontthrowit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.SearchManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dontthrowit.activity.ReportProductsActivity;
import com.example.dontthrowit.db.Products;
import com.google.android.gms.vision.barcode.Barcode;

import java.util.List;

import info.androidhive.barcode.BarcodeReader;

public class MainActivity extends AppCompatActivity implements BarcodeReader.BarcodeReaderListener{
    private BarcodeReader barcodeReader;
    private List<String> productsBarCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barcodeReader = (BarcodeReader) getSupportFragmentManager().findFragmentById(R.id.barcode_fragment);
        Products products = new Products();
        productsBarCode = products.getProductsBarCode();
    }
    // success dialog when barcode is original
    private void openSuccessDialog(final Barcode barcode) {
        final Dialog dialog2 = new Dialog(MainActivity.this);

        dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog2.setContentView(R.layout.dialog_success);
        dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        TextView tv_dialog_productName = dialog2.findViewById(R.id.tv_dialog_productName);
        tv_dialog_productName.setText(barcode.displayValue);
        TextView tvDialogProductDetails = dialog2.findViewById(R.id.tv_dialog_productDetails);
        tvDialogProductDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.buycott.com/upc/" + barcode.displayValue));
                intent.putExtra(SearchManager.QUERY, barcode.displayValue);

                startActivity(intent);
            }
        });
        TextView tv_dialog_rescan = dialog2.findViewById(R.id.tv_dialog_rescan);
        tv_dialog_rescan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog2.dismiss();
            }
        });
           /* ImageView ivAboutUsBack = dialog2.findViewById(R.id.iv_aboutUsBack);
            ivAboutUsBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog2.dismiss();
                }
            });*/
        dialog2.show();

    }

    // report dialog when barcode is fake

    private void openFakeDialog() {
        final Dialog dialog2 = new Dialog(MainActivity.this);

        dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog2.setContentView(R.layout.dialog_success);
        dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView ivDialogSuccess = dialog2.findViewById(R.id.iv_dialog_success);
        ivDialogSuccess.setImageResource(R.drawable.ic_error);

        TextView tv_dialog_successDetails = dialog2.findViewById(R.id.tv_dialog_successDetails);
        tv_dialog_successDetails.setText(" This Product Not Found");


        TextView tv_dialog_productName = dialog2.findViewById(R.id.tv_dialog_productName);
        tv_dialog_productName.setVisibility(View.GONE);
        TextView tv_dialog_original = dialog2.findViewById(R.id.tv_dialog_original);
        tv_dialog_original.setText("Not Found");


        TextView tvDialogProductDetails = dialog2.findViewById(R.id.tv_dialog_productDetails);
        tvDialogProductDetails.setText("Exit");
        tvDialogProductDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, com.example.dontthrowit.activity.MainActivity.class));
            }
        });
        TextView tv_dialog_rescan = dialog2.findViewById(R.id.tv_dialog_rescan);
        tv_dialog_rescan.setText("Cancel");
        tv_dialog_rescan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog2.dismiss();
            }
        });

/*
            ivAboutUsBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog2.dismiss();
                }
            });
*/
        dialog2.show();

    }


    /**
     * override method
     * this method to get data after scan
     *
     * @param barcode
     */
    @Override
    public void onScanned(final Barcode barcode) {
        // play beep sound
        barcodeReader.playBeep();

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                String displayValue1 = barcode.displayValue;
//                Toast.makeText(MainActivity.this, displayValue1, Toast.LENGTH_LONG).show();

                if (productsBarCode.contains(displayValue1)) {
                    openSuccessDialog(barcode);


                } else {

                    openFakeDialog();


                }

            }
        });

//        barcodeReader.pauseScanning();

    }

    @Override
    public void onScannedMultiple(List<Barcode> list) {

    }

    @Override
    public void onBitmapScanned(SparseArray<Barcode> sparseArray) {

    }

    @Override
    public void onScanError(String s) {

    }

    @Override
    public void onCameraPermissionDenied() {
//        Toast.makeText(MainActivity.this, "Camera permission denied!", Toast.LENGTH_LONG).show();
    }
}
