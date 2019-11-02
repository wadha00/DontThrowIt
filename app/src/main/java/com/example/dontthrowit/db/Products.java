package com.example.dontthrowit.db;


import com.example.dontthrowit.R;
import com.example.dontthrowit.model.ProductsModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mostafa khedr on 02,يوليو,2019
 */
public class Products {

    public static String product1 = "3610340017421";
    public static String product2 = "6281006442924";
    public static String product3 = "888066000079";


    //Computer System
    public List<ProductsModel> getComputerSystemsDesktopList() {

        List<ProductsModel> computerSystemsDesktopList = new ArrayList<>();
        computerSystemsDesktopList.add(new ProductsModel("DELL Desktop Computer OptiPlex 3060 KM82W Intel Core i5 8th Gen 8500",
                R.drawable.desktop1,
                "https://www.newegg.com/dell-optiplex-3060-business-desktops-workstations/p/N82E16883165434",
                "670 $ = 203 KD", "1Oct"));

        computerSystemsDesktopList.add(new ProductsModel("HP EliteOne 800 G4 All-in-One Computer - Intel Core i5 (8th Gen)",
                R.drawable.desktop2,
                "https://www.newegg.com/hp-800-g4-eliteone-all-in-one-pc/p/1VH-0048-000E4?Item=1VH-0048-000E4",
                "1000 $ = 303 KD", "2Oct"));


        computerSystemsDesktopList.add(new ProductsModel("ABS Mage H - Intel i9-9900K",
                R.drawable.desktop3,
                "https://www.newegg.com/abs-computer-technologies-mage-h-ali335/p/N82E16883102800",
                "2000 $ = 606 KD", "3Oct"));


        computerSystemsDesktopList.add(new ProductsModel("Acer All-in-One Computer Aspire C24-865-UR12 Intel Core i5 8th Gen 8250U",
                R.drawable.desktop4,
                "https://www.newegg.com/acer-c24-865-ur12-aspire-all-in-one-pc/p/1VK-0017-008B2?Item=9SIAEYJ9G57905",
                "700 $ = 212 KD", "4Oct"));


        return computerSystemsDesktopList;
    }

    public List<ProductsModel> getComputerSystemsLapTopList() {

        List<ProductsModel> computerSystemsDesktopList = new ArrayList<>();
        computerSystemsDesktopList.add(new ProductsModel("Lenovo Laptop IdeaPad 330 81D2005CUS AMD Ryzen 5 1st Gen 2500",
                R.drawable.desktop1,
                "https://www.newegg.com/platinum-gray-lenovo-ideapad-330-81d2005cus-mainstream/p/N82E16834850877",
                "500 $ = 150 KD", "1Dec"));

        computerSystemsDesktopList.add(new ProductsModel("Acer Laptop Aspire 5 A515-54G-70TZ Intel Core i7 8th Gen 8565U",
                R.drawable.desktop2,
                "https://www.newegg.com/charcoal-black-acer-aspire-5-a515-54g-70tz-mainstream/p/N82E16834316759",
                "700 $ = 212 KD", "2Dec"));


        computerSystemsDesktopList.add(new ProductsModel("HP Laptop ProBook 450 G6 5YH15UT#ABA Intel Core i7 8th Gen 8565U",
                R.drawable.desktop3,
                "https://www.newegg.com/natural-silver-hp-probook-450-g6-mainstream/p/1TS-000D-037B2",
                "860 $ = 260 KD", "3Dec"));


        computerSystemsDesktopList.add(new ProductsModel("Microsoft Surface Pro 6 NKR-00001 2-in-1 Laptop Intel",
                R.drawable.desktop4,
                "https://www.newegg.com/black-microsoft-surface-pro-6-nkr-00001/p/N82E16834735993",
                "800 $ = 242 KD", "4Dec"));


        return computerSystemsDesktopList;
    }


