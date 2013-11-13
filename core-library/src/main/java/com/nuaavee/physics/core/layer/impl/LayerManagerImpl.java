// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.core.layer.impl;

import com.google.common.collect.Lists;
import com.nuaavee.physics.core.layer.LayerManager;
import com.nuaavee.physics.model.layer.Layer;
import roboguice.inject.ContextSingleton;
import java.util.List;

/**
 * @author Adobe Systems Inc
 */
@ContextSingleton
public class LayerManagerImpl implements LayerManager {

  private final List<Layer> layers = Lists.newArrayList();

  @Override
  public void addLayer(Layer layer) {
    layers.add(layer);
  }

  @Override
  public List<Layer> getLayers() {
    return layers;
  }
}
