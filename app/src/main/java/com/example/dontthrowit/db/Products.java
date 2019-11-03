package com.example.dontthrowit.db;


import com.example.dontthrowit.R;
import com.example.dontthrowit.model.ProductsModel;

import java.util.ArrayList;
import java.util.List;

public class Products {

    public static String product1 = "3610340017421";
    public static String product2 = "6281006442924";
    public static String product3 = "888066000079";


    //Computer System
    public List<ProductsModel> getComputerSystemsDesktopList() {

        List<ProductsModel> computerSystemsDesktopList = new ArrayList<>();
        computerSystemsDesktopList.add(new ProductsModel(0,"desktop1","DELL Desktop Computer OptiPlex 3060 KM82W Intel Core i5 8th Gen 8500",
                R.drawable.desktop1,
                "https://www.newegg.com/dell-optiplex-3060-business-desktops-workstations/p/N82E16883165434",
                "670 $ = 203 KD", "1Oct"));

        computerSystemsDesktopList.add(new ProductsModel(1,"desktop2","HP EliteOne 800 G4 All-in-One Computer - Intel Core i5 (8th Gen)",
                R.drawable.desktop2,
                "https://www.newegg.com/hp-800-g4-eliteone-all-in-one-pc/p/1VH-0048-000E4?Item=1VH-0048-000E4",
                "1000 $ = 303 KD", "2Oct"));


        computerSystemsDesktopList.add(new ProductsModel(2,"desktop3","ABS Mage H - Intel i9-9900K",
                R.drawable.desktop3,
                "https://www.newegg.com/abs-computer-technologies-mage-h-ali335/p/N82E16883102800",
                "2000 $ = 606 KD", "3Oct"));


        computerSystemsDesktopList.add(new ProductsModel(3,"desktop3","Acer All-in-One Computer Aspire C24-865-UR12 Intel Core i5 8th Gen 8250U",
                R.drawable.desktop4,
                "https://www.newegg.com/acer-c24-865-ur12-aspire-all-in-one-pc/p/1VK-0017-008B2?Item=9SIAEYJ9G57905",
                "700 $ = 212 KD", "4Oct"));


        return computerSystemsDesktopList;
    }

    public List<ProductsModel> getComputerSystemsLapTopList() {

        List<ProductsModel> computerSystemsDesktopList = new ArrayList<>();
        computerSystemsDesktopList.add(new ProductsModel(4,"lap1","Lenovo Laptop IdeaPad 330 81D2005CUS AMD Ryzen 5 1st Gen 2500",
                R.drawable.lap1,
                "https://www.newegg.com/platinum-gray-lenovo-ideapad-330-81d2005cus-mainstream/p/N82E16834850877",
                "500 $ = 150 KD", "1Dec"));

        computerSystemsDesktopList.add(new ProductsModel(5,"lap2","Acer Laptop Aspire 5 A515-54G-70TZ Intel Core i7 8th Gen 8565U",
                R.drawable.lap2,
                "https://www.newegg.com/charcoal-black-acer-aspire-5-a515-54g-70tz-mainstream/p/N82E16834316759",
                "700 $ = 212 KD", "2Dec"));


        computerSystemsDesktopList.add(new ProductsModel(6,"lap3","HP Laptop ProBook 450 G6 5YH15UT#ABA Intel Core i7 8th Gen 8565U",
                R.drawable.lap3,
                "https://www.newegg.com/natural-silver-hp-probook-450-g6-mainstream/p/1TS-000D-037B2",
                "860 $ = 260 KD", "3Dec"));


        computerSystemsDesktopList.add(new ProductsModel(7,"lap4","Microsoft Surface Pro 6 NKR-00001 2-in-1 Laptop Intel",
                R.drawable.lap4,
                "https://www.newegg.com/black-microsoft-surface-pro-6-nkr-00001/p/N82E16834735993",
                "800 $ = 242 KD", "4Dec"));


        return computerSystemsDesktopList;
    }


    //Prepherals
    public List<ProductsModel> getMonitorsList() {

        List<ProductsModel> monitorsList = new ArrayList<>();
        monitorsList.add(new ProductsModel(8,"monitors1","Samsung CFG70 Series C27FG73 27  Curved Monito",
                R.drawable.monitors1,
                "https://www.newegg.com/dark-blue-black-samsung-cfg70-series-lc27fg73fqnxza-27/p/N82E16824022684",
                "330 $ = 100 KD", "1Oct"));

        monitorsList.add(new ProductsModel(9,"monitors2","LG 34UM64-P 34  Quad HD 2560x1080 2K Resolution",
                R.drawable.monitors2,
                "https://www.newegg.com/p/N82E16824005700",
                "340 $ = 103 KD", "2Oct"));


        monitorsList.add(new ProductsModel(10,"monitors3","MSI Optix MAG271R 27  Full HD Resolution 165Hz",
                R.drawable.monitors3,
                "https://www.newegg.com/p/N82E16824475031",
                "2000 $ = 606 KD", "3Oct"));


        monitorsList.add(new ProductsModel(11,"monitors4","BenQ ZOWIE XL2731 27  Full HD 1920x1080 1ms 144Hz ",
                R.drawable.monitors4,
                "https://www.newegg.com/black-benq-zowie-xl-series-xl2731-27/p/N82E16824014657",
                "300 $ = 90 KD", "4Oct"));


        return monitorsList;
    }

    public List<ProductsModel> getPowerProtectionList() {

        List<ProductsModel> powerProtectionList = new ArrayList<>();
        powerProtectionList.add(new ProductsModel(12,"power1","APC BR1500MS 1500 VA Pure SineWave 10",
                R.drawable.power1,
                "https://www.newegg.com/apc-br1500ms-4-x-nema-5-15r-6-x-nema-5-15r/p/N82E16842301700",
                "204 $ = 61 KD", "1Dec"));


        powerProtectionList.add(new ProductsModel(13,"power2","CyberPower Smart App LCD OR2200LCDRTXL2U 2190 VA 1650 W 8 Outlets UPS",
                R.drawable.power2,
                "https://www.newegg.com/cyberpower-or2200lcdrtxl2u-nema-5-20r/p/N82E16842102121",
                "550 $ = 166 KD", "2Dec"));


        powerProtectionList.add(new ProductsModel(14,"power3","Tripp Lite 150 W Car Power Inverter with 1 Outlet, Auto Inverter, Ultra Compact (PV150)",
                R.drawable.power3,
                "https://www.newegg.com/tripp-lite-powerverter-pv150-120v-ac-60hz/p/N82E16812120305",
                "35 $ = 10 KD", "3Oct"));


        powerProtectionList.add(new ProductsModel(15,"power4","Rosewill CAPSTONE 550M 550W Modular Power Supply (80 PLUS GOLD Certified)",
                R.drawable.power4,
                "https://www.newegg.com/rosewill-capstone-series-capstone-550m-550w/p/N82E16817182262",
                "85 $ = 25 KD", "4Oct"));


        return powerProtectionList;
    }


//CPUs-Processors

