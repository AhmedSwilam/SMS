package com.bartech.sms.di.module;

import com.bartech.sms.ui.mainscreen.MainScreenMvpPresenter;
import com.bartech.sms.ui.mainscreen.MainScreenMvpView;
import com.bartech.sms.ui.mainscreen.MainScreenPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideMainScreenPresenterFactory
    implements Factory<MainScreenMvpPresenter<MainScreenMvpView>> {
  private final ActivityModule module;

  private final Provider<MainScreenPresenter<MainScreenMvpView>> presenterProvider;

  public ActivityModule_ProvideMainScreenPresenterFactory(
      ActivityModule module, Provider<MainScreenPresenter<MainScreenMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public MainScreenMvpPresenter<MainScreenMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideMainScreenPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MainScreenMvpPresenter<MainScreenMvpView>> create(
      ActivityModule module, Provider<MainScreenPresenter<MainScreenMvpView>> presenterProvider) {
    return new ActivityModule_ProvideMainScreenPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideMainScreenPresenter(MainScreenPresenter)}. */
  public static MainScreenMvpPresenter<MainScreenMvpView> proxyProvideMainScreenPresenter(
      ActivityModule instance, MainScreenPresenter<MainScreenMvpView> presenter) {
    return instance.provideMainScreenPresenter(presenter);
  }
}
