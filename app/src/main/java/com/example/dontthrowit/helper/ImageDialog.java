package com.example.dontthrowit.helper;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;


/**
 * Created by mostafa kamal khedr on 16,September,2018
 */
public class ImageDialog {


//    private static ProgressBar progressBar;



    public static RequestOptions getRequestOption() {

        RequestOptions options = new RequestOptions()
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .priority(Priority.HIGH)

                .skipMemoryCache(true);
        return options;
    }
/*    public static int getImage(int imageName,Context  context) {
                                               .getResources().getDrawable
        int drawableResourceId = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
        Drawable drawable = context.getResources().getDrawable(imageName);
        return drawableResourceId;
    }*/

}
