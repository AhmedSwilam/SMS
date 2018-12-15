package com.bartech.sms.di.component;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import com.bartech.sms.data.DataManager;
import com.bartech.sms.di.module.ActivityModule;
import com.bartech.sms.di.module.ActivityModule_ProvideAboutPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideActivityFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideBlogAdapterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideBlogMvpPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideCompositeDisposableFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideDashboardPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideFeedPagerAdapterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideFeedPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideGoogleMapPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideLinearLayoutManagerFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideLoginPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideMainPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideMainScreenPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideOpenSourceAdapterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideOpenSourcePresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideRateUsPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideRequestSparePartsPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideRequestsListPresenterFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideSchedulerProviderFactory;
import com.bartech.sms.di.module.ActivityModule_ProvideSplashPresenterFactory;
import com.bartech.sms.ui.about.AboutFragment;
import com.bartech.sms.ui.about.AboutFragment_MembersInjector;
import com.bartech.sms.ui.about.AboutMvpPresenter;
import com.bartech.sms.ui.about.AboutMvpView;
import com.bartech.sms.ui.about.AboutPresenter;
import com.bartech.sms.ui.about.AboutPresenter_Factory;
import com.bartech.sms.ui.dashboard.DashboardActivity;
import com.bartech.sms.ui.dashboard.DashboardActivity_MembersInjector;
import com.bartech.sms.ui.dashboard.DashboardMvpPresenter;
import com.bartech.sms.ui.dashboard.DashboardMvpView;
import com.bartech.sms.ui.dashboard.DashboardPresenter;
import com.bartech.sms.ui.dashboard.DashboardPresenter_Factory;
import com.bartech.sms.ui.feed.FeedActivity;
import com.bartech.sms.ui.feed.FeedActivity_MembersInjector;
import com.bartech.sms.ui.feed.FeedMvpPresenter;
import com.bartech.sms.ui.feed.FeedMvpView;
import com.bartech.sms.ui.feed.FeedPagerAdapter;
import com.bartech.sms.ui.feed.FeedPresenter;
import com.bartech.sms.ui.feed.FeedPresenter_Factory;
import com.bartech.sms.ui.feed.blogs.BlogAdapter;
import com.bartech.sms.ui.feed.blogs.BlogFragment;
import com.bartech.sms.ui.feed.blogs.BlogFragment_MembersInjector;
import com.bartech.sms.ui.feed.blogs.BlogMvpPresenter;
import com.bartech.sms.ui.feed.blogs.BlogMvpView;
import com.bartech.sms.ui.feed.blogs.BlogPresenter;
import com.bartech.sms.ui.feed.blogs.BlogPresenter_Factory;
import com.bartech.sms.ui.feed.opensource.OpenSourceAdapter;
import com.bartech.sms.ui.feed.opensource.OpenSourceFragment;
import com.bartech.sms.ui.feed.opensource.OpenSourceFragment_MembersInjector;
import com.bartech.sms.ui.feed.opensource.OpenSourceMvpPresenter;
import com.bartech.sms.ui.feed.opensource.OpenSourceMvpView;
import com.bartech.sms.ui.feed.opensource.OpenSourcePresenter;
import com.bartech.sms.ui.feed.opensource.OpenSourcePresenter_Factory;
import com.bartech.sms.ui.googlemap.GoogleMapActivity;
import com.bartech.sms.ui.googlemap.GoogleMapActivity_MembersInjector;
import com.bartech.sms.ui.googlemap.GoogleMapMvpPresenter;
import com.bartech.sms.ui.googlemap.GoogleMapMvpView;
import com.bartech.sms.ui.googlemap.GoogleMapPresenter;
import com.bartech.sms.ui.googlemap.GoogleMapPresenter_Factory;
import com.bartech.sms.ui.login.LoginActivity;
import com.bartech.sms.ui.login.LoginActivity_MembersInjector;
import com.bartech.sms.ui.login.LoginMvpPresenter;
import com.bartech.sms.ui.login.LoginMvpView;
import com.bartech.sms.ui.login.LoginPresenter;
import com.bartech.sms.ui.login.LoginPresenter_Factory;
import com.bartech.sms.ui.main.MainActivity;
import com.bartech.sms.ui.main.MainActivity_MembersInjector;
import com.bartech.sms.ui.main.MainMvpPresenter;
import com.bartech.sms.ui.main.MainMvpView;
import com.bartech.sms.ui.main.MainPresenter;
import com.bartech.sms.ui.main.MainPresenter_Factory;
import com.bartech.sms.ui.main.rating.RateUsDialog;
import com.bartech.sms.ui.main.rating.RateUsDialog_MembersInjector;
import com.bartech.sms.ui.main.rating.RatingDialogMvpPresenter;
import com.bartech.sms.ui.main.rating.RatingDialogMvpView;
import com.bartech.sms.ui.main.rating.RatingDialogPresenter;
import com.bartech.sms.ui.main.rating.RatingDialogPresenter_Factory;
import com.bartech.sms.ui.mainscreen.MainScreenActivity;
import com.bartech.sms.ui.mainscreen.MainScreenActivity_MembersInjector;
import com.bartech.sms.ui.mainscreen.MainScreenMvpPresenter;
import com.bartech.sms.ui.mainscreen.MainScreenMvpView;
import com.bartech.sms.ui.mainscreen.MainScreenPresenter;
import com.bartech.sms.ui.mainscreen.MainScreenPresenter_Factory;
import com.bartech.sms.ui.requestslist.RequestsListActivity;
import com.bartech.sms.ui.requestslist.RequestsListActivity_MembersInjector;
import com.bartech.sms.ui.requestslist.RequestsListMvpPresenter;
import com.bartech.sms.ui.requestslist.RequestsListMvpView;
import com.bartech.sms.ui.requestslist.RequestsListPresenter;
import com.bartech.sms.ui.requestslist.RequestsListPresenter_Factory;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsActivity;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsActivity_MembersInjector;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsMvpPresenter;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsMvpView;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsPresenter;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsPresenter_Factory;
import com.bartech.sms.ui.splash.SplashActivity;
import com.bartech.sms.ui.splash.SplashActivity_MembersInjector;
import com.bartech.sms.ui.splash.SplashMvpPresenter;
import com.bartech.sms.ui.splash.SplashMvpView;
import com.bartech.sms.ui.splash.SplashPresenter;
import com.bartech.sms.ui.splash.SplashPresenter_Factory;
import com.bartech.sms.ui.visitslist.VisitsListActivity;
import com.bartech.sms.ui.visitslist.VisitsListActivity_MembersInjector;
import com.bartech.sms.ui.visitslist.VisitsListMvpView;
import com.bartech.sms.ui.visitslist.VisitsListPresenter;
import com.bartech.sms.ui.visitslist.VisitsListPresenter_Factory;
import com.bartech.sms.utils.rx.SchedulerProvider;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<DataManager> getDataManagerProvider;

  private Provider<SchedulerProvider> provideSchedulerProvider;

  private Provider<CompositeDisposable> provideCompositeDisposableProvider;

  private Provider<MainPresenter<MainMvpView>> mainPresenterProvider;

  private Provider<MainMvpPresenter<MainMvpView>> provideMainPresenterProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private Provider<LoginPresenter<LoginMvpView>> loginPresenterProvider;

  private Provider<LoginMvpPresenter<LoginMvpView>> provideLoginPresenterProvider;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private Provider<SplashPresenter<SplashMvpView>> splashPresenterProvider;

  private Provider<SplashMvpPresenter<SplashMvpView>> provideSplashPresenterProvider;

  private MembersInjector<SplashActivity> splashActivityMembersInjector;

  private Provider<FeedPresenter<FeedMvpView>> feedPresenterProvider;

  private Provider<FeedMvpPresenter<FeedMvpView>> provideFeedPresenterProvider;

  private Provider<AppCompatActivity> provideActivityProvider;

  private Provider<FeedPagerAdapter> provideFeedPagerAdapterProvider;

  private MembersInjector<FeedActivity> feedActivityMembersInjector;

  private Provider<AboutPresenter<AboutMvpView>> aboutPresenterProvider;

  private Provider<AboutMvpPresenter<AboutMvpView>> provideAboutPresenterProvider;

  private MembersInjector<AboutFragment> aboutFragmentMembersInjector;

  private Provider<OpenSourcePresenter<OpenSourceMvpView>> openSourcePresenterProvider;

  private Provider<OpenSourceMvpPresenter<OpenSourceMvpView>> provideOpenSourcePresenterProvider;

  private Provider<OpenSourceAdapter> provideOpenSourceAdapterProvider;

  private Provider<LinearLayoutManager> provideLinearLayoutManagerProvider;

  private MembersInjector<OpenSourceFragment> openSourceFragmentMembersInjector;

  private Provider<BlogPresenter<BlogMvpView>> blogPresenterProvider;

  private Provider<BlogMvpPresenter<BlogMvpView>> provideBlogMvpPresenterProvider;

  private Provider<BlogAdapter> provideBlogAdapterProvider;

  private MembersInjector<BlogFragment> blogFragmentMembersInjector;

  private Provider<RatingDialogPresenter<RatingDialogMvpView>> ratingDialogPresenterProvider;

  private Provider<RatingDialogMvpPresenter<RatingDialogMvpView>> provideRateUsPresenterProvider;

  private MembersInjector<RateUsDialog> rateUsDialogMembersInjector;

  private Provider<MainScreenPresenter<MainScreenMvpView>> mainScreenPresenterProvider;

  private Provider<MainScreenMvpPresenter<MainScreenMvpView>> provideMainScreenPresenterProvider;

  private MembersInjector<MainScreenActivity> mainScreenActivityMembersInjector;

  private Provider<DashboardPresenter<DashboardMvpView>> dashboardPresenterProvider;

  private Provider<DashboardMvpPresenter<DashboardMvpView>> provideDashboardPresenterProvider;

  private MembersInjector<DashboardActivity> dashboardActivityMembersInjector;

  private Provider<RequestsListPresenter<RequestsListMvpView>> requestsListPresenterProvider;

  private Provider<RequestsListMvpPresenter<RequestsListMvpView>>
      provideRequestsListPresenterProvider;

  private MembersInjector<RequestsListActivity> requestsListActivityMembersInjector;

  private Provider<VisitsListPresenter<VisitsListMvpView>> visitsListPresenterProvider;

  private MembersInjector<VisitsListActivity> visitsListActivityMembersInjector;

  private Provider<GoogleMapPresenter<GoogleMapMvpView>> googleMapPresenterProvider;

  private Provider<GoogleMapMvpPresenter<GoogleMapMvpView>> provideGoogleMapPresenterProvider;

  private MembersInjector<GoogleMapActivity> googleMapActivityMembersInjector;

  private Provider<RequestSparePartsPresenter<RequestSparePartsMvpView>>
      requestSparePartsPresenterProvider;

  private Provider<RequestSparePartsMvpPresenter<RequestSparePartsMvpView>>
      provideRequestSparePartsPresenterProvider;

  private MembersInjector<RequestSparePartsActivity> requestSparePartsActivityMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getDataManagerProvider =
        new Factory<DataManager>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManager get() {
            return Preconditions.checkNotNull(
                applicationComponent.getDataManager(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.provideSchedulerProvider =
        ActivityModule_ProvideSchedulerProviderFactory.create(builder.activityModule);

    this.provideCompositeDisposableProvider =
        ActivityModule_ProvideCompositeDisposableFactory.create(builder.activityModule);

    this.mainPresenterProvider =
        MainPresenter_Factory.create(
            MembersInjectors.<MainPresenter<MainMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMainPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainPresenterFactory.create(
                builder.activityModule, mainPresenterProvider));

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(provideMainPresenterProvider);

    this.loginPresenterProvider =
        LoginPresenter_Factory.create(
            MembersInjectors.<LoginPresenter<LoginMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideLoginPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideLoginPresenterFactory.create(
                builder.activityModule, loginPresenterProvider));

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(provideLoginPresenterProvider);

    this.splashPresenterProvider =
        SplashPresenter_Factory.create(
            MembersInjectors.<SplashPresenter<SplashMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideSplashPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideSplashPresenterFactory.create(
                builder.activityModule, splashPresenterProvider));

    this.splashActivityMembersInjector =
        SplashActivity_MembersInjector.create(provideSplashPresenterProvider);

    this.feedPresenterProvider =
        FeedPresenter_Factory.create(
            MembersInjectors.<FeedPresenter<FeedMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideFeedPresenterProvider =
        ActivityModule_ProvideFeedPresenterFactory.create(
            builder.activityModule, feedPresenterProvider);

    this.provideActivityProvider =
        ActivityModule_ProvideActivityFactory.create(builder.activityModule);

    this.provideFeedPagerAdapterProvider =
        ActivityModule_ProvideFeedPagerAdapterFactory.create(
            builder.activityModule, provideActivityProvider);

    this.feedActivityMembersInjector =
        FeedActivity_MembersInjector.create(
            provideFeedPresenterProvider, provideFeedPagerAdapterProvider);

    this.aboutPresenterProvider =
        AboutPresenter_Factory.create(
            MembersInjectors.<AboutPresenter<AboutMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideAboutPresenterProvider =
        ActivityModule_ProvideAboutPresenterFactory.create(
            builder.activityModule, aboutPresenterProvider);

    this.aboutFragmentMembersInjector =
        AboutFragment_MembersInjector.create(provideAboutPresenterProvider);

    this.openSourcePresenterProvider =
        OpenSourcePresenter_Factory.create(
            MembersInjectors.<OpenSourcePresenter<OpenSourceMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideOpenSourcePresenterProvider =
        ActivityModule_ProvideOpenSourcePresenterFactory.create(
            builder.activityModule, openSourcePresenterProvider);

    this.provideOpenSourceAdapterProvider =
        ActivityModule_ProvideOpenSourceAdapterFactory.create(builder.activityModule);

    this.provideLinearLayoutManagerProvider =
        ActivityModule_ProvideLinearLayoutManagerFactory.create(
            builder.activityModule, provideActivityProvider);

    this.openSourceFragmentMembersInjector =
        OpenSourceFragment_MembersInjector.create(
            provideOpenSourcePresenterProvider,
            provideOpenSourceAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.blogPresenterProvider =
        BlogPresenter_Factory.create(
            MembersInjectors.<BlogPresenter<BlogMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideBlogMvpPresenterProvider =
        ActivityModule_ProvideBlogMvpPresenterFactory.create(
            builder.activityModule, blogPresenterProvider);

    this.provideBlogAdapterProvider =
        ActivityModule_ProvideBlogAdapterFactory.create(builder.activityModule);

    this.blogFragmentMembersInjector =
        BlogFragment_MembersInjector.create(
            provideBlogMvpPresenterProvider,
            provideBlogAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.ratingDialogPresenterProvider =
        RatingDialogPresenter_Factory.create(
            MembersInjectors.<RatingDialogPresenter<RatingDialogMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideRateUsPresenterProvider =
        ActivityModule_ProvideRateUsPresenterFactory.create(
            builder.activityModule, ratingDialogPresenterProvider);

    this.rateUsDialogMembersInjector =
        RateUsDialog_MembersInjector.create(provideRateUsPresenterProvider);

    this.mainScreenPresenterProvider =
        MainScreenPresenter_Factory.create(
            MembersInjectors.<MainScreenPresenter<MainScreenMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMainScreenPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainScreenPresenterFactory.create(
                builder.activityModule, mainScreenPresenterProvider));

    this.mainScreenActivityMembersInjector =
        MainScreenActivity_MembersInjector.create(provideMainScreenPresenterProvider);

    this.dashboardPresenterProvider =
        DashboardPresenter_Factory.create(
            MembersInjectors.<DashboardPresenter<DashboardMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideDashboardPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideDashboardPresenterFactory.create(
                builder.activityModule, dashboardPresenterProvider));

    this.dashboardActivityMembersInjector =
        DashboardActivity_MembersInjector.create(provideDashboardPresenterProvider);

    this.requestsListPresenterProvider =
        RequestsListPresenter_Factory.create(
            MembersInjectors.<RequestsListPresenter<RequestsListMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideRequestsListPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideRequestsListPresenterFactory.create(
                builder.activityModule, requestsListPresenterProvider));

    this.requestsListActivityMembersInjector =
        RequestsListActivity_MembersInjector.create(provideRequestsListPresenterProvider);

    this.visitsListPresenterProvider =
        VisitsListPresenter_Factory.create(
            MembersInjectors.<VisitsListPresenter<VisitsListMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.visitsListActivityMembersInjector =
        VisitsListActivity_MembersInjector.create(visitsListPresenterProvider);

    this.googleMapPresenterProvider =
        GoogleMapPresenter_Factory.create(
            MembersInjectors.<GoogleMapPresenter<GoogleMapMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideGoogleMapPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideGoogleMapPresenterFactory.create(
                builder.activityModule, googleMapPresenterProvider));

    this.googleMapActivityMembersInjector =
        GoogleMapActivity_MembersInjector.create(provideGoogleMapPresenterProvider);

    this.requestSparePartsPresenterProvider =
        RequestSparePartsPresenter_Factory.create(
            MembersInjectors.<RequestSparePartsPresenter<RequestSparePartsMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideRequestSparePartsPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideRequestSparePartsPresenterFactory.create(
                builder.activityModule, requestSparePartsPresenterProvider));

    this.requestSparePartsActivityMembersInjector =
        RequestSparePartsActivity_MembersInjector.create(provideRequestSparePartsPresenterProvider);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(LoginActivity activity) {
    loginActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(SplashActivity activity) {
    splashActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(FeedActivity activity) {
    feedActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(AboutFragment fragment) {
    aboutFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(OpenSourceFragment fragment) {
    openSourceFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(BlogFragment fragment) {
    blogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(RateUsDialog dialog) {
    rateUsDialogMembersInjector.injectMembers(dialog);
  }

  @Override
  public void inject(MainScreenActivity mainScreenActivity) {
    mainScreenActivityMembersInjector.injectMembers(mainScreenActivity);
  }

  @Override
  public void inject(DashboardActivity dashboardActivity) {
    dashboardActivityMembersInjector.injectMembers(dashboardActivity);
  }

  @Override
  public void inject(RequestsListActivity requestsListActivity) {
    requestsListActivityMembersInjector.injectMembers(requestsListActivity);
  }

  @Override
  public void inject(VisitsListActivity visitsListActivity) {
    visitsListActivityMembersInjector.injectMembers(visitsListActivity);
  }

  @Override
  public void inject(GoogleMapActivity googleMapActivity) {
    googleMapActivityMembersInjector.injectMembers(googleMapActivity);
  }

  @Override
  public void inject(RequestSparePartsActivity requestSparePartsActivity) {
    requestSparePartsActivityMembersInjector.injectMembers(requestSparePartsActivity);
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
