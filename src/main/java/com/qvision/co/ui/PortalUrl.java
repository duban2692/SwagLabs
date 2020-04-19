package com.qvision.co.ui;

import net.serenitybdd.core.pages.PageObject;

public class PortalUrl extends PageObject {

    public PortalUrl() {

        setDefaultBaseUrl(System.getProperty("UrlWeb"));
    }
}
