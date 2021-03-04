package com.github.twocoffeesoneteam.glidetovectoryou;

import android.graphics.drawable.PictureDrawable;

public interface GlideToVectorYouListener {
    void onLoadFailed();
    void onResourceReady(PictureDrawable pictureDrawable);
}
