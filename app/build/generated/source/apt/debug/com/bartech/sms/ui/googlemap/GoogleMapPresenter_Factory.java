package com.bartech.sms.ui.googlemap;

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
public final class GoogleMapPresenter_Factory<V extends GoogleMapMvpView>
    implements Factory<GoogleMapPresenter<V>> {
  private final MembersInjector<GoogleMapPresenter<V>> googleMapPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public GoogleMapPresenter_Factory(
      MembersInjector<GoogleMapPresenter<V>> googleMapPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert googleMapPresenterMembersInjector != null;
    this.googleMapPresenterMembersInjector = googleMapPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public GoogleMapPresenter<V> get() {
    return MembersInjectors.injectMembers(
        googleMapPresenterMembersInjector,
        new GoogleMapPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends GoogleMapMvpView> Factory<GoogleMapPresenter<V>> create(
      MembersInjector<GoogleMapPresenter<V>> googleMapPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new GoogleMapPresenter_Factory<V>(
        googleMapPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
