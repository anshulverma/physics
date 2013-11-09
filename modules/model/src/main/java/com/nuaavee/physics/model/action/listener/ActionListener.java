// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.model.action.listener;

import com.nuaavee.physics.model.action.ActionEvent;
import com.nuaavee.physics.model.action.Actionable;

/**
 * @author Adobe Systems Inc
 */
public interface ActionListener {

  boolean invoke(ActionEvent actionEvent);

  void setActionable(Actionable actionable);

  boolean onActionUp(ActionEvent actionEvent);

  boolean onActionDown(ActionEvent actionEvent);

  boolean onActionMove(ActionEvent actionEvent);

}
