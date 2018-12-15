package com.bartech.sms.di.module;

import com.bartech.sms.ui.requestslist.RequestsListMvpPresenter;
import com.bartech.sms.ui.requestslist.RequestsListMvpView;
import com.bartech.sms.ui.requestslist.RequestsListPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideRequestsListPresenterFactory
    implements Factory<RequestsListMvpPresenter<RequestsListMvpView>> {
  private final ActivityModule module;

  private final Provider<RequestsListPresenter<RequestsListMvpView>> presenterProvider;

  public ActivityModule_ProvideRequestsListPresenterFactory(
      ActivityModule module,
      Provider<RequestsListPresenter<RequestsListMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public RequestsListMvpPresenter<RequestsListMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideRequestsListPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RequestsListMvpPresenter<RequestsListMvpView>> create(
      ActivityModule module,
      Provider<RequestsListPresenter<RequestsListMvpView>> presenterProvider) {
    return new ActivityModule_ProvideRequestsListPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideRequestsListPresenter(RequestsListPresenter)}. */
  public static RequestsListMvpPresenter<RequestsListMvpView> proxyProvideRequestsListPresenter(
      ActivityModule instance, RequestsListPresenter<RequestsListMvpView> presenter) {
    return instance.provideRequestsListPresenter(presenter);
  }
}
