package com.nuaavee.physics.circle;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.nuaavee.physics.model.Coordinate;
import com.nuaavee.physics.model.PhysicalObject;

/**
 * @author nuaavee
 */
public class Circle extends PhysicalObject {

  private final float radius;
  private final Paint paint;

  public Circle(float radius, Coordinate position, int color) {
    super(position);
    this.radius = radius;
    paint = new Paint();
    paint.setColor(color);
    paint.setStyle(Paint.Style.FILL);
  }

  @Override
  public void draw(Canvas canvas) {
    canvas.drawCircle(getPosition().getX(), getPosition().getY(), radius, paint);
  }
}
