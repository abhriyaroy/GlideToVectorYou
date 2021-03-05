package com.github.twocoffeesoneteam.glidetovectoryou;

import android.graphics.drawable.PictureDrawable;

import androidx.annotation.Nullable;

public interface GlideToVectorYouListener {
    void onLoadFailed();
    void onResourceReady(@Nullable PictureDrawable pictureDrawable);
}
