// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.model.layer;

import android.graphics.Canvas;
import com.nuaavee.physics.model.PhysicalObject;
import com.nuaavee.physics.model.action.listener.ChildrenActionListener;

/**
 * @author Adobe Systems Inc
 */
public class DaynamicLayer extends Layer {

  private final PhysicalObject physicalObject;

  public DaynamicLayer(PhysicalObject physicalObject) {
    this.physicalObject = physicalObject;
    addActionListener(new ChildrenActionListener(physicalObject));
  }

  @Override
  public void draw(Canvas canvas) {
    physicalObject.draw(canvas);
  }

}
