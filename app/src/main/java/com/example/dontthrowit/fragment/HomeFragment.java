package com.example.dontthrowit.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.dontthrowit.R;
import com.example.dontthrowit.activity.ProductListActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    @BindView(R.id.etxt_search)
    EditText etxtSearch;
    @BindView(R.id.img_products_desktop)
    ImageView imgProductsDesktop;
    @BindView(R.id.txt_desktop)
    TextView txtDesktop;
    @BindView(R.id.txt_ads_number)
    TextView txtAdsNumber;
    @BindView(R.id.img_desktop_more)
    ImageView imgDesktopMore;
    @BindView(R.id.deskTopContainer)
    RelativeLayout deskTopContainer;
    @BindView(R.id.view_divider)
    View viewDivider;
    @BindView(R.id.img_products_laptop)
    ImageView imgProductsLaptop;
    @BindView(R.id.txt_laptop)
    TextView txtLaptop;
    @BindView(R.id.txt_laptop_ads_number)
    TextView txtLaptopAdsNumber;
    @BindView(R.id.img_laptop_more)
    ImageView imgLaptopMore;
    @BindView(R.id.lapTopContainer)
    RelativeLayout lapTopContainer;
    @BindView(R.id.img_products_monitors)
    ImageView imgProductsMonitors;
    @BindView(R.id.txt_monitor)
    TextView txtMonitor;
    @BindView(R.id.txt_monitors_ads_number)
    TextView txtMonitorsAdsNumber;
    @BindView(R.id.img_monitors_more)
    ImageView imgMonitorsMore;
    @BindView(R.id.monitorsContainer)
    RelativeLayout monitorsContainer;
    @BindView(R.id.view2_divider)
    View view2Divider;
    @BindView(R.id.img_products_protection)
    ImageView imgProductsProtection;
    @BindView(R.id.txt_powe)
    TextView txtPowe;
    @BindView(R.id.txt_power_ads_number)
    TextView txtPowerAdsNumber;
    @BindView(R.id.img_power_more)
    ImageView imgPowerMore;
    @BindView(R.id.powerProductionContainer)
    RelativeLayout powerProductionContainer;
    @BindView(R.id.img_products_processors)
    ImageView imgProductsProcessors;
    @BindView(R.id.txt_processors)
    TextView txtProcessors;
    @BindView(R.id.txt_processors_ads_number)
    TextView txtProcessorsAdsNumber;
    @BindView(R.id.img_processors_more)
    ImageView imgProcessorsMore;
    @BindView(R.id.cpuContainer)
    RelativeLayout cpuContainer;
    @BindView(R.id.view3_divider)
    View view3Divider;
    @BindView(R.id.img_products_memorys)
    ImageView imgProductsMemorys;
    @BindView(R.id.txt_memory)
    TextView txtMemory;
    @BindView(R.id.txt_memory_ads_number)
    TextView txtMemoryAdsNumber;
    @BindView(R.id.img_memory_more)
    ImageView imgMemoryMore;
    @BindView(R.id.memoryContainer)
    RelativeLayout memoryContainer;
    @BindView(R.id.view_motherboard_divider)
    View viewMotherboardDivider;
    @BindView(R.id.img_products_motherboard)
    ImageView imgProductsMotherboard;
    @BindView(R.id.txt_motherboard)
    TextView txtMotherboard;
    @BindView(R.id.txt_motherboard_ads_number)
    TextView txtMotherboardAdsNumber;
    @BindView(R.id.img_motherboard_more)
    ImageView imgMotherboardMore;
    @BindView(R.id.motherBoardContainer)
    RelativeLayout motherBoardContainer;
    @BindView(R.id.img_products_accessories)
    ImageView imgProductsAccessories;
    @BindView(R.id.txt_accessories)
    TextView txtAccessories;
    @BindView(R.id.txt_accessories_ads_number)
    TextView txtAccessoriesAdsNumber;
    @BindView(R.id.img_accessories_more)
    ImageView imgAccessoriesMore;
    @BindView(R.id.computerAccContainer)
    RelativeLayout computerAccContainer;
    @BindView(R.id.view_cables_divider)
    View viewCablesDivider;
    @BindView(R.id.img_products_cables)
    ImageView imgProductsCables;
    @BindView(R.id.txt_cables)
    TextView txtCables;
    @BindView(R.id.txt_cable_ads_number)
    TextView txtCableAdsNumber;
    @BindView(R.id.img_cable_more)
    ImageView imgCableMore;
    @BindView(R.id.cablesContainer)
    RelativeLayout cablesContainer;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, inflate);


        return inflate;
    }

    @OnClick({R.id.deskTopContainer, R.id.powerProductionContainer, R.id.lapTopContainer, R.id.monitorsContainer, R.id.cpuContainer, R.id.memoryContainer, R.id.motherBoardContainer, R.id.computerAccContainer, R.id.cablesContainer})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.deskTopContainer:
                startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "DesktopComputer"));
                break;
            case R.id.lapTopContainer:
                startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "Laptops"));

                break;
            case R.id.monitorsContainer:
                startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "Monitors"));

                break;
            case R.id.cpuContainer:
                startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "CPUs-Processors"));

                break;
            case R.id.memoryContainer:
                startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "Memorys"));

                break;
            case R.id.motherBoardContainer:
                startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "Motherboards"));

                break;
            case R.id.computerAccContainer:
                startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "ComputerAccessories"));

                break;
            case R.id.cablesContainer:
                startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "Cables"));

                break;
            case R.id.powerProductionContainer:
                startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "PowerProtection"));

                break;
        }
    }


/*    @OnClick({R.id.makeup_container, R.id.perfumes_container, R.id.skinCare_container, R.id.hair_container})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.makeup_container:
                getActivity().startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "Makeup"));
                break;
            case R.id.perfumes_container:
                getActivity().startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "Perfume"));

                break;
            case R.id.skinCare_container:
                getActivity().startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "Skin Care"));

                break;
            case R.id.hair_container:
                getActivity().startActivity(new Intent(getActivity(), ProductListActivity.class).putExtra("category", "Hair"));

                break;
        }
    }*/
}
