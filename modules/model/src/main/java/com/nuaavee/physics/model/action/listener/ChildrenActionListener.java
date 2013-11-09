// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.model.action.listener;

import com.google.common.collect.Lists;
import com.nuaavee.physics.model.PhysicalObject;
import com.nuaavee.physics.model.action.ActionEvent;
import java.util.List;

/**
 * @author Adobe Systems Inc
 */
public class ChildrenActionListener extends AbstractActionListener {

  private final List<PhysicalObject> children;

  public ChildrenActionListener(PhysicalObject... children) {
    this.children = Lists.newArrayList(children);
  }

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
