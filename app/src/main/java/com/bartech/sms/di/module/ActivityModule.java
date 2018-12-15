/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.bartech.sms.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.bartech.sms.data.network.model.BlogResponse;
import com.bartech.sms.data.network.model.OpenSourceResponse;
import com.bartech.sms.di.ActivityContext;
import com.bartech.sms.di.PerActivity;
import com.bartech.sms.ui.about.AboutMvpPresenter;
import com.bartech.sms.ui.about.AboutMvpView;
import com.bartech.sms.ui.about.AboutPresenter;
import com.bartech.sms.ui.dashboard.DashboardMvpPresenter;
import com.bartech.sms.ui.dashboard.DashboardMvpView;
import com.bartech.sms.ui.dashboard.DashboardPresenter;
import com.bartech.sms.ui.feed.FeedMvpPresenter;
import com.bartech.sms.ui.feed.FeedMvpView;
import com.bartech.sms.ui.feed.FeedPagerAdapter;
import com.bartech.sms.ui.feed.FeedPresenter;
import com.bartech.sms.ui.feed.blogs.BlogAdapter;
import com.bartech.sms.ui.feed.blogs.BlogMvpPresenter;
import com.bartech.sms.ui.feed.blogs.BlogMvpView;
import com.bartech.sms.ui.feed.blogs.BlogPresenter;
import com.bartech.sms.ui.feed.opensource.OpenSourceAdapter;
import com.bartech.sms.ui.feed.opensource.OpenSourceMvpPresenter;
import com.bartech.sms.ui.feed.opensource.OpenSourceMvpView;
import com.bartech.sms.ui.feed.opensource.OpenSourcePresenter;
import com.bartech.sms.ui.googlemap.GoogleMapMvpPresenter;
import com.bartech.sms.ui.googlemap.GoogleMapMvpView;
import com.bartech.sms.ui.googlemap.GoogleMapPresenter;
import com.bartech.sms.ui.login.LoginMvpPresenter;
import com.bartech.sms.ui.login.LoginMvpView;
import com.bartech.sms.ui.login.LoginPresenter;
import com.bartech.sms.ui.main.MainMvpPresenter;
import com.bartech.sms.ui.main.MainMvpView;
import com.bartech.sms.ui.main.MainPresenter;
import com.bartech.sms.ui.main.rating.RatingDialogMvpPresenter;
import com.bartech.sms.ui.main.rating.RatingDialogMvpView;
import com.bartech.sms.ui.main.rating.RatingDialogPresenter;
import com.bartech.sms.ui.mainscreen.MainScreenMvpPresenter;
import com.bartech.sms.ui.mainscreen.MainScreenMvpView;
import com.bartech.sms.ui.mainscreen.MainScreenPresenter;
import com.bartech.sms.ui.requestslist.RequestsListMvpPresenter;
import com.bartech.sms.ui.requestslist.RequestsListMvpView;
import com.bartech.sms.ui.requestslist.RequestsListPresenter;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsMvpPresenter;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsMvpView;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsPresenter;
import com.bartech.sms.ui.splash.SplashMvpPresenter;
import com.bartech.sms.ui.splash.SplashMvpView;
import com.bartech.sms.ui.splash.SplashPresenter;
import com.bartech.sms.ui.visitslist.VisitsListMvpPresenter;
import com.bartech.sms.ui.visitslist.VisitsListMvpView;
import com.bartech.sms.ui.visitslist.VisitsListPresenter;
import com.bartech.sms.utils.rx.AppSchedulerProvider;
import com.bartech.sms.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by janisharali on 27/01/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }
    @Provides
    @PerActivity
    MainScreenMvpPresenter<MainScreenMvpView> provideMainScreenPresenter(
            MainScreenPresenter<MainScreenMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    DashboardMvpPresenter<DashboardMvpView> provideDashboardPresenter(
            DashboardPresenter<DashboardMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    RequestsListMvpPresenter<RequestsListMvpView> provideRequestsListPresenter(
            RequestsListPresenter<RequestsListMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    RequestSparePartsMvpPresenter<RequestSparePartsMvpView> provideRequestSparePartsPresenter(
            RequestSparePartsPresenter<RequestSparePartsMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    GoogleMapMvpPresenter<GoogleMapMvpView> provideGoogleMapPresenter(
            GoogleMapPresenter<GoogleMapMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    VisitsListMvpPresenter<VisitsListMvpView> provideVisitsListPresenter(
            VisitsListPresenter<VisitsListMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}