    //Prepherals
    public List<ProductsModel> getMonitorsList() {

        List<ProductsModel> monitorsList = new ArrayList<>();
        monitorsList.add(new ProductsModel("Samsung CFG70 Series C27FG73 27  Curved Monito",
                R.drawable.monitors1,
                "https://www.newegg.com/dark-blue-black-samsung-cfg70-series-lc27fg73fqnxza-27/p/N82E16824022684",
                "330 $ = 100 KD", "1Oct"));

        monitorsList.add(new ProductsModel("LG 34UM64-P 34  Quad HD 2560x1080 2K Resolution",
                R.drawable.monitors2,
                "https://www.newegg.com/p/N82E16824005700",
                "340 $ = 103 KD", "2Oct"));


        monitorsList.add(new ProductsModel("MSI Optix MAG271R 27  Full HD Resolution 165Hz",
                R.drawable.monitors3,
                "https://www.newegg.com/p/N82E16824475031",
                "2000 $ = 606 KD", "3Oct"));


        monitorsList.add(new ProductsModel("BenQ ZOWIE XL2731 27  Full HD 1920x1080 1ms 144Hz ",
                R.drawable.monitors4,
                "https://www.newegg.com/black-benq-zowie-xl-series-xl2731-27/p/N82E16824014657",
                "300 $ = 90 KD", "4Oct"));


        return monitorsList;
    }

    public List<ProductsModel> getPowerProtectionList() {

        List<ProductsModel> powerProtectionList = new ArrayList<>();
        powerProtectionList.add(new ProductsModel("APC BR1500MS 1500 VA Pure SineWave 10",
                R.drawable.power1,
                "https://www.newegg.com/apc-br1500ms-4-x-nema-5-15r-6-x-nema-5-15r/p/N82E16842301700",
                "204 $ = 61 KD", "1Dec"));


        powerProtectionList.add(new ProductsModel("CyberPower Smart App LCD OR2200LCDRTXL2U 2190 VA 1650 W 8 Outlets UPS",
                R.drawable.power2,
                "https://www.newegg.com/cyberpower-or2200lcdrtxl2u-nema-5-20r/p/N82E16842102121",
                "550 $ = 166 KD", "2Dec"));


        powerProtectionList.add(new ProductsModel("Tripp Lite 150 W Car Power Inverter with 1 Outlet, Auto Inverter, Ultra Compact (PV150)",
                R.drawable.power3,
                "https://www.newegg.com/tripp-lite-powerverter-pv150-120v-ac-60hz/p/N82E16812120305",
                "35 $ = 10 KD", "3Oct"));


        powerProtectionList.add(new ProductsModel("Rosewill CAPSTONE 550M 550W Modular Power Supply (80 PLUS GOLD Certified)",
                R.drawable.power4,
                "https://www.newegg.com/rosewill-capstone-series-capstone-550m-550w/p/N82E16817182262",
                "85 $ = 25 KD", "4Oct"));


        return powerProtectionList;
    }


//CPUs-Processors

    public List<ProductsModel> getCpusList() {

        List<ProductsModel> cpusList = new ArrayList<>();
        cpusList.add(new ProductsModel("Intel Core i9-9900K Coffee Lake 8-Core",
                R.drawable.cpu1,
                "https://www.newegg.com/core-i9-9th-gen-intel-core-i9-9900k/p/N82E16819117957?Item=N82E16819117957",
                "485 $ = 147 KD", "1Sep"));

        cpusList.add(new ProductsModel("AMD RYZEN 7 3800X 8-Core 3.9 GHz",
                R.drawable.cpu2,
                "https://www.newegg.com/amd-ryzen-7-3800x/p/N82E16819113104?Item=N82E16819113104",
                "370 $ = 112 KD", "2Oct"));


        cpusList.add(new ProductsModel("Intel Core i7-9700K Coffee Lake 8-Core 3.6 GHz",
                R.drawable.cpu3,
                "https://www.newegg.com/core-i7-9th-gen-intel-core-i7-9700k/p/N82E16819117958?Item=N82E16819117958",
                "365 $ = 110 KD", "3Oct"));


        cpusList.add(new ProductsModel("AMD FX-8350 Black Edition Vishera 8-Core 4.0 GHz",
                R.drawable.cpu4,
                "https://www.newegg.com/amd-fx-8000-series-fx-8350-black-edition/p/N82E16819113284",
                "200 $ = 60 KD", "4Oct"));


        return cpusList;
    }

