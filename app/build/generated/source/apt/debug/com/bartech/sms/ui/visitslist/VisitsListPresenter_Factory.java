package com.bartech.sms.ui.visitslist;

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
public final class VisitsListPresenter_Factory<V extends VisitsListMvpView>
    implements Factory<VisitsListPresenter<V>> {
  private final MembersInjector<VisitsListPresenter<V>> visitsListPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public VisitsListPresenter_Factory(
      MembersInjector<VisitsListPresenter<V>> visitsListPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert visitsListPresenterMembersInjector != null;
    this.visitsListPresenterMembersInjector = visitsListPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public VisitsListPresenter<V> get() {
    return MembersInjectors.injectMembers(
        visitsListPresenterMembersInjector,
        new VisitsListPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends VisitsListMvpView> Factory<VisitsListPresenter<V>> create(
      MembersInjector<VisitsListPresenter<V>> visitsListPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new VisitsListPresenter_Factory<V>(
        visitsListPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
