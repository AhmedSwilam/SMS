package com.bartech.sms.di.module;

import com.bartech.sms.ui.requestspareparts.RequestSparePartsMvpPresenter;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsMvpView;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideRequestSparePartsPresenterFactory
    implements Factory<RequestSparePartsMvpPresenter<RequestSparePartsMvpView>> {
  private final ActivityModule module;

  private final Provider<RequestSparePartsPresenter<RequestSparePartsMvpView>> presenterProvider;

  public ActivityModule_ProvideRequestSparePartsPresenterFactory(
      ActivityModule module,
      Provider<RequestSparePartsPresenter<RequestSparePartsMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public RequestSparePartsMvpPresenter<RequestSparePartsMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideRequestSparePartsPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RequestSparePartsMvpPresenter<RequestSparePartsMvpView>> create(
      ActivityModule module,
      Provider<RequestSparePartsPresenter<RequestSparePartsMvpView>> presenterProvider) {
    return new ActivityModule_ProvideRequestSparePartsPresenterFactory(module, presenterProvider);
  }

  /**
   * Proxies {@link ActivityModule#provideRequestSparePartsPresenter(RequestSparePartsPresenter)}.
   */
  public static RequestSparePartsMvpPresenter<RequestSparePartsMvpView>
      proxyProvideRequestSparePartsPresenter(
          ActivityModule instance, RequestSparePartsPresenter<RequestSparePartsMvpView> presenter) {
    return instance.provideRequestSparePartsPresenter(presenter);
  }
}
