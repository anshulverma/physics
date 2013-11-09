// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.model.action;

/**
 * @author Adobe Systems Inc
 */
public class ActionEvent {

  private ActionEventType eventType;
  private float x;
  private float y;

  public ActionEventType getEventType() {
    return eventType;
  }

  public void setActionEventType(ActionEventType actionEventType) {
    this.eventType = actionEventType;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getX() {
    return x;
  }

  public void setY(float y) {
    this.y = y;
  }

  public float getY() {
    return y;
  }
}
