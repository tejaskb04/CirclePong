package com.tejas_bharadwaj.circlepong;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.MotionEvent;
import android.view.View;

public class GameView extends View {

    private Paint paint;
    private Drawable leftArrow = ContextCompat.getDrawable(getContext(), R.drawable
            .ic_arrow_back_black_24dp);
    private Drawable rightArrow = ContextCompat.getDrawable(getContext(), R.drawable
            .ic_arrow_forward_black_24dp);
    private Bitmap bitmapLeftArrow;
    private Bitmap bitmapRightArrow;

    public GameView(Context context) {
        super(context);
        paint = new Paint();
        bitmapLeftArrow = drawableToBitmap(leftArrow);
        bitmapRightArrow = drawableToBitmap(rightArrow);
    }

    private Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        else {
            Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable
                    .getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int radius = 400;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setColor(Color.parseColor("#ff0000"));
        canvas.drawCircle(width / 2, height / 2, radius, paint);
        canvas.drawBitmap(bitmapLeftArrow, width / 2 - 400, 1600, paint);
        canvas.drawBitmap(bitmapRightArrow, width / 2 + 400, 1600, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                //if ()
                return true;
            }
            default: {
                return false;
            }
        }
    }
}