package com.nuaavee.physics.model;

import android.graphics.Canvas;
import com.nuaavee.physics.model.action.Actionable;

/**
 * @author nuaavee
 */
public abstract class PhysicalObject extends Actionable {

  private final Coordinate position;

  public PhysicalObject(Coordinate position) {
    this.position = position;
  }

  public Coordinate getPosition() {
    return position;
  }

  public abstract void draw(Canvas canvas);

}
