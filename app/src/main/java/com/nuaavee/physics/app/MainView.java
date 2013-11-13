package com.nuaavee.physics.app;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.nuaavee.physics.core.InjectorHelper;
import com.nuaavee.physics.core.Shell;

/**
 * @author nuaavee
 */
public class MainView extends View {

  private final Shell shell;

  public MainView(Context context) {
    super(context);
    shell = InjectorHelper.getInstance(Shell.class, context);
    shell.activate();
  }


  @Override
  public boolean onTouchEvent(MotionEvent event) {
    return shell.handleTouchEvent(event);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
//    Paint paint = new Paint();
//    paint.setColor(Color.WHITE);
//    paint.setStrokeWidth(2);
//    paint.setColor(Color.BLUE);
//    paint.setStrokeWidth(2);
//    paint.setStyle(Paint.Style.FILL);
//    canvas.drawRect(5, 5, canvas.getWidth() - 5, canvas.getHeight() - 5, paint);

    shell.draw(canvas);
  }
}
