package com.nuaavee.physics.core;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * @author nuaavee
 */
public interface Shell {

  void activate();

  void draw(Canvas canvas);

  /**
   * Handles touch events.
   * @param event Event to be handled.
   * @return <code>true</code> if the event was handled, <code>false</code> otherwise.
   */
  boolean handleTouchEvent(MotionEvent event);

}
