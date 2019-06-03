package com.lollipop.componentservice.router;

import java.util.LinkedHashMap;

public class ServiceRouter {
    private static ServiceRouter router;
    private LinkedHashMap<String, Object> serviceMap;

    private ServiceRouter() {
        serviceMap = new LinkedHashMap<>();
    }

    public static ServiceRouter getInstance() {
        if (router == null) {
            router = new ServiceRouter();
        }
        return router;
    }

    public void registerService(String serviceKey, Object serviceObject) {
        if (serviceMap.containsKey(serviceKey))
            return;
        serviceMap.put(serviceKey, serviceObject);
    }

    public void unRegisterService(String serviceKey) {
        serviceMap.remove(serviceKey);
    }

    public Object getService(String serviceKey) {
        if (serviceMap.containsKey(serviceKey))
            return serviceMap.get(serviceKey);
        return null;
    }
}
