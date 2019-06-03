package com.lollipop.detailcomponent;

import com.lollipop.basecomponent.app.BaseApp;
import com.lollipop.basecomponent.config.ConfigComponent;
import com.lollipop.componentservice.router.ServiceRouter;
import com.lollipop.componentservice.service.ServiceDetailInterface;
import com.lollipop.detailcomponent.service.ServiceDetail;

public class DetailApplication extends BaseApp {

    ServiceRouter router;

    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
    }

    @Override
    public void registerModule() {
        router = ServiceRouter.getInstance();
        router.registerService(ServiceDetailInterface.class.getSimpleName(), new ServiceDetail());
    }

    @Override
    public void unRegisterModule() {
        router.unRegisterService(ServiceDetailInterface.class.getSimpleName());
    }

    public void initComponent() {
        for (String app : ConfigComponent.moduleApp) {
            try {
                Class clazz = Class.forName(app);
                BaseApp baseApp = (BaseApp) clazz.newInstance();
                baseApp.registerModule();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
