package com.example.dontthrowit.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.dontthrowit.MainActivity;
import com.example.dontthrowit.R;
import com.example.dontthrowit.helper.SharedPreferenceManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddAdFragment extends Fragment {


    @BindView(R.id.appbar_title)
    TextView appbarTitle;
    @BindView(R.id.ic_brand)
    ImageView icBrand;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.BarContainer)
    RelativeLayout BarContainer;
    @BindView(R.id.iv_report)
    ImageView ivReport;
    @BindView(R.id.btn_openCamera)
    Button btnOpenCamera;
    @BindView(R.id.edt_productName)
    EditText edtProductName;
    @BindView(R.id.sp_categories)
    Spinner spCategories;
    @BindView(R.id.edt_productDescription)
    EditText edtProductDescription;
    @BindView(R.id.edt_storeName)
    EditText edtStoreName;
    @BindView(R.id.edt_storeDescription)
    EditText edtStoreDescription;
    @BindView(R.id.btn_send)
    Button btnSend;

    @BindView(R.id.view_addAd)
    View viewAddAd;
    private SharedPreferenceManager sharedPreferenceManager;
    private View inflate;

    public AddAdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        inflate = inflater.inflate(R.layout.fragment_add_ad, container, false);
        ButterKnife.bind(this, inflate);

        inflateAppBar(inflate);

        init();

        return inflate;

    }

    private void init() {

        sharedPreferenceManager = new SharedPreferenceManager(getActivity());
        setSpCategoriesSpinner();

    }


    private void
    inflateAppBar(View inflate) {
        //      start of  inflate appBar layout

        TextView aboutUserAppBarTitle = inflate.findViewById(R.id.appbar_title);
        aboutUserAppBarTitle.setText(R.string.reportProducts);
        ImageView back = inflate.findViewById(R.id.iv_back);

    }


    private void setSpCategoriesSpinner() {

        String[] categoriesList = getResources().getStringArray(R.array.categories);
        // Creating adapter for spinner
        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<String>(getActivity(), R.layout.item_spinner, categoriesList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View v = super.getView(position, convertView, parent);
                if (position == getCount()) {
                    ((TextView) v.findViewById(android.R.id.text1)).setText(getText(R.string.categories));
                    ((TextView) v.findViewById(android.R.id.text1)).setHint(getItem(getCount())); //"Hint to be displayed"
                }

                return v;
            }

            @Override
            public int getCount() {
                return super.getCount() - 1; // you dont display last item. It is used as hint.
            }

        };

        // Drop down layout style - list view with radio button
        categoryAdapter.setDropDownViewResource(R.layout.drpdn_qual);


        // attaching data adapter to spinner
        spCategories.setAdapter(categoryAdapter);
        spCategories.setSelection(categoryAdapter.getCount()); //set the hint the default selection so it appears on launch.


        spCategories.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                viewAddAd.setVisibility(View.GONE);
                // On selecting a spinner item
                String category = parent.getItemAtPosition(position).toString();
                if (position > 0) {
                    // Showing selected spinner item
//                    Toast.makeText(parent.getContext(), "Selected: " + Speciality, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


/*
    public void send(View view) {
        sendMail();
    }


    // open phone camera
    public void openCamera(View view) {

        if (isPermissionGranted()) {

//            onImageClicked();
        }


    }*/

/*    //check user accept permission or not
    public boolean isPermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {

                return true;
            } else {


                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, RequestPermissionCode);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation

            return true;
        }
    }*/

    // result after permission

/*    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {

            case RequestPermissionCode: {

                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission Granted
//                    Toast.makeText(ReportProductsActivity.this, R.string.PermissionGranted, Toast.LENGTH_SHORT).show();
                    onImageClicked();

                } else {
                    // Permission Denied
//                    Toast.makeText(ReportProductsActivity.this, R.string.PermissionDenied, Toast.LENGTH_SHORT).show();
                }


                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }

    }*/


    // open user camera to pic image
    public void onImageClicked() {

/*
        CropImage.activity()
                .setGuidelines(CropImageView.Guidelines.ON)
                .start(getActivity(),this);*/


    }


    // result after camera shooting
 /*   @Override
    protected void onActivityResult(int requestCode, int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {
                resultUri = result.getUri();
                ivReportImageOfProduct.setVisibility(View.VISIBLE);
                Glide.with(ReportProductsActivity.this).load(resultUri).into(ivReportImageOfProduct);
                sharedPreferenceManager.changeUserImage(resultUri.toString(), "notNull");
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Toast.makeText(this, "Error in upload Image", Toast.LENGTH_SHORT).show();
            }
        }
    }*/

    public void onBackPress() {
        onBackPress();
    }

    @OnClick(R.id.btn_send)
    public void onViewClicked() {
        startActivity(new Intent(getActivity(), MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));

    }
}