    public List<ProductsModel> getCpusList() {

        List<ProductsModel> cpusList = new ArrayList<>();
        cpusList.add(new ProductsModel(16,"cpu1","Intel Core i9-9900K Coffee Lake 8-Core",
                R.drawable.cpu1,
                "https://www.newegg.com/core-i9-9th-gen-intel-core-i9-9900k/p/N82E16819117957?Item=N82E16819117957",
                "485 $ = 147 KD", "1Sep"));

        cpusList.add(new ProductsModel(17,"cpu2","AMD RYZEN 7 3800X 8-Core 3.9 GHz",
                R.drawable.cpu2,
                "https://www.newegg.com/amd-ryzen-7-3800x/p/N82E16819113104?Item=N82E16819113104",
                "370 $ = 112 KD", "2Oct"));


        cpusList.add(new ProductsModel(18,"cpu3","Intel Core i7-9700K Coffee Lake 8-Core 3.6 GHz",
                R.drawable.cpu3,
                "https://www.newegg.com/core-i7-9th-gen-intel-core-i7-9700k/p/N82E16819117958?Item=N82E16819117958",
                "365 $ = 110 KD", "3Oct"));


        cpusList.add(new ProductsModel(19,"cpu4","AMD FX-8350 Black Edition Vishera 8-Core 4.0 GHz",
                R.drawable.cpu4,
                "https://www.newegg.com/amd-fx-8000-series-fx-8350-black-edition/p/N82E16819113284",
                "200 $ = 60 KD", "4Oct"));


        return cpusList;
    }
    public List<ProductsModel> getMemoryList() {

        List<ProductsModel> memoryList = new ArrayList<>();
        memoryList.add(new ProductsModel(20,"memory1","G.SKILL TridentZ RGB Series 16GB",
                R.drawable.memory1,
                "https://www.newegg.com/g-skill-16gb-288-pin-ddr4-sdram/p/N82E16820232498",
                "85 $ = 25 KD", "1Sep"));

        memoryList.add(new ProductsModel(21,"memory2","Team T-FORCE VULCAN Z 32GB",
                R.drawable.memory2,
                "https://www.newegg.com/team-32gb-288-pin-ddr4-sdram/p/N82E16820331362",
                "110 $ = 33 KD", "2Oct"));


        memoryList.add(new ProductsModel(22,"memory3","Crucial 16GB Kit (8GBx2) DDR4 2400 MT/s",
                R.drawable.memory3,
                "https://www.newegg.com/crucial-16gb-260-pin-ddr4-so-dimm/p/0ZK-0070-00010",
                "64 $ = 20 KD", "3Oct"));


        memoryList.add(new ProductsModel(23,"memory4","Kingston 16GB (1 x 16GB) DDR4 2400MHz",
                R.drawable.memory4,
                "https://www.newegg.com/kingston-16gb-260-pin-ddr4-so-dimm/p/N82E16820242417",
                "70 $ = 21 KD", "4Oct"));


        return memoryList;
    }
    public List<ProductsModel> getMotherBoardList() {

        List<ProductsModel> motherBoardList = new ArrayList<>();
        motherBoardList.add(new ProductsModel(24,"mother1","ASUS Prime Z390-A/H10 Motherboard Bundled Intel",
                R.drawable.mother1,
                "https://www.newegg.com/p/N82E16813119204?Item=N82E16813119204",
                "300 $ = 90 KD", "1Sep"));

        motherBoardList.add(new ProductsModel(25,"mother2","MSI B450 GAMING PLUS MAX AM4 AMD B450 SATA 6Gb/s ATX AMD Motherboard",
                R.drawable.mother2,
                "https://www.newegg.com/p/N82E16813144264",
                "100 $ = 30 KD", "2Oct"));


        motherBoardList.add(new ProductsModel(26,"mother3","GIGABYTE X570 I AORUS PRO WIFI AMD",
                R.drawable.mother3,
                "https://www.newegg.com/p/N82E16813145159",
                "220 $ = 66 KD", "3Oct"));


        motherBoardList.add(new ProductsModel(27,"mother4","SUPERMICRO MBD-X11SSV-Q-O Mini ITX Server Motherboard LGA 1151 Intel Q170",
                R.drawable.mother4,
                "https://www.newegg.com/supermicro-mbd-x11ssv-q-o-intel-6th-generation-core-i3-series-intel-6th-generation-core-i5-series-in/p/N82E16813182990?Item=N82E16813182990",
                "188 $ = 57 KD", "4Oct"));


        return motherBoardList;
    }

//Accessories
public List<ProductsModel> getComputerAccessoriesList() {

    List<ProductsModel> ComputerAccessoriesList = new ArrayList<>();
    ComputerAccessoriesList.add(new ProductsModel(28,"com_ac1","Cyber Acoustics ACM-51B Black 3.5mm Connector Desktop Microphone",
            R.drawable.com_ac1,
            "https://www.newegg.com/black-cyber-acoustics-acm-51b-3-5mm-connector/p/N82E16836150080",
            "5 $ = 1.5 KD", "1Sep"));

    ComputerAccessoriesList.add(new ProductsModel(29,"com_ac2","Logitech MK270 Wireless Keyboard and Mouse Combo",
            R.drawable.com_ac2,
            "https://www.newegg.com/logitech-wireless-combo-mk270-920-004536-usb-2-0-rf-wireless/p/N82E16823126332",
            "22 $ = 6 KD", "2Sep"));


    ComputerAccessoriesList.add(new ProductsModel(30,"com_ac3","ARCTIC Accelero L2 Plus VGA Cooler - nVidia & AMD ",
            R.drawable.com_ac3,
            "https://www.newegg.com/white-arctic-cooling-accel-l2-plus/p/N82E16835186053",
            "22 $ = 6 KD", "3Sep"));


    ComputerAccessoriesList.add(new ProductsModel(31,"com_ac4","Logitech F310 (940-000110) Gamepad",
            R.drawable.com_ac4,
            "https://www.newegg.com/black-logitech-f310-gaming-pad/p/N82E16826104402?Description=pc%20game%20controller&cm_re=pc_game_controller-_-26-104-402-_-Product",
            "22 $ = 6 KD", "4Sep"));


    return ComputerAccessoriesList;
}
public List<ProductsModel> getCablesList() {

    List<ProductsModel> cablesList = new ArrayList<>();
    cablesList.add(new ProductsModel(32,"cab1","Rosewill HDMI Pro-6 - 6-Foot Black High Speed HDMI Cable",
            R.drawable.cab1,
            "https://www.newegg.com/black-rosewill-6-feet-hdmi-cables/p/N82E16886228007",
            "6 $ = 1.5 KD", "1Sep"));

    cablesList.add(new ProductsModel(33,"cab2","Coboc CL-MDP2DVI-6-WH 6 ft. 32AWG Mini DisplayPort(Thunderbolt Compatible)",
            R.drawable.cab2,
            "https://www.newegg.com/p/N82E16812423130",
            "7 $ = 2 KD", "2Oct"));


    cablesList.add(new ProductsModel(34,"cab3","Sabrent USB 2.0 TO SERIAL DB9 MALE (9 PIN) RS232 CABLE ADAPTER ",
            R.drawable.cab3,
            "https://www.newegg.com/p/N82E16812203018",
            "10 $ = 3 KD", "3Oct"));


    cablesList.add(new ProductsModel(35,"cab4","C2G 30823 14 AWG 250 Volt Power Extension Cord",
            R.drawable.cab4,
            "https://www.newegg.com/black-cables-to-go-6-ft-cable-connectors/p/N82E16812196453",
            "10 $ = 3 KD", "4Oct"));


    return cablesList;
}




