// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.core.action;

import android.view.MotionEvent;
import com.nuaavee.physics.model.action.ActionEvent;
import com.nuaavee.physics.model.action.ActionEventType;

/**
 * @author Adobe Systems Inc
 */
public final class ActionEventFactory {

  private ActionEventFactory() { }

  public static ActionEvent getActionEvent(MotionEvent motionEvent) {
    ActionEvent actionEvent = new ActionEvent();
    actionEvent.setActionEventType(getActionEventType(motionEvent));
    actionEvent.setX(motionEvent.getX());
    actionEvent.setY(motionEvent.getY());
    return actionEvent;
  }

  private static ActionEventType getActionEventType(MotionEvent motionEvent) {
    switch (motionEvent.getAction()) {
      case MotionEvent.ACTION_DOWN:
        return ActionEventType.ACTION_DOWN;
      case MotionEvent.ACTION_MOVE:
        return ActionEventType.ACTION_MOVE;
      case MotionEvent.ACTION_UP:
        return ActionEventType.ACTION_UP;
      default:
        return ActionEventType.UNKNOWN;
    }
  }
}
