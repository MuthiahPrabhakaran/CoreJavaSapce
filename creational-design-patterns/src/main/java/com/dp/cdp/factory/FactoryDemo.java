package com.dp.cdp.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebSites("blog");
        System.out.println(blog.getPages());
        
        Website site = WebsiteFactory.getWebSites("site");
        System.out.println(site.getPages());
    }
}
