package com.example.dontthrowit.fragment;


import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.dontthrowit.R;
import com.example.dontthrowit.activity.ContactUsActivity;
import com.example.dontthrowit.activity.LoginActivity;
import com.example.dontthrowit.activity.MainActivity;
import com.example.dontthrowit.activity.MyAddsActivity;
import com.example.dontthrowit.db.Products;
import com.example.dontthrowit.helper.LanguageUtil;
import com.example.dontthrowit.helper.SharedPreferenceManager;
import com.example.dontthrowit.model.ProductsModel;

import java.util.List;

import butterknife.OnClick;


/**
 * * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends Fragment implements View.OnClickListener {


    private SharedPreferenceManager sharedPreferenceManager;
    private LanguageUtil languageUtil;

    public MoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_more, container, false);
        sharedPreferenceManager = new SharedPreferenceManager(getActivity());
        languageUtil = new LanguageUtil(getActivity());
        init(inflate);


        return inflate;
    }

    private void init(View inflate) {

        TextView txtMyAds = inflate.findViewById(R.id.txt_my_ads);
        TextView tvAboutUs = inflate.findViewById(R.id.tv_aboutUs);
        TextView tvChangeLanguage = inflate.findViewById(R.id.tv_changeLanguage);
        txtMyAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<ProductsModel> myAdd = Products.getMyAdd();
                if (myAdd != null&&myAdd.size() > 0 ) {
                    startActivity(new Intent(getActivity(), MyAddsActivity.class));
                }else {
                    Toast.makeText(getActivity(), getString(R.string.noAdd), Toast.LENGTH_LONG).show();
                }
            }
        });
        TextView tvContactUs = inflate.findViewById(R.id.tv_contactUs);
        TextView tvRateApp = inflate.findViewById(R.id.tv_rateApp);
        TextView tvShareApp = inflate.findViewById(R.id.tv_shareApp);
        TextView tvLogOut = inflate.findViewById(R.id.tv_LogOut);
        Boolean userSigned = sharedPreferenceManager.loadUserSigned();
        if (userSigned) {
            tvLogOut.setVisibility(View.VISIBLE);
            txtMyAds.setVisibility(View.VISIBLE);

        } else {
            tvLogOut.setVisibility(View.GONE);
            txtMyAds.setVisibility(View.GONE);

        }
        tvAboutUs.setOnClickListener(this);
        tvChangeLanguage.setOnClickListener(this);
        tvContactUs.setOnClickListener(this);
        tvRateApp.setOnClickListener(this);
        tvShareApp.setOnClickListener(this);
        tvLogOut.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        int id = view.getId();


        switch (id) {
            case R.id.tv_changeLanguage:
                showLanguageDialog();
                break;
            case R.id.tv_aboutUs:
                setAboutUsDialog();
                break;
            case R.id.tv_contactUs:

                getActivity().startActivity(new Intent(getActivity(), ContactUsActivity.class));
                break;
            case R.id.tv_rateApp:

                rateApp();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=ddg&c=apps&hl=en")));
                break;
            case R.id.tv_shareApp:


                setShareApp();

                break;
            case R.id.tv_LogOut:


                sharedPreferenceManager.saveUserIsSigned(false);

                getActivity().startActivity(new Intent(getActivity(), LoginActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));

                break;


        }
    }

    private void rateApp() {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=DTI&c=apps&hl=en")));

    }


    void showLanguageDialog() {
        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_change_language);
        dialog.setCancelable(true);
        //  initialize dialog components
        LinearLayout dialogParent = dialog.findViewById(R.id.layout_dialog_parent);
        Button english = dialog.findViewById(R.id.btn_english);
        Button arabic = dialog.findViewById(R.id.btn_arabic);
        dialog.show();
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferenceManager.saveLanguage("en");
                languageUtil.setLocale("en");
                startActivity(new Intent(getActivity(), MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));

            }
        });
        arabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferenceManager.saveLanguage("ar");
                languageUtil.setLocale("ar");
                startActivity(new Intent(getActivity(), MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });


    }

    private void setShareApp() {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Here is the share content body";
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));


    }

    private void setAboutUsDialog() {

        final Dialog dialog2 = new Dialog(getActivity(), android.R.style.Theme_Black_NoTitleBar_Fullscreen);

//        dialog2.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        dialog2.setContentView(R.layout.about_us);
//        dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView ivAboutUsBack = dialog2.findViewById(R.id.iv_aboutUsBack);
        ivAboutUsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog2.dismiss();
            }
        });
        dialog2.show();

    }


    @OnClick(R.id.tv_LogOut)
    public void onViewClicked() {

    }
}
