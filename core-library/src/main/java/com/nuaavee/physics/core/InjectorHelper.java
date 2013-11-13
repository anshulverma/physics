package com.nuaavee.physics.core;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.nuaavee.physics.circle.CircleModule;
import com.nuaavee.physics.model.ModelModule;
import roboguice.RoboGuice;
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

  public static Injector getInjector(Context context) {
    if (injector == null) {
      injector = RoboGuice.getInjector(context).createChildInjector(MODULES);
    }
    return injector;
  }

  public static <T> T getInstance(Class<T> type, Context context) {
    return getInjector(context).getInstance(type);
  }

}
