package com.bartech.sms.ui.requestslist;

import com.bartech.sms.data.DataManager;
import com.bartech.sms.utils.rx.SchedulerProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RequestsListPresenter_Factory<V extends RequestsListMvpView>
    implements Factory<RequestsListPresenter<V>> {
  private final MembersInjector<RequestsListPresenter<V>> requestsListPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public RequestsListPresenter_Factory(
      MembersInjector<RequestsListPresenter<V>> requestsListPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert requestsListPresenterMembersInjector != null;
    this.requestsListPresenterMembersInjector = requestsListPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public RequestsListPresenter<V> get() {
    return MembersInjectors.injectMembers(
        requestsListPresenterMembersInjector,
        new RequestsListPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends RequestsListMvpView> Factory<RequestsListPresenter<V>> create(
      MembersInjector<RequestsListPresenter<V>> requestsListPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new RequestsListPresenter_Factory<V>(
        requestsListPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
