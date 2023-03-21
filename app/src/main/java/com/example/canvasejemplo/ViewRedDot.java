package com.example.canvasejemplo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class ViewRedDot extends View{

    public ViewRedDot (Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        Paint circle = new Paint();
        circle.setColor(Color.YELLOW); // color del circulo
        canvas.drawCircle(canvas.getWidth()/2, canvas.getHeight()/2, canvas.getWidth()/3, circle);


        //Rectangulo
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        paint.setColor(Color.BLUE);

        int ancho = canvas.getWidth();
        canvas.drawRect(10,70,ancho-10,20,paint);
        



    }
}

