// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.model.layer;

import android.graphics.Canvas;
import com.nuaavee.physics.model.action.Actionable;

/**
 * @author Adobe Systems Inc
 */
public abstract class Layer extends Actionable {

  public abstract void draw(Canvas canvas);

}
