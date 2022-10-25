package com.example.a2018113_recylceview.datas;

import com.example.a2018113_recylceview.R;
import com.example.a2018113_recylceview.models.Plant;

import java.util.ArrayList;

public class PlantData {
    private static String[] plantName = {
            "Echeveria Lolita",
            "Pachyphytum",
            "Echeveria Agavoides",
            "Echeveria Laui",
            "Echeveria Runyonii",
            "Pachyphytum Bracteosum",
            "Pachytum Oviferum",
            "Echeveria Hookeri",
    };

    private static String[] plantSpecies = {
            "Sukulen Echeveria",
            "Sukulen Pachyphytum",
            "Sukulen Echeveria",
            "Sukulen Echeveria",
            "Sukulen Echeveria",
            "Sukulen Pachyphytum",
            "Sukulen Pachyphytum",
            "Sukulen Echeveria"
    };

    private static int[] plantImage = {
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4,
            R.drawable.gambar5,
            R.drawable.gambar6,
            R.drawable.gambar7,
            R.drawable.gambar8,
    };

    private static String[] plantDescription = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Semper feugiat nibh sed pulvinar proin gravida. Tristique senectus et netus et. In dictum non consectetur a erat nam at lectus. Vulputate ut pharetra sit amet aliquam id diam maecenas. Cras tincidunt lobortis feugiat vivamus. Odio eu feugiat pretium nibh ipsum consequat nisl. Magna fermentum iaculis eu non diam phasellus vestibulum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Fringilla est ullamcorper eget nulla facilisi. Scelerisque fermentum dui faucibus in ornare. Scelerisque eleifend donec pretium vulputate sapien nec sagittis aliquam malesuada. Faucibus pulvinar elementum integer enim neque. Non pulvinar neque laoreet suspendisse. Faucibus nisl tincidunt eget nullam non. Lacus suspendisse faucibus interdum posuere lorem ipsum. Dolor morbi non arcu risus quis varius.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Cras adipiscing enim eu turpis egestas pretium aenean. Mattis ullamcorper velit sed ullamcorper morbi tincidunt. Gravida dictum fusce ut placerat orci. Magna ac placerat vestibulum lectus mauris ultrices eros. Lorem donec massa sapien faucibus et molestie. Suscipit adipiscing bibendum est ultricies integer. Eget nunc lobortis mattis aliquam.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Cras semper auctor neque vitae tempus quam. Fringilla urna porttitor rhoncus dolor purus. Orci eu lobortis elementum nibh tellus molestie. Accumsan in nisl nisi scelerisque eu ultrices vitae. Sit amet justo donec enim diam vulputate ut pharetra. Consectetur a erat nam at lectus.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Amet dictum sit amet justo donec enim. Aliquam etiam erat velit scelerisque in dictum non. Quam adipiscing vitae proin sagittis. Cras adipiscing enim eu turpis egestas pretium. Interdum varius sit amet mattis. Eget nunc lobortis mattis aliquam faucibus purus in massa tempor.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget egestas purus viverra accumsan in nisl. Volutpat lacus laoreet non curabitur gravida arcu ac. Velit laoreet id donec ultrices tincidunt arcu non sodales. Ut lectus arcu bibendum at varius vel pharetra vel turpis. Diam phasellus vestibulum lorem sed risus ultricies tristique. Risus nec feugiat in fermentum posuere urna.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Massa tempor nec feugiat nisl pretium fusce id velit ut. At consectetur lorem donec massa sapien faucibus. Vulputate ut pharetra sit amet aliquam. Morbi tincidunt ornare massa eget egestas purus viverra accumsan in. Bibendum enim facilisis gravida neque convallis a cras semper auctor. Augue neque gravida in fermentum et sollicitudin ac.",
    };

    public static ArrayList<Plant> getDataPlant() {
        ArrayList<Plant> list = new ArrayList<>();
        for (int i = 0; i < plantName.length; i++) {
            Plant plant = new Plant(plantName[i], plantSpecies[i], plantImage[i], plantDescription[i]);
            list.add(plant);
        }
        return list;
    }
}