    public List<ProductsModel> getMemoryList() {

        List<ProductsModel> memoryList = new ArrayList<>();
        memoryList.add(new ProductsModel("G.SKILL TridentZ RGB Series 16GB",
                R.drawable.memory1,
                "https://www.newegg.com/g-skill-16gb-288-pin-ddr4-sdram/p/N82E16820232498",
                "85 $ = 25 KD", "1Sep"));

        memoryList.add(new ProductsModel("Team T-FORCE VULCAN Z 32GB",
                R.drawable.memory2,
                "https://www.newegg.com/team-32gb-288-pin-ddr4-sdram/p/N82E16820331362",
                "110 $ = 33 KD", "2Oct"));


        memoryList.add(new ProductsModel("Crucial 16GB Kit (8GBx2) DDR4 2400 MT/s",
                R.drawable.memory3,
                "https://www.newegg.com/crucial-16gb-260-pin-ddr4-so-dimm/p/0ZK-0070-00010",
                "64 $ = 20 KD", "3Oct"));


        memoryList.add(new ProductsModel("Kingston 16GB (1 x 16GB) DDR4 2400MHz",
                R.drawable.memory4,
                "https://www.newegg.com/kingston-16gb-260-pin-ddr4-so-dimm/p/N82E16820242417",
                "70 $ = 21 KD", "4Oct"));


        return memoryList;
    }
    public List<ProductsModel> getMotherBoardList() {

        List<ProductsModel> motherBoardList = new ArrayList<>();
        motherBoardList.add(new ProductsModel("ASUS Prime Z390-A/H10 Motherboard Bundled Intel",
                R.drawable.mother1,
                "https://www.newegg.com/p/N82E16813119204?Item=N82E16813119204",
                "300 $ = 90 KD", "1Sep"));

        motherBoardList.add(new ProductsModel("MSI B450 GAMING PLUS MAX AM4 AMD B450 SATA 6Gb/s ATX AMD Motherboard",
                R.drawable.mother2,
                "https://www.newegg.com/p/N82E16813144264",
                "100 $ = 30 KD", "2Oct"));


        motherBoardList.add(new ProductsModel("GIGABYTE X570 I AORUS PRO WIFI AMD",
                R.drawable.mother3,
                "https://www.newegg.com/p/N82E16813145159",
                "220 $ = 66 KD", "3Oct"));


        motherBoardList.add(new ProductsModel("SUPERMICRO MBD-X11SSV-Q-O Mini ITX Server Motherboard LGA 1151 Intel Q170",
                R.drawable.mother4,
                "https://www.newegg.com/supermicro-mbd-x11ssv-q-o-intel-6th-generation-core-i3-series-intel-6th-generation-core-i5-series-in/p/N82E16813182990?Item=N82E16813182990",
                "188 $ = 57 KD", "4Oct"));


        return motherBoardList;
    }

//Accessories
public List<ProductsModel> getCablesList() {

    List<ProductsModel> cablesList = new ArrayList<>();
    cablesList.add(new ProductsModel("Rosewill HDMI Pro-6 - 6-Foot Black High Speed HDMI Cable",
            R.drawable.cab1,
            "https://www.newegg.com/black-rosewill-6-feet-hdmi-cables/p/N82E16886228007",
            "6 $ = 1.5 KD", "1Sep"));

    cablesList.add(new ProductsModel("Coboc CL-MDP2DVI-6-WH 6 ft. 32AWG Mini DisplayPort(Thunderbolt Compatible)",
            R.drawable.cab2,
            "https://www.newegg.com/p/N82E16812423130",
            "7 $ = 2 KD", "2Oct"));


    cablesList.add(new ProductsModel("Sabrent USB 2.0 TO SERIAL DB9 MALE (9 PIN) RS232 CABLE ADAPTER ",
            R.drawable.cab3,
            "https://www.newegg.com/p/N82E16812203018",
            "10 $ = 3 KD", "3Oct"));


    cablesList.add(new ProductsModel("C2G 30823 14 AWG 250 Volt Power Extension Cord",
            R.drawable.cab4,
            "https://www.newegg.com/black-cables-to-go-6-ft-cable-connectors/p/N82E16812196453",
            "10 $ = 3 KD", "4Oct"));


    return cablesList;
}
public List<ProductsModel> getComputerAccessoriesList() {

    List<ProductsModel> ComputerAccessoriesList = new ArrayList<>();
    ComputerAccessoriesList.add(new ProductsModel("Cyber Acoustics ACM-51B Black 3.5mm Connector Desktop Microphone",
            R.drawable.com_ac1,
            "https://www.newegg.com/black-cyber-acoustics-acm-51b-3-5mm-connector/p/N82E16836150080",
            "5 $ = 1.5 KD", "1Sep"));

    ComputerAccessoriesList.add(new ProductsModel("Logitech MK270 Wireless Keyboard and Mouse Combo",
            R.drawable.com_ac2,
            "https://www.newegg.com/logitech-wireless-combo-mk270-920-004536-usb-2-0-rf-wireless/p/N82E16823126332",
            "22 $ = 6 KD", "2Sep"));


    ComputerAccessoriesList.add(new ProductsModel("ARCTIC Accelero L2 Plus VGA Cooler - nVidia & AMD ",
            R.drawable.com_ac3,
            "https://www.newegg.com/white-arctic-cooling-accel-l2-plus/p/N82E16835186053",
            "22 $ = 6 KD", "3Sep"));


    ComputerAccessoriesList.add(new ProductsModel("Logitech F310 (940-000110) Gamepad",
            R.drawable.com_ac4,
            "https://www.newegg.com/black-logitech-f310-gaming-pad/p/N82E16826104402?Description=pc%20game%20controller&cm_re=pc_game_controller-_-26-104-402-_-Product",
            "22 $ = 6 KD", "4Sep"));


    return ComputerAccessoriesList;
}











