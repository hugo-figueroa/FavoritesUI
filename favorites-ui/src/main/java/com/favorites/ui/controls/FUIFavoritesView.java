package com.favorites.ui.controls;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.favorites.ui.R;
import com.favorites.ui.utils.FUIConstants;

/**
 * 14/03/18
 */
public class FUIFavoritesView extends LinearLayout {

    private AppCompatImageView imgvProduct, imgvConditionType, imgvPlusLevel, imgvImported, imgvFreeShipping;

    public FUIFavoritesView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initViews(context, attrs);
    }

    public void initViews(Context context, @Nullable AttributeSet attrs) {
        inflate(context, R.layout.fui_favorites_view, this);

        imgvProduct = findViewById(R.id.imgvProduct);
        imgvConditionType = findViewById(R.id.imgvConditionType);
        imgvPlusLevel = findViewById(R.id.imgvPlusLevel);
        imgvImported = findViewById(R.id.imgvImported);
        imgvFreeShipping = findViewById(R.id.imgvFreeShipping);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.FUIFavoritesView);

        Drawable productImage = a.getDrawable(R.styleable.FUIFavoritesView_product_image);
        String conditionTypeImage = a.getString(R.styleable.FUIFavoritesView_condition_type);
        Integer plusLevelImage = a.getInteger(R.styleable.FUIFavoritesView_plus_level, 0);
        boolean importedImage = a.getBoolean(R.styleable.FUIFavoritesView_imported, false);
        boolean freeShippingImage = a.getBoolean(R.styleable.FUIFavoritesView_free_shipping, false);

        a.recycle();

        setProductImageDrawable(productImage);
        setData(conditionTypeImage, plusLevelImage, importedImage, freeShippingImage);

    }

    public void setData(String conditionType, int plusLevel, boolean imported, boolean freeShipping) {
        imgvConditionType.setVisibility(VISIBLE);
        imgvPlusLevel.setVisibility(VISIBLE);
        imgvImported.setVisibility(VISIBLE);
        imgvFreeShipping.setVisibility(VISIBLE);

        if (conditionType != null && conditionType.equals(FUIConstants.FUI_NEW)) {
            imgvConditionType.setImageDrawable(getResources().getDrawable(R.drawable.ic_nd_ic_new_30));
        } else if (conditionType.equals(FUIConstants.FUI_REFURBISEHD)) {
            imgvConditionType.setImageDrawable(getResources().getDrawable(R.drawable.ic_nd_ic_refurbished_30));
        } else {
            imgvConditionType.setVisibility(GONE);
        }

        if (plusLevel == FUIConstants.FUI_PLUS_LEVEL_1) {
            imgvPlusLevel.setImageDrawable(getResources().getDrawable(R.drawable.ic_nd_ic_plus_30));
        } else if (plusLevel == FUIConstants.FUI_PLUS_LEVEL_2) {
            imgvPlusLevel.setImageDrawable(getResources().getDrawable(R.drawable.ic_nd_ic_plus_48_30));
        } else {
            imgvPlusLevel.setVisibility(GONE);
        }

        if (imported) {
            imgvImported.setImageDrawable(getResources().getDrawable(R.drawable.ic_nd_ic_international_30));
        } else {
            imgvImported.setVisibility(GONE);
        }

        if (freeShipping) {
            imgvFreeShipping.setImageDrawable(getResources().getDrawable(R.drawable.ic_nd_ic_free_shipping_30));
        } else {
            imgvFreeShipping.setVisibility(GONE);
        }
    }

    public void setProductImageDrawable(Drawable drawable) {
        if (drawable != null)
            imgvProduct.setImageDrawable(drawable);
    }

    public void setProductImageBitmap(Bitmap bitmap) {
        if (bitmap != null)
            imgvProduct.setImageBitmap(bitmap);
    }

    public void setConditionTypeImageDrawable(Drawable drawable) {
        if (drawable != null)
            imgvConditionType.setImageDrawable(drawable);
    }

    public void setConditionTypeImageBitmap(Bitmap bitmap) {
        if (bitmap != null)
            imgvConditionType.setImageBitmap(bitmap);
    }

    public void setPlusLevelImageDrawable(Drawable drawable) {
        if (drawable != null)
            imgvPlusLevel.setImageDrawable(drawable);
    }

    public void setPlusLevelImageBitmap(Bitmap bitmap) {
        if (bitmap != null)
            imgvPlusLevel.setImageBitmap(bitmap);
    }

    public void setImportedImageDrawable(Drawable drawable) {
        if (drawable != null)
            imgvImported.setImageDrawable(drawable);
    }

    public void setImportedImageBitmap(Bitmap bitmap) {
        if (bitmap != null)
            imgvImported.setImageBitmap(bitmap);
    }

    public void setFreeShippingImageDrawable(Drawable drawable) {
        if (drawable != null)
            imgvFreeShipping.setImageDrawable(drawable);
    }

    public void setFreeShippingImageBitmap(Bitmap bitmap) {
        if (bitmap != null)
            imgvFreeShipping.setImageBitmap(bitmap);
    }
}
