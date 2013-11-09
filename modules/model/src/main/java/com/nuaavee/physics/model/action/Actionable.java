// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.model.action;

import com.google.common.collect.Lists;
import com.nuaavee.physics.model.action.listener.ActionListener;
import java.util.List;

/**
 * @author Adobe Systems Inc
 */
public abstract class Actionable {

  private final List<ActionListener> actionListeners = Lists.newArrayList();

  public void addActionListener(ActionListener actionListener) {
    actionListener.setActionable(this);
    actionListeners.add(actionListener);
  }

  public boolean handleAction(ActionEvent actionEvent) {
    boolean eventHandled = false;
    for (ActionListener actionListener : actionListeners) {
      if (actionListener.invoke(actionEvent)) {
        eventHandled = true;
      }
    }
    return eventHandled;
  }
}