    public List<ProductsModel> getProductsList() {

        List<ProductsModel> productsList = new ArrayList<>();
        productsList.add(new ProductsModel(0,"desktop1","DELL Desktop Computer OptiPlex 3060 KM82W Intel Core i5 8th Gen 8500",
                R.drawable.desktop1,
                "https://www.newegg.com/dell-optiplex-3060-business-desktops-workstations/p/N82E16883165434",
                "670 $ = 203 KD", "1Oct",
                "DELL Desktop Computer OptiPlex 3060 KM82W Intel Core i5 8th Gen 8500 (3.00 GHz) 8 GB DDR4 256 GB SSD Intel UHD Graphics 630 Windows 10 Pro 64-bit  ",
                "Wadha Al-Naser",
                "wadha.project19@gmail.com",
                "66696818",
                "•Intel Core i5 8th Gen 8500 (3.00 GHz) \n" +
                        "•8 GB DDR4 \n" +
                        "•256 GB SSD \n" +
                        "•Windows 10 Pro 64-bit \n" +
                        "•No Screen \n" +
                        "•Intel UHD Graphics 630"));



        productsList.add(new ProductsModel(1,"desktop2","HP EliteOne 800 G4 All-in-One Computer - Intel Core i5 (8th Gen)",
                R.drawable.desktop2,
                "https://www.newegg.com/hp-800-g4-eliteone-all-in-one-pc/p/1VH-0048-000E4?Item=1VH-0048-000E4",
                "1000 $ = 303 KD",
                "2Oct",
                "HP EliteOne 800 G4 All-in-One Computer - Intel Core i5 (8th Gen) i5-8500 3.00 GHz - 8 GB DDR4 - 256 GB SSD - 23.8 FHD IPS Anti-glare - Windows 10 Pro 64-Bit (English)",
                "Ayat Abdulrahem",
                "ayat.project19@gmail.com",
                "99364232",
                "•Intel Core i5 8th Gen 8500 (3.00 GHz)\n" +
                        "•8 GB DDR4 256 GB SSD\n" +
                        "•23.8\" 1920 x 1080\n" +
                        "•Windows 10 Pro 64-Bit\n" +
                        "•Intel UHD Graphics 630"));


        productsList.add(new ProductsModel(2,"desktop3","ABS Mage H - Intel i9-9900K",
                R.drawable.desktop3,
                "https://www.newegg.com/abs-computer-technologies-mage-h-ali335/p/N82E16883102800",
                "2000 $ = 606 KD",
                "3Oct",
                "ABS Mage H - Intel i9-9900K - GeForce RTX 2080 Super - 16GB DDR4 - 1TB SSD - Liquid Cooling 240mm - Gaming Desktop PC",
                "Tasnem Al-Kandri",
                "tasnem.project19@gmail.com",
                "90903033",
                "•Intel Core i9 9th Gen 9900K (3.60 GHz) \n" +
                        "•NVIDIA GeForce RTX 2080 SUPER 8GB \n" +
                        "•16GB DDR4 \n" +
                        "•1TB SSD \n" +
                        "•Windows 10 Home 64-bit \n" +
                        "•Liquid Cooling 240mm \n" +
                        "•Gaming Keyboard & Mouse \n" +
                        "•VR Ready"));


        productsList.add(new ProductsModel(3,"desktop3","Acer All-in-One Computer Aspire C24-865-UR12 Intel Core i5 8th Gen 8250U",
                R.drawable.desktop4,
                "https://www.newegg.com/acer-c24-865-ur12-aspire-all-in-one-pc/p/1VK-0017-008B2?Item=9SIAEYJ9G57905",
                "700 $ = 212 KD",
                "4Oct",
                "Acer All-in-One Computer Aspire C24-865-UR12 Intel Core i5 8th Gen 8250U (1.60 GHz) 8 GB DDR4 1 TB HDD 23.8\" Windows 10 Home 64-bit",
                "Fatemah Al-Rumh",
                "fatemah.project19@gmail.com",
                "94900811",
                "•Intel Core i5 8th Gen 8250U (1.60 GHz)\n" +
                        "•8 GB DDR4 1 TB HDD\n" +
                        "•23.8\" 1920 x 1080\n" +
                        "•Windows 10 Home 64-bit\n" +
                        "•Intel UHD Graphics 620"));




//___________________________


        productsList.add(new ProductsModel(4,"lap1","Lenovo Laptop IdeaPad 330 81D2005CUS AMD Ryzen 5 1st Gen 2500",
                R.drawable.lap1,
                "https://www.newegg.com/platinum-gray-lenovo-ideapad-330-81d2005cus-mainstream/p/N82E16834850877",
                "500 $ = 150 KD", "1Dec",
                "Lenovo Laptop IdeaPad 330 81D2005CUS AMD Ryzen 5 1st Gen 2500U (2.00 GHz) 8 GB Memory 256 GB SSD AMD Radeon Vega 8 15.6\" Windows 10 Home 64-Bit",
                "mazen AHMED",
                "mazenAHMED@gmail.com",
                "",
                "•AMD Ryzen 5 2500U (2.00 GHz)\n" +
                        "•8 GB Memory 256 GB SSD\n" +
                        "•AMD Radeon Vega 8\n" +
                        "•Screen Resolution 1920 x 1080\n" +
                        "•Dolby Audio\n" +
                        "•Windows 10 Home 64-Bit\n" +
                        "•DVD±R/RW\n" +
                        "•Perfect everyday laptop"));


        productsList.add(new ProductsModel(5,"lap2","Acer Laptop Aspire 5 A515-54G-70TZ Intel Core i7 8th Gen 8565U",
                R.drawable.lap2,
                "https://www.newegg.com/charcoal-black-acer-aspire-5-a515-54g-70tz-mainstream/p/N82E16834316759",
                "700 $ = 212 KD", "2Dec",
                "Lenovo Laptop IdeaPad 330 81D2005CUS AMD Ryzen 5 1st Gen 2500U (2.00 GHz) 8 GB Memory 256 GB SSD AMD Radeon Vega 8 15.6\" Windows 10 Home 64-Bit",
                "khaled nabawy",
                "khaledNabawy@gmail.com",
                "",
                "•Intel Core i7 8th Gen 8565U (1.80 GHz)\n" +
                        "•8 GB Memory 512 GB SSD\n" +
                        "•NVIDIA GeForce MX250\n" +
                        "•Screen Resolution 1920 x 1080\n" +
                        "•Windows 10 Home 64-bit"));


        productsList.add(new ProductsModel(6,"lap3","HP Laptop ProBook 450 G6 5YH15UT#ABA Intel Core i7 8th Gen 8565U",
                R.drawable.lap3,
                "https://www.newegg.com/natural-silver-hp-probook-450-g6-mainstream/p/1TS-000D-037B2",
                "860 $ = 260 KD", "3Dec",
                "HP Laptop ProBook 450 G6 5YH15UT#ABA Intel Core i7 8th Gen 8565U (1.80 GHz) 16 GB Memory 256 GB SSD NVIDIA GeForce MX130 15.6\" Windows 10 Pro 64-bit",
                "ahmed mohamed",
                "ahmed.mohamed@gmail.com",
                "95412588",
                "•Intel Core i7 8th Gen 8565U (1.80 GHz)\n" +
                        "•16 GB Memory 256 GB SSD\n" +
                        "•NVIDIA GeForce MX130\n" +
                        "•Screen Resolution 1920 x 1080\n" +
                        "•Windows 10 Pro 64-bit"));


        productsList.add(new ProductsModel(7,"lap4","Microsoft Surface Pro 6 NKR-00001 2-in-1 Laptop Intel",
                R.drawable.lap4,
                "https://www.newegg.com/black-microsoft-surface-pro-6-nkr-00001/p/N82E16834735993",
                "800 $ = 242 KD", "4Dec",
                "Microsoft Surface Pro 6 NKR-00001 2-in-1 Laptop Intel Core i5-8250U 1.60 GHz 12.3\" Windows 10 Home 64-bit - With Keyboard - Black",
                "mohammed mahmoud",
                "mohammed@gmail.com",
                "95412588",
                "•Intel Core i5 8th Gen 8250U (1.60 GHz)\n" +
                        "•8 GB Memory 128 GB SSD\n" +
                        "•Intel UHD Graphics 620\n" +
                        "•12.3\" Touchscreen 2736 x 1824\n" +
                        "•Detachable\n" +
                        "•Windows 10 Home 64-bit"));



//_______________________________monitors
        productsList.add(new ProductsModel(8,"monitors1","Samsung CFG70 Series C27FG73 27  Curved Monito",
                R.drawable.monitors1,
                "https://www.newegg.com/dark-blue-black-samsung-cfg70-series-lc27fg73fqnxza-27/p/N82E16824022684",
                "330 $ = 100 KD", "1Oct",
                "Samsung CFG70 Series C27FG73 27\" Curved Monitor, 16:9, 3000:1, FHD, 144Hz, 1ms, QLED, AMD FreeSync, DP, 2xHDMI, VESA",
                "assmaa mohammed",
                "assmaa.mohammed@gmail.com",
                "9851236",
                "Redefine your gaming experience\n" +
                        "Curved and super-fast\n" +
                        "Uninterrupted, flaw-free gaming\n" +
                        "1920x1080\n" +
                        "1ms, 144Hz\n" +
                        "3000:1\n" +
                        "QLED"));

        productsList.add(new ProductsModel(9,"monitors2","LG 34UM64-P 34  Quad HD 2560x1080 2K Resolution",
                R.drawable.monitors2,
                "https://www.newegg.com/p/N82E16824005700",
                "340 $ = 103 KD", "2Oct",
                "LG 34UM64-P 34\" Quad HD 2560x1080 2K Resolution 60Hz 5ms DVI-D 2xHDMI DisplayPort 4-Screen Split Flicker-Safe Built-in Speakers UltraWide LED Backlit IPS Monitor",
                "Jehad ahmed",
                "Jehad.ahmed@gmail.com",
                "9845122",
                "2560 x 1080 Quad HD 2K Resolution @ 60Hz\n" +
                        "5ms Response Time\n" +
                        "DVI-D, DisplayPort, 2 x HDMI Video Inputs\n" +
                        "Built-in 7 Watt Speakers\n" +
                        "Flicker-Safe Technology\n" +
                        "4-Screen Split Mode\n" +
                        "Picture in Picture Mode\n" +
                        "HDCP Support\n" +
                        "5,000,000:1 Dynamic Contrast Ratio\n" +
                        "16.7 Million Color Support\n" +
                        "Tilt Adjustable\n" +
                        "VESA Mount Compatible"));


        productsList.add(new ProductsModel(10,"monitors3","MSI Optix MAG271R 27  Full HD Resolution 165Hz",
                R.drawable.monitors3,
                "https://www.newegg.com/p/N82E16824475031",
                "2000 $ = 606 KD", "3Oct",
                "MSI Optix MAG271R 27\" Full HD Resolution 165Hz Refresh Rate 1ms Response Time AMD FreeSync Technology Anti-Flicker Anti-Glare Frameless Design Gaming Monitor",
                "eman khaled",
                "eman.khaled@gmail.com",
                "6541233",
                "Full HD 1920 x 1080 Resolution\n" +
                        "1ms Response Time\n" +
                        "165Hz Refresh Rate\n" +
                        "16.7 Million Color Support\n" +
                        "DisplayPort (1.2), 2 x HDMI (2.0) Inputs\n" +
                        "2 x USB 2.0 Type A, 1 USB 2.0 Type B Ports\n" +
                        "Audio Out\n" +
                        "Frameless Design\n" +
                        "AMD FreeSync Technology\n" +
                        "Anti-Flicker and Less Blue Light - game even longer and prevent eye strain and fatigue\n" +
                        "100,000,000 Dynamic Contrast Ratio"));


        productsList.add(new ProductsModel(11,"monitors4","BenQ ZOWIE XL2731 27  Full HD 1920x1080 1ms 144Hz ",
                R.drawable.monitors4,
                "https://www.newegg.com/black-benq-zowie-xl-series-xl2731-27/p/N82E16824014657",
                "300 $ = 90 KD", "4Oct",
                "BenQ ZOWIE XL2731 27\" Full HD 1920x1080 1ms 144Hz DVI-D HDMI DisplayPort e-Sports Gaming Monitor",
                "walaaa amgad",
                "walaaa.amgad@gmail.com",
                "45897444",
                "1920 x 1080 Full HD Resolution\n" +
                        "1ms Response Time\n" +
                        "144Hz Refresh Rate\n" +
                        "DVI-D, 2 x HDMI (2.0), DisplayPort (1.2) Inputs\n" +
                        "Audio Out\n" +
                        "3 x USB 3.0 Type A Ports, 1 x USB 3.0 Type B Port\n" +
                        "1000:1 Contrast Ratio\n" +
                        "Pivot, Swivel, Tilt, Height Adjustable\n" +
                        "Built-in Black eQualizer\n" +
                        "Flicker-Free Technology\n" +
                        "Low Blue Light Filter\n" +
                        "VESA Mount Compatible"));


//___________________________powerProduction
        productsList.add(new ProductsModel(12,"power1","APC BR1500MS 1500 VA Pure SineWave 10",
                R.drawable.power1,
                "https://www.newegg.com/apc-br1500ms-4-x-nema-5-15r-6-x-nema-5-15r/p/N82E16842301700",
                "204 $ = 61 KD", "1Dec",
                "APC BR1500MS 1500 VA Pure SineWave 10 Outlets 2 USB Charging Ports Back-UPS Pro Battery Backup, Replaces BR1500G",
                "afnan mazen",
                "afnan.mazen@gmail.com",
                "2354879",
                "1500 VA / 900 Watts\n" +
                        "10 Total Outlets: 6 Outlets provide UPS Battery Backup and Surge Protection; 4 Outlets offer Surge Protection Only\n" +
                        "Sine Wave battery output is compatible with Modern Computers using Active PFC Power Supplies\n" +
                        "One USB Type C and one standard USB charging port with 3A of shared power\n" +
                        "Dataline Surge Protection protects connected equipment from power surges on the data lines\n" +
                        "User-replaceable and Hot-swappable batteries extend useable product lifetime\n" +
                        "Automatic Voltage Regulation (AVR) instantly corrects voltage fluctuations"));


        productsList.add(new ProductsModel(13,"power2","CyberPower Smart App LCD OR2200LCDRTXL2U 2190 VA 1650 W 8 Outlets UPS",
                R.drawable.power2,
                "https://www.newegg.com/cyberpower-or2200lcdrtxl2u-nema-5-20r/p/N82E16842102121",
                "550 $ = 166 KD", "2Dec",
                "CyberPower Smart App LCD OR2200LCDRTXL2U 2190 VA 1650 W 8 Outlets UPS\n",
                "neama mwtwaly",
                "neama.mwtwaly@gmail.com",
                "54411189",
"2190VA / 1650W Simulated Sine Wave UPS\n" +
        "2U Rack Mount/Tower Convertible\n" +
        "8 Outlets / USB and Serial Ports\n" +
        "External Battery Pack Option\n" +
        "Multifunction Rotatable LCD Display\n" +
        "Line-Interactive Topology"));


        productsList.add(new ProductsModel(14,"power3","Tripp Lite 150 W Car Power Inverter with 1 Outlet, Auto Inverter, Ultra Compact (PV150)",
                R.drawable.power3,
                "https://www.newegg.com/tripp-lite-powerverter-pv150-120v-ac-60hz/p/N82E16812120305",
                "35 $ = 10 KD", "3Oct",
                "Tripp Lite 150 W Car Power Inverter with 1 Outlet, Auto Inverter, Ultra Compact (PV150)",
                "sara ahmed",
                "sara.ahmed@gmail.com",
                "",
                "Converts 12 V DC battery power to 120 V AC power\n" +
                        "Runs smartphones, laptops, tablets, portable TVs, DVD players, MP3 players and other electronics\n" +
                        "150 watts continuous output; 300 watts peak output power (instantaneous)\n" +
                        "3-ft. cord with cigarette lighter plug & 1 NEMA 5-15R outlet\n" +
                        "20-amp fuse protects inverter from overload"));


        productsList.add(new ProductsModel(15,"power4","Rosewill CAPSTONE 550M 550W Modular Power Supply (80 PLUS GOLD Certified)",
                R.drawable.power4,
                "https://www.newegg.com/rosewill-capstone-series-capstone-550m-550w/p/N82E16817182262",
                "85 $ = 25 KD", "4Oct",
                "Rosewill CAPSTONE 550M 550W Modular Power Supply (80 PLUS GOLD Certified)",
                "khaled mostafa",
                "khaled.mostafa@gmail.com",
                "235468",
                "550W Power Supply\n" +
                        "80 PLUS GOLD Certified PSU\n" +
                        "ATX 12V v2.31 / EPS 12V v2.92\n" +
                        "Continuous 550W @ 50 Degree Celsius\n" +
                        "Modular Cable Design\n" +
                        "SLI & CrossFire Ready - 2 x 6+2 Pin Connector\n" +
                        "Silent 135mm Fan with Auto Fan Speed Control\n" +
                        "Single Strong 12V Rail - Ideal for Gaming Systems"));

//_____________________cpus
        productsList.add(new ProductsModel(16,"cpu1","Intel Core i9-9900K Coffee Lake 8-Core",
                R.drawable.cpu1,
                "https://www.newegg.com/core-i9-9th-gen-intel-core-i9-9900k/p/N82E16819117957?Item=N82E16819117957",
                "485 $ = 147 KD", "1Sep",
                "Intel Core i9-9900K Coffee Lake 8-Core, 16-Thread, 3.6 GHz (5.0 GHz Turbo) LGA 1151 (300 Series) 95W BX80684I99900K Desktop Processor Intel UHD Graphics 630",
                "mahmoud ali",
                "mahmoud@gmail.com",
                "45871152",
                "9th Gen Intel Processor\n" +
                        "Intel UHD Graphics 630\n" +
                        "Only Compatible with Intel 300 Series Motherboard\n" +
                        "Socket LGA 1151 (300 Series)\n" +
                        "Max Turbo Frequency 5.0 GHz\n" +
                        "Unlocked Processor\n" +
                        "DDR4 Support\n" +
                        "Intel Optane Memory and SSD Supported\n" +
                        "Cooling device not included - Processor Only\n" +
                        "Intel Turbo Boost Technology 2.0 and Intel vPro technology offer pro-level performance for gaming, creating, and overall productivity"));

        productsList.add(new ProductsModel(17,"cpu2","AMD RYZEN 7 3800X 8-Core 3.9 GHz",
                R.drawable.cpu2,
                "https://www.newegg.com/amd-ryzen-7-3800x/p/N82E16819113104?Item=N82E16819113104",
                "370 $ = 112 KD", "2Oct",
                "AMD RYZEN 7 3800X 8-Core 3.9 GHz (4.5 GHz Max Boost) Socket AM4 105W 100-100000025BOX Desktop Processor",
                "mazen khaled",
                "mazen.khaled@gmail.com",
                "90147855",
                "3rd Gen Ryzen\n" +
                        "Socket AM4\n" +
                        "Max Boost Frequency 4.5 GHz\n" +
                        "DDR4 Support\n" +
                        "L2 Cache 4MB\n" +
                        "L3 Cache 32MB\n" +
                        "Thermal Design Power 105W\n" +
                        "With Wraith Prism cooler"));


        productsList.add(new ProductsModel(18,"cpu3","Intel Core i7-9700K Coffee Lake 8-Core 3.6 GHz",
                R.drawable.cpu3,
                "https://www.newegg.com/core-i7-9th-gen-intel-core-i7-9700k/p/N82E16819117958?Item=N82E16819117958",
                "365 $ = 110 KD", "3Oct",
                "Intel Core i7-9700K Coffee Lake 8-Core 3.6 GHz (4.9 GHz Turbo) LGA 1151 (300 Series) 95W BX80684I79700K Desktop Processor Intel UHD Graphics 630",
                "mohammed ahmed",
                "mohammed.ahmed@gmail.com",
                "90147855",
                "9th Gen Intel Processor\n" +
                        "Intel UHD Graphics 630\n" +
                        "Only Compatible with Intel 300 Series Motherboard\n" +
                        "Socket LGA 1151 (300 Series)\n" +
                        "Max Turbo Frequency 4.9 GHz\n" +
                        "Unlocked Processor\n" +
                        "DDR4 Support\n" +
                        "Intel Optane Memory and SSD Supported\n" +
                        "Cooling device not included - Processor Only\n" +
                        "Intel Turbo Boost Technology 2.0 and Intel vPro technology offer high performance for enthusiast gaming, creating, and overclocking"));


        productsList.add(new ProductsModel(19,"cpu4","AMD FX-8350 Black Edition Vishera 8-Core 4.0 GHz",
                R.drawable.cpu4,
                "https://www.newegg.com/amd-fx-8000-series-fx-8350-black-edition/p/N82E16819113284",
                "200 $ = 60 KD", "4Oct",
                "AMD FX-8350 Black Edition Vishera 8-Core 4.0 GHz (4.2 GHz Turbo) Socket AM3+ 125W FD8350FRHKBOX Desktop Processor",
                "khaled mohammed",
                "khaled.mohammed@gmail.com",
                "0155444446",
                "32nm Vishera 125W\n" +
                        "8MB L3 Cache\n" +
                        "8MB L2 Cache"));

//____________________memory
        productsList.add(new ProductsModel(20,"memory1","G.SKILL TridentZ RGB Series 16GB",
                R.drawable.memory1,
                "https://www.newegg.com/g-skill-16gb-288-pin-ddr4-sdram/p/N82E16820232498",
                "85 $ = 25 KD", "1Sep",
                "G.SKILL TridentZ RGB Series 16GB (2 x 8GB) 288-Pin DDR4 SDRAM DDR4 3000 (PC4 24000) Memory (Desktop Memory) Model F4-3000C16D-16GTZR",
                "ahmed mohammed",
                "ahmed.mohammed@gmail.com",
                "0155444446",
                "DDR4 3000 (PC4 24000)\n" +
                        "Timing 16-18-18-38\n" +
                        "CAS Latency 16\n" +
                        "Voltage 1.35V"));

        productsList.add(new ProductsModel(21,"memory2","Team T-FORCE VULCAN Z 32GB",
                R.drawable.memory2,
                "https://www.newegg.com/team-32gb-288-pin-ddr4-sdram/p/N82E16820331362",
                "110 $ = 33 KD", "2Oct",
                "Team T-FORCE VULCAN Z 32GB (2 x 16GB) 288-Pin DDR4 SDRAM DDR4 3000 (PC4 24000) Desktop Memory Model TLZGD432G3000HC16CDC01",
                "ahmed mohammed",
                "ahmed.mohammed@gmail.com",
                "0155444446",
                "DDR4 3000 (PC4 24000)\n" +
                        "Timing 16-18-18-38\n" +
                        "CAS Latency 16\n" +
                        "Voltage 1.35V"));


        productsList.add(new ProductsModel(22,"memory3","Crucial 16GB Kit (8GBx2) DDR4 2400 MT/s",
                R.drawable.memory3,
                "https://www.newegg.com/crucial-16gb-260-pin-ddr4-so-dimm/p/0ZK-0070-00010",
                "64 $ = 20 KD", "3Oct",
                "Crucial 16GB Kit (8GBx2) DDR4 2400 MT/s (PC4-19200) 260-Pin SODIMM Memory - CT2K8G4SFS824A",
                "ahmed mohammed",
                "ahmed.mohammed@gmail.com",
                "0155444446",
                "Speeds start at 2133 MT/s and faster data rates are expected to be available as DDR4 technology matures\n" +
                        "Increase bandwidth by up to 30-Percent\n" +
                        "Reduce power consumption by up to 40-Percent and extend battery life\n" +
                        "Faster burst access speeds for improved sequential data throughput"));


        productsList.add(new ProductsModel(23,"memory4","Kingston 16GB (1 x 16GB) DDR4 2400MHz",
                R.drawable.memory4,
                "https://www.newegg.com/kingston-16gb-260-pin-ddr4-so-dimm/p/N82E16820242417",
                "70 $ = 21 KD", "4Oct",
                "Kingston 16GB (1 x 16GB) DDR4 2400MHz DRAM (Notebook Memory) 1.2V SODIMM (260-Pin) KCP424SD8/16",
                "marawan younes",
                "marawan.younes@gmail.com",
                "1457888",
                "Unbuffered\n" +
                        "Non-ECC\n" +
                        "100% Factory Tested at Speed\n" +
                        "Designed to meet JEDEC\n" +
                        "Free Technical Support"));

//___________________motherBoard
        productsList.add(new ProductsModel(24,"mother1","ASUS Prime Z390-A/H10 Motherboard Bundled Intel",
                R.drawable.mother1,
                "https://www.newegg.com/p/N82E16813119204?Item=N82E16813119204",
                "300 $ = 90 KD", "1Sep",
                "ASUS Prime Z390-A/H10 Motherboard Bundled Intel Optane Memory H10 with Solid State Storage (32GB + 512GB) LGA1151 (Intel 8th and 9th Gen) ATX DDR4 DP HDMI M.2 USB 3.1 Gen2 Gigabit LAN",
                "marawan younes",
                "marawan.younes@gmail.com",
                "1457888",
                "Intel Z390\n" +
                        "Intel Socket 1151 for 9th/8th Generation Core, Pentium / Celeron Processors\n" +
                        "DDR4 4266(O.C.)/ 2133 MHz\n" +
                        "Optimized BIOS for Intel Optane Memory H10: Pre-configured UEFI BIOS setting lets you easily set up Intel Optane Memory H10 with Solid State Storage\n" +
                        "Fast Storage: Bundled Intel Optane Memory H10 with Solid State Storage (32GB + 512GB, M.2 80mm PCIe 3.0, 3D XPoint, QLC) delivers a personalized computing experience with a new level of performance and large storage capacity\n" +
                        "AI overclocking: Quickly optimizes your CPU performance based on the CPU and cooler, achieving results that are extremely close to expert manual tuning\n"));

        productsList.add(new ProductsModel(25,"mother2","MSI B450 GAMING PLUS MAX AM4 AMD B450 SATA 6Gb/s ATX AMD Motherboard",
                R.drawable.mother2,
                "https://www.newegg.com/p/N82E16813144264",
                "100 $ = 30 KD", "2Oct",
                "MSI B450 GAMING PLUS MAX AM4 AMD B450 SATA 6Gb/s ATX AMD Motherboard",
                "marawan younes",
                "marawan.younes@gmail.com",
                "1457888",
                "AMD B450\n" +
                        "Supports 1st, 2nd and 3rd Gen AMD Ryzen, Ryzen with Radeon Vega Graphics, 2nd Gen AMD Ryzen with Radeon Graphics and Athlon with Radeon Vega Graphics Desktop Processors for Socket AM4\n" +
                        "For AMD Ryzen Gen3 (R5/R7/R9): Supports 4133/ 4000/ 3866/ 3733/ 3466/ 3200/ 3066/ 3000/ 2933/ 2800/ 2667 MHz (by A-XMP OC MODE)\n" +
                        "For AMD Other CPU: Supports 3466/ 3200/ 3066/ 3000/ 2933/ 2800/ 2667 MHz (by A-XMP OC MODE)\n" +
                        "Supports 2667/ 2400/ 2133/ 1866 MHz (by JEDEC)"));


        productsList.add(new ProductsModel(26,"mother3","GIGABYTE X570 I AORUS PRO WIFI AMD",
                R.drawable.mother3,
                "https://www.newegg.com/p/N82E16813145159",
                "220 $ = 66 KD", "3Oct",
                "GIGABYTE X570 I AORUS PRO WIFI AMD Ryzen 3000 PCIe 4.0 SATA 6Gb/s USB 3.2 AMD X570 Mini-ITX Motherboard",
                "marawan younes",
                "marawan.younes@gmail.com",
                "1457888",
                "Supports AMD 3rd Gen Ryzen / 2nd Gen Ryzen / Ryzen with Radeon Vega Graphics Processors\n" +
                        "Dual Channel ECC / Non-ECC Unbuffered DDR4, 2 DIMMs\n" +
                        "Direct 8 Phases IR Digital VRM Solution with PowIRstage\n" +
                        "Advanced Thermal Design with Extended & Multi-Layered Heatsink\n" +
                        "Dual Ultra-Fast NVMe PCIe 4.0/3.0 x4 M.2\n" +
                        "Intel Wi-Fi 6 802.11 ax & BT 5 with AORUS Antenna\n" +
                        "ALC1220-VB Enhance 114dB (Rear) / 110dB (Front) SNR in Microphone with Nichicon Audio Capacitors\n" +
                        "Intel Gigabit LAN\n" +
                        "RSmart Fan 5 - Hybrid Fan Headers with FAN STOP\n" +
                        "Rear USB 3.2 Gen 2 Type-C\n" +
                        "Integrated I/O Shield"));


        productsList.add(new ProductsModel(27,"mother4","SUPERMICRO MBD-X11SSV-Q-O Mini ITX Server Motherboard LGA 1151 Intel Q170",
                R.drawable.mother4,
                "https://www.newegg.com/supermicro-mbd-x11ssv-q-o-intel-6th-generation-core-i3-series-intel-6th-generation-core-i5-series-in/p/N82E16813182990?Item=N82E16813182990",
                "188 $ = 57 KD", "4Oct",
                "SUPERMICRO MBD-X11SSV-Q-O Mini ITX Server Motherboard LGA 1151 Intel Q170",
                "marawan younes",
                "marawan.younes@gmail.com",
                "1457888",
                "Intel 7th / 6th Gen. Core i3 series, Intel Celeron and Intel Pentium\n" +
                        "Intel Q170 Express chipset\n" +
                        "Up to 32GB Unbuffered Non-ECC SO-DIMM DDR4 2400 MHz; 2 x DIMM slots\n" +
                        "Dual GbE LAN w/ Intel i219LM + i210AT\n" +
                        "Supports 12V DC power input"));

        //________________computerAccesories
        productsList.add(new ProductsModel(28,"com_ac1","Cyber Acoustics ACM-51B Black 3.5mm Connector Desktop Microphone",
                R.drawable.com_ac1,
                "https://www.newegg.com/black-cyber-acoustics-acm-51b-3-5mm-connector/p/N82E16836150080",
                "5 $ = 1.5 KD", "1Sep",
                "Cyber Acoustics ACM-51B Black 3.5mm Connector Desktop Microphone",
                "marawan younes",
                "marawan.younes@gmail.com",
                "1457888",
                "100-16K Hz\n" +
                        "3.5mm Connector"));

        productsList.add(new ProductsModel(29,"com_ac2","Logitech MK270 Wireless Keyboard and Mouse Combo",
                R.drawable.com_ac2,
                "https://www.newegg.com/logitech-wireless-combo-mk270-920-004536-usb-2-0-rf-wireless/p/N82E16823126332",
                "22 $ = 6 KD", "2Sep",
                "Logitech MK270 Wireless Keyboard and Mouse Combo 920-004536 - USB 2.0 RF Wireless Ergonomic Keyboard & Mouse",
                "marawan younes",
                "marawan.younes@gmail.com",
                "1457888",
                "8 Function Keys\n" +
                        "USB 2.0 RF Wireless\n" +
                        "Logitech\n" +
                        "Black"));


        productsList.add(new ProductsModel(30,"com_ac3","ARCTIC Accelero L2 Plus VGA Cooler - nVidia & AMD ",
                R.drawable.com_ac3,
                "https://www.newegg.com/white-arctic-cooling-accel-l2-plus/p/N82E16835186053",
                "22 $ = 6 KD", "3Sep",
                "ARCTIC Accelero L2 Plus VGA Cooler - nVidia & AMD, 92mm Efficient PWM Fan, SLI/CrossFire\n",
                "marawan younes",
                "marawan.younes@gmail.com",
                "1457888",
                "ARCTIC Accelero L2 Plus VGA Cooler - nVidia & AMD, 92mm Efficient PWM Fan, SLI/CrossFire"));


        productsList.add(new ProductsModel(31,"com_ac4","Logitech F310 (940-000110) Gamepad",
                R.drawable.com_ac4,
                "https://www.newegg.com/black-logitech-f310-gaming-pad/p/N82E16826104402?Description=pc%20game%20controller&cm_re=pc_game_controller-_-26-104-402-_-Product",
                "22 $ = 6 KD", "4Sep",
                "Logitech F310 (940-000110) Gamepad",
                "khaled helal",
                "khaled.helal@gmail.com",
                "2457899",
                "Familiar layout for easy navigation\n" +
                        "Exclusive 4-switch D-pad for better response\n" +
                        "Compatible with a variety of old and current games\n" +
                        "6-foot cable so you can play from a comfortable distance\n" +
                        "Comfortable hand grip for hours of fun\n" +
                        "Compatible with Windows 8, 7 and Vista"));

        //__________________cabels
        productsList.add(new ProductsModel(32,"cab1","Rosewill HDMI Pro-6 - 6-Foot Black High Speed HDMI Cable",
                R.drawable.cab1,
                "https://www.newegg.com/black-rosewill-6-feet-hdmi-cables/p/N82E16886228007",
                "6 $ = 1.5 KD", "1Sep",
                "Rosewill HDMI Pro-6 - 6-Foot Black High Speed HDMI Cable with 3D & 4K Supported, 10.2 Gbps Transfer Rate - Male to Male",
                "khaled helal",
                "khaled.helal@gmail.com",
                "2457899",
                "6 Foot Long HDMI Cable\n" +
                        "Male to Male / HDMI to HDMI\n" +
                        "Supports 3D and 4K Resolutions\n" +
                        "Black Cable with Gold-plated Connectors\n" +
                        "High Speed HDMI 1.4 Cable with Ethernet Cablel"));

        productsList.add(new ProductsModel(33,"cab2","Coboc CL-MDP2DVI-6-WH 6 ft. 32AWG Mini DisplayPort(Thunderbolt Compatible)",
                R.drawable.cab2,
                "https://www.newegg.com/p/N82E16812423130",
                "7 $ = 2 KD", "2Oct",
                "Coboc CL-MDP2DVI-6-WH 6 ft. 32AWG Mini DisplayPort(Thunderbolt Compatible) Male to DVI-D(24+1) Male Passive Adatper Converter Cable,Gold Plated,White -mDP to DVI - 1920 x 1200 Resolution",
                "khaled helal",
                "khaled.helal@gmail.com",
                "2457899",
                "Mini DisplayPort to DVI Passive Converter Cable\n" +
                        "Requires a Dual-mode DisplayPort(DP++)source\n" +
                        "Compatible with Intel® Thunderbolt™\n" +
                        "HDTV Resolutions up to 1080P"));


        productsList.add(new ProductsModel(34,"cab3","Sabrent USB 2.0 TO SERIAL DB9 MALE (9 PIN) RS232 CABLE ADAPTER ",
                R.drawable.cab3,
                "https://www.newegg.com/p/N82E16812203018",
                "10 $ = 3 KD", "3Oct",
                "Sabrent USB 2.0 TO SERIAL DB9 MALE (9 PIN) RS232 CABLE ADAPTER 1 ft. Prolific Chipset (CB-RS232)",
                "khaled helal",
                "khaled.helal@gmail.com",
                "2457899",
                "2 Connector Number\n" +
                        "White\n" +
                        "Male to Male"));


        productsList.add(new ProductsModel(35,"cab4","C2G 30823 14 AWG 250 Volt Power Extension Cord",
                R.drawable.cab4,
                "https://www.newegg.com/black-cables-to-go-6-ft-cable-connectors/p/N82E16812196453",
                "10 $ = 3 KD", "4Oct",
                "C2G 30823 14 AWG 250 Volt Power Extension Cord - IEC320C14 (C14) to IEC320C13 (C13), TAA Compliant, Black (6 Feet, 1.82 Meters)",
                "nada adel",
                "nada.adel@gmail.com",
                "12547899",
                "TAA Compliant\n" +
                        "Fully molded cord for durability\n" +
                        "Allows you to extend the length of your current power cable"));






















/* ,"",
        "",
        "",
        "",
        ""*/


        return productsList;
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
