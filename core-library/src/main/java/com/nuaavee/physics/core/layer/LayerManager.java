// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.core.layer;

import com.nuaavee.physics.model.layer.Layer;
import java.util.List;

/**
 * @author Adobe Systems Inc
 */
public interface LayerManager {

  List<Layer> getLayers();

  void addLayer(Layer layer);
}
