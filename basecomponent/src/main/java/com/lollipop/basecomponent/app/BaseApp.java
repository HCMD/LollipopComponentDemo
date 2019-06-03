package com.lollipop.basecomponent.app;

import android.app.Application;

import com.lollipop.componentservice.router.ServiceRouter;

public abstract class BaseApp extends Application {
    public ServiceRouter router;

    @Override
    public void onCreate() {
        super.onCreate();
        router = ServiceRouter.getInstance();
        registerModule();
    }

    public abstract void registerModule();

    public abstract void unRegisterModule();
}
