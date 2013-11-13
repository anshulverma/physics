package com.nuaavee.physics.core.impl;

import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import com.google.inject.Inject;
import com.nuaavee.physics.circle.Circle;
import com.nuaavee.physics.core.EventProcessor;
import com.nuaavee.physics.core.Shell;
import com.nuaavee.physics.core.action.ActionEventFactory;
import com.nuaavee.physics.core.layer.LayerManager;
import com.nuaavee.physics.model.Coordinate;
import com.nuaavee.physics.model.action.ActionEvent;
import com.nuaavee.physics.model.action.listener.BackgroundActionListener;
import com.nuaavee.physics.model.action.listener.PhysicalObjectActionListener;
import com.nuaavee.physics.model.layer.BackgroundLayer;
import com.nuaavee.physics.model.layer.DaynamicLayer;
import com.nuaavee.physics.model.layer.Layer;
import roboguice.inject.ContextSingleton;

/**
 * @author nuaavee
 */
@ContextSingleton
public class ShellImpl implements Shell {

  private final LayerManager layerManager;
  private final EventProcessor eventProcessor;

  @Inject
  public ShellImpl(LayerManager layerManager, EventProcessor eventProcessor) {
    this.layerManager = layerManager;
    this.eventProcessor = eventProcessor;
  }

  @Override
  public void activate() {
    Layer backgroundLayer = new BackgroundLayer(Color.rgb(50, 50, 50));
    backgroundLayer.addActionListener(new BackgroundActionListener());
    layerManager.addLayer(backgroundLayer);

    Circle circle = new Circle(10, new Coordinate(50, 50), Color.YELLOW);
    circle.addActionListener(new PhysicalObjectActionListener());
    layerManager.addLayer(new DaynamicLayer(circle));
  }

  @Override
  public void draw(Canvas canvas) {
    for (Layer layer : layerManager.getLayers()) {
      layer.draw(canvas);
    }
  }

  @Override
  public boolean handleTouchEvent(MotionEvent event) {
    ActionEvent actionEvent = ActionEventFactory.getActionEvent(event);
    return eventProcessor.process(actionEvent);
  }
}
