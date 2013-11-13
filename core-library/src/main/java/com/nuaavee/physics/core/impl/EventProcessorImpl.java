// Copyright 2003-2013 Adobe Systems Inc. All Rights Reserved.
// This software is proprietary; use is subject to license terms.
package com.nuaavee.physics.core.impl;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.nuaavee.physics.core.EventProcessor;
import com.nuaavee.physics.core.layer.LayerManager;
import com.nuaavee.physics.model.action.ActionEvent;
import com.nuaavee.physics.model.action.Actionable;
import roboguice.inject.ContextSingleton;

/**
 * @author Adobe Systems Inc
 */
@ContextSingleton
public class EventProcessorImpl implements EventProcessor {

  private final LayerManager layerManager;

  @Inject
  public EventProcessorImpl(LayerManager layerManager) {
    this.layerManager = layerManager;
  }

  @Override
  public boolean process(final ActionEvent actionEvent) {
    for (Actionable actionableLayer : Lists.reverse(layerManager.getLayers())) {
        if (actionableLayer.handleAction(actionEvent)) {
          return true;
        }
    }
    return false;
  }

}
