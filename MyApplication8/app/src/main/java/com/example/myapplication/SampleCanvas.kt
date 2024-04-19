package com.example.myapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class SampleCanvas @JvmOverloads constructor(
    context: Context?,
    attrs: AttributeSet?,
    defStyleAttr: Int=0
) : View(context, attrs, defStyleAttr) {
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val paint: Paint = Paint()
        paint.setColor(Color.BLUE)
        canvas.drawPaint(paint)
        paint.setColor(Color.GREEN)
        paint.textSize=50f
        canvas.drawText("Circle",50f,150f,paint)
        canvas.drawCircle(200f,300f,100f,paint)
        paint.setColor(Color.WHITE)
        canvas.drawText("Circle",50f,150f,paint)
        canvas.drawRect(500f,250f,700f,700f,paint)
        canvas.drawText("Rectangle",500f,150f,paint)
        canvas.drawRect(200f,800f,100f,700f,paint)
        canvas.drawText("Square",50f,600f,paint)
        canvas.drawLine(100f,900f,800f,900f,paint)
        canvas.drawText("line",150f,900f,paint)




    }
}