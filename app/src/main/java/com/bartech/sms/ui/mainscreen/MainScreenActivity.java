package com.bartech.sms.ui.mainscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.bartech.sms.R;
import com.bartech.sms.ui.base.BaseActivity;
import com.bartech.sms.ui.dashboard.DashboardActivity;
import com.bartech.sms.ui.googlemap.GoogleMapsActivity;
import com.bartech.sms.ui.requestslist.RequestsListActivity;
import com.bartech.sms.ui.requestspareparts.RequestSparePartsActivity;
import com.bartech.sms.ui.visitslist.VisitsListActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ahmed on 6/3/2018.
 */

public class MainScreenActivity extends BaseActivity implements MainScreenMvpView {
    @Inject
    MainScreenMvpPresenter<MainScreenMvpView> mPresenter;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
//    @BindView(R.id.drawerlayout)
//    DrawerLayout mDrawer;
    @BindView(R.id.navigation_view)
    NavigationView mNavigationView;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(MainScreenActivity.this);

        setUp();
        setupNavMenu();

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void setUp() {
//        setSupportActionBar(mToolbar);
//        mToggle = new ActionBarDrawerToggle(
//                this,
//                mDrawer,
//                mToolbar,
//                R.string.open_drawer,
//                R.string.close_drawer) {
//            @Override
//            public void onDrawerOpened(View drawerView) {
//                super.onDrawerOpened(drawerView);
//                hideKeyboard();
//            }
//
//            @Override
//            public void onDrawerClosed(View drawerView) {
//                super.onDrawerClosed(drawerView);
//            }
//        };
//        mDrawer.addDrawerListener(mToggle);
//        mToggle.syncState();
//        setupNavMenu();
//        mPresenter.onNavMenuCreated();
//        mPresenter.onViewInitialized();

    }
   public void setupNavMenu() {
        View headerLayout = mNavigationView.getHeaderView(0);
        mNavigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                       // mDrawer.closeDrawer(GravityCompat.START);
                        switch (item.getItemId()) {
                            case R.id.nav_mainscreen_mycomplaint:
                                mPresenter.onMyComplaintItemClicked();
                                return true;
                            case R.id.nav_mainscreen_visits:
                                mPresenter.onMyVisitsItemClicked();
                                return true;
                            case R.id.nav_mainscreen_dashboard:
                                mPresenter.onMyDashboardItemClicked();
                            case R.id.nav_mainscreen_location:
                                mPresenter.onMyLocationItemClicked();
                                return true;
                            case R.id.nav_mainscreen_sparpart:
                                mPresenter.onMyRequestClicked();
                                return true;
                            default:
                                return false;
                        }
                    }
                });
    }

    @Override
    public void goToMyComplaintActivity() {
        startActivity(new Intent(MainScreenActivity.this, RequestsListActivity.class));
    }

    @Override
    public void goToMyDevicesActivity() {
     //   startActivity(new Intent(MainScreenActivity.this, MyDevicesActivity.class));
    }

    @Override
    public void goToMyVisitsActivity() {
        startActivity(new Intent(MainScreenActivity.this, VisitsListActivity.class));
    }

    @Override
    public void goToMyDashboardActivity() {
        startActivity(new Intent(MainScreenActivity.this, DashboardActivity.class));
    }

    @Override
    public void goToGoogleMapsActivity() {
        startActivity(new Intent(MainScreenActivity.this, GoogleMapsActivity.class));
    }

    @Override
    public void goToSparePartsActivity() {
        startActivity(new Intent(MainScreenActivity.this, RequestSparePartsActivity.class));
    }

}
