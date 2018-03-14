package com.favorites.ui.controls;

import android.content.Context;
import android.content.res.TypedArray;
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
        initViews(context, attrs);
    }

    public void initViews(Context context, @Nullable AttributeSet attrs) {
        inflate(context, R.layout.fui_collection_view, this);

        imgvCollectionItem1 = findViewById(R.id.imgvCollectionItem1);
        imgvCollectionItem2 = findViewById(R.id.imgvCollectionItem2);
        imgvCollectionItem3 = findViewById(R.id.imgvCollectionItem3);

        txvCollectionTitle = findViewById(R.id.txvCollectionTitle);
        txvCollectionQuantity = findViewById(R.id.txvCollectionQuantity);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.FUICollectionView);

        Drawable collection_image1 = a.getDrawable(R.styleable.FUICollectionView_collection_image1);
        Drawable collection_image2 = a.getDrawable(R.styleable.FUICollectionView_collection_image2);
        Drawable collection_image3 = a.getDrawable(R.styleable.FUICollectionView_collection_image3);
        String collection_title = a.getString(R.styleable.FUICollectionView_collection_title);
        Integer collection_quantity = a.getInteger(R.styleable.FUICollectionView_collection_quantity, -1);

        a.recycle();

        setCollectionImage1Drawable(collection_image1);
        setCollectionImage2Drawable(collection_image2);
        setCollectionImage3Drawable(collection_image3);
        setCollectionTitle(collection_title);
        setCollectionQuantity(collection_quantity);
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

    public void setCollectionQuantity(int collectionQuantity) {
        if (collectionQuantity >= 0)
            txvCollectionQuantity.setText("" + collectionQuantity);
    }

}
