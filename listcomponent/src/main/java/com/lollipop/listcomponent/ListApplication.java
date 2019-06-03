package com.lollipop.listcomponent;

import android.os.CountDownTimer;

import com.lollipop.basecomponent.app.BaseApp;
import com.lollipop.componentservice.router.ServiceRouter;
import com.lollipop.componentservice.service.ServiceListInterface;
import com.lollipop.listcomponent.service.ServiceList;

public class ListApplication extends BaseApp {

    @Override
    public void registerModule() {
        router = ServiceRouter.getInstance();
        router.registerService(ServiceListInterface.class.getSimpleName(), new ServiceList());
    }

    @Override
    public void unRegisterModule() {
        router.unRegisterService(ServiceListInterface.class.getSimpleName());
    }

}
