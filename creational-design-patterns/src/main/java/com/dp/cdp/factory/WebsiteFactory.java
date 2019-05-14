package com.dp.cdp.factory;

public class WebsiteFactory {
   
    public static Website getWebSites(String siteType) {
        switch(siteType) {
            case "blog": {
                return new Blog();
            }
            case "shop" : {
                return new Shop();
            }
            default:
                return null;
        }
    }
    
}
