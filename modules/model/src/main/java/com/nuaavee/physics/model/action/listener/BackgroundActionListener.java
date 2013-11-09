// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.model.action.listener;

import com.nuaavee.physics.model.action.ActionEvent;

/**
 * @author Adobe Systems Inc
 */
public class BackgroundActionListener extends AbstractActionListener {

  @Override
  public boolean onActionUp(ActionEvent actionEvent) {
    return false;
  }

  @Override
  public boolean onActionDown(ActionEvent actionEvent) {
    return false;
  }

  @Override
  public boolean onActionMove(ActionEvent actionEvent) {
    return false;
  }
}