    public List<String> getProductsBarCode() {


        List<String> barCodeList = new ArrayList<>();

        barCodeList.add("3610340017421");
        barCodeList.add("6281006442924");
        barCodeList.add("888066000079");

        barCodeList.add("693102510166");     //OFRA Blissful Highlighter
        barCodeList.add("693102820166");                 //OFRA Cosmetics Ofra X Manny MUA Lip Set
        barCodeList.add("693102933880");                 //OFRA Eyeshadow Peach
        barCodeList.add("843711216571");                 //OFRA Lipliner Mauve
        barCodeList.add("843711217134");                 //OFRA Lipstick 101
        barCodeList.add("681619700583");                 //the Balm Mary-Lou Manizer Luminizer
        barCodeList.add("885291449741");                             //theBalm getönte Tagescreme Balm Shelter Tinted Moisturizer,Medium
        barCodeList.add("681619801013");                      //theBalm Manizer Kit
        barCodeList.add("681619807237");                                 //theBalm Meet Matte Hughes- Sincere
        barCodeList.add("885647551494");                                   //theBalm ShadowBlush, DownBoy
        //perfume
        barCodeList.add("786200910683");      //212 Carolina Herrera For Women Personal Fragrances
        barCodeList.add("3614225613494");              //Calvin Klien Eternity Air For Women
        barCodeList.add("8411061823514");                     //Carolina Herrera - 'Good Girl' Eau De Parfum
        barCodeList.add("737052893839");                                  //Hugo Boss Hugo Woman EdP
        barCodeList.add("723817190138");                                   //Ivoire Balmain
        barCodeList.add("3348900689428");                                   //JADORE by Christian Dior Eau De Parfum Spray 1.7 oz
        barCodeList.add("3700578511010");                                   //Mancera Roses Greedy
        barCodeList.add("3607342624849");                                  //Roses De Chloe
        barCodeList.add("072671214284");                                  //Tom Ford Black Orchid Eau de Parfum 100ml
        barCodeList.add("3252559401846");                                  //Van-Cleef-Arpels


        //hair

        barCodeList.add("050428471852");       //Bioluxe Styling Gel
        barCodeList.add("079400194183");       //Clear Scalp & Hair Therapy Nourishing Anti-dandruff Shampoo
        barCodeList.add("6281006442924");         //Dove hair therapy oil replacement
        barCodeList.add("3610340017421");          //Elvive extraordinary oil
        barCodeList.add("787461824122");           //Garnier Fructis Style Curl Scrunch Gel
        barCodeList.add("603084494286");           //Garnier Nutrisse Nourishing Color Creme
        barCodeList.add("603084410712");           //Garnier Nutrisse Ultra Color
        barCodeList.add("8432225031408");           //Orofluido Mask (250ml)
        barCodeList.add("8432225023618");           //Orofluido-Beauty-Elixir-Your-Hair
        barCodeList.add("080878177264");           //Pantene Damage Detox Conditioner

        //skin
        barCodeList.add("3610340017421");       //Body Scrub Hempz
        barCodeList.add("3574660131888");       //Clean and clear
        barCodeList.add("502819785821");         //Hemp hard working foot protector
        barCodeList.add("676280022119");          //Hempz pomegranate body wash
        barCodeList.add("8901138511784");           //JOHNSON’S Baby Oil
        barCodeList.add("8850007060314");           //JOHNSON’S Shampoo
        barCodeList.add("3574660547603");           //Nature Republic NEW Soothing& Moisture ALOE VERA
        barCodeList.add("889068023349");           //Nivea Cream
        barCodeList.add("689002620425");           //Nivea Cream
        barCodeList.add("120527593468");           //The Body Shop Mini Papaya Body Butter

        return barCodeList;
    }


}
