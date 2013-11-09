package com.nuaavee.physics.core;

import com.google.inject.AbstractModule;
import com.nuaavee.physics.core.impl.EventProcessorImpl;
import com.nuaavee.physics.core.impl.ShellImpl;
import com.nuaavee.physics.core.layer.LayerManager;
import com.nuaavee.physics.core.layer.impl.LayerManagerImpl;

/**
 * @author nuaavee
 */
public class CoreModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(LayerManager.class).to(LayerManagerImpl.class);
    bind(EventProcessor.class).to(EventProcessorImpl.class);
    bind(Shell.class).to(ShellImpl.class);
  }
}
