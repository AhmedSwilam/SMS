package com.bartech.sms.di.module;

import com.bartech.sms.ui.visitslist.VisitsListMvpPresenter;
import com.bartech.sms.ui.visitslist.VisitsListMvpView;
import com.bartech.sms.ui.visitslist.VisitsListPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideVisitsListPresenterFactory
    implements Factory<VisitsListMvpPresenter<VisitsListMvpView>> {
  private final ActivityModule module;

  private final Provider<VisitsListPresenter<VisitsListMvpView>> presenterProvider;

  public ActivityModule_ProvideVisitsListPresenterFactory(
      ActivityModule module, Provider<VisitsListPresenter<VisitsListMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public VisitsListMvpPresenter<VisitsListMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideVisitsListPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<VisitsListMvpPresenter<VisitsListMvpView>> create(
      ActivityModule module, Provider<VisitsListPresenter<VisitsListMvpView>> presenterProvider) {
    return new ActivityModule_ProvideVisitsListPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideVisitsListPresenter(VisitsListPresenter)}. */
  public static VisitsListMvpPresenter<VisitsListMvpView> proxyProvideVisitsListPresenter(
      ActivityModule instance, VisitsListPresenter<VisitsListMvpView> presenter) {
    return instance.provideVisitsListPresenter(presenter);
  }
}
