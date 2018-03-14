package com.favorites.ui.controls;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.favorites.ui.R;

/**
 * 14/03/18
 */
public class FUICollectionView extends LinearLayout {

    private AppCompatImageView imgvCollectionItem1, imgvCollectionItem2, imgvCollectionItem3;
    private TextView txvCollectionTitle, txvCollectionQuantity;

    public FUICollectionView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initViews();
    }

    public void initViews() {
        inflate(this.getContext(), R.layout.fui_collection_view, this);

        imgvCollectionItem1 = findViewById(R.id.imgvCollectionItem1);
        imgvCollectionItem2 = findViewById(R.id.imgvCollectionItem2);
        imgvCollectionItem3 = findViewById(R.id.imgvCollectionItem3);

        txvCollectionTitle = findViewById(R.id.txvCollectionTitle);
        txvCollectionQuantity = findViewById(R.id.txvCollectionQuantity);

    }

    public void setCollectionImage1Drawable(Drawable drawable) {
        if (drawable != null)
            imgvCollectionItem1.setImageDrawable(drawable);
    }

    public void setCollectionImage1Bitmap(Bitmap bitmap) {
        if (bitmap != null)
            imgvCollectionItem1.setImageBitmap(bitmap);
    }

    public void setCollectionImage2Drawable(Drawable drawable) {
        if (drawable != null)
            imgvCollectionItem2.setImageDrawable(drawable);
    }

    public void setCollectionImage2Bitmap(Bitmap bitmap) {
        if (bitmap != null)
            imgvCollectionItem2.setImageBitmap(bitmap);
    }

    public void setCollectionImage3Drawable(Drawable drawable) {
        if (drawable != null)
            imgvCollectionItem3.setImageDrawable(drawable);
    }

    public void setCollectionImage3Bitmap(Bitmap bitmap) {
        if (bitmap != null)
            imgvCollectionItem3.setImageBitmap(bitmap);
    }

    public void setCollectionTitle(String collectionTitle) {
        if (collectionTitle != null)
            txvCollectionTitle.setText(collectionTitle);
    }

    public void setCollectionQuantity(String collectionQuantity) {
        if (collectionQuantity != null)
            txvCollectionTitle.setText(collectionQuantity);
    }

}
