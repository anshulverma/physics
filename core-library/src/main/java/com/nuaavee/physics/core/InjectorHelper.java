package com.nuaavee.physics.core;

import com.google.common.collect.ImmutableList;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.nuaavee.physics.circle.CircleModule;
import com.nuaavee.physics.model.ModelModule;
import java.util.List;

/**
 * @author nuaavee
 */
public final class InjectorHelper {

  private static final List<Module> MODULES = ImmutableList.<Module> builder()
      .add(new ModelModule())
      .add(new CircleModule())
      .add(new CoreModule())
      .build();

  private static Injector injector = null;

  private InjectorHelper() { }

  public static Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(MODULES);
    }
    return injector;
  }

  public static <T> T getInstance(Class<T> type) {
    return getInjector().getInstance(type);
  }

}
