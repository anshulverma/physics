// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.model.layer;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * @author Adobe Systems Inc
 */
public class BackgroundLayer extends Layer {

  private final Paint paint;

  public BackgroundLayer(int color) {
    paint = new Paint();
    paint.setColor(color);
    paint.setStyle(Paint.Style.FILL);
  }

  @Override
  public void draw(Canvas canvas) {
    canvas.drawRect(0, 0, canvas.getWidth(), canvas.getHeight(), paint);
  }

}
