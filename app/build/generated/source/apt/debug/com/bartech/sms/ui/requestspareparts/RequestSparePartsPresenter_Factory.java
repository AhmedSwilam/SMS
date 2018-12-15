package com.bartech.sms.ui.requestspareparts;

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
public final class RequestSparePartsPresenter_Factory<V extends RequestSparePartsMvpView>
    implements Factory<RequestSparePartsPresenter<V>> {
  private final MembersInjector<RequestSparePartsPresenter<V>>
      requestSparePartsPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public RequestSparePartsPresenter_Factory(
      MembersInjector<RequestSparePartsPresenter<V>> requestSparePartsPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert requestSparePartsPresenterMembersInjector != null;
    this.requestSparePartsPresenterMembersInjector = requestSparePartsPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public RequestSparePartsPresenter<V> get() {
    return MembersInjectors.injectMembers(
        requestSparePartsPresenterMembersInjector,
        new RequestSparePartsPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends RequestSparePartsMvpView> Factory<RequestSparePartsPresenter<V>> create(
      MembersInjector<RequestSparePartsPresenter<V>> requestSparePartsPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new RequestSparePartsPresenter_Factory<V>(
        requestSparePartsPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
