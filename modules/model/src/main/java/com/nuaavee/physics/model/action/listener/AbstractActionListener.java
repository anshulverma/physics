// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.model.action.listener;

import com.google.common.base.Preconditions;
import com.nuaavee.physics.model.action.ActionEvent;
import com.nuaavee.physics.model.action.Actionable;

/**
 * @author Adobe Systems Inc
 */
public abstract class AbstractActionListener implements ActionListener {

  private Actionable actionable;

  @Override
  public void setActionable(Actionable actionable) {
    this.actionable = actionable;
  }

  @Override
  public boolean invoke(ActionEvent actionEvent) {
    Preconditions.checkNotNull(actionable, "actionable cannot be null");
    switch (actionEvent.getEventType()) {
      case ACTION_DOWN:
        return onActionDown(actionEvent);
      case ACTION_UP:
        return onActionUp(actionEvent);
      case ACTION_MOVE:
        return onActionMove(actionEvent);
      default:
        return false;
    }
  }

}
