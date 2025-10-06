package com.example.canvasdemoapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(new MyDraw(this));

    }
}

class MyDraw extends View {

    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.GRAY);

        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        canvas.drawCircle(getWidth() / 2, getHeight() / 2, 200, paint);

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        canvas.drawRect(100, 100, 800, 500, paint);

        paint.setTextSize(76f);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawText("Android", 100, 1500, paint);

        paint.setColor(Color.RED);
        canvas.drawOval(500, 500, 1000, 700, paint);

    }
}