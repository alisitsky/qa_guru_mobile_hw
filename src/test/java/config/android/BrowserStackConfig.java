package config.android;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${environment}.properties"
})
public interface BrowserStackConfig extends Config{
    @Key("user")
    @DefaultValue("a_zw3Jg0")
    String getUser();

    @Key("key")
    @DefaultValue("kCc7M8mmydKKgcYyCkAH")
    String getKey();

    @Key("baseUrl")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String getBaseUrl();

    @Key("app")
    @DefaultValue("bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
    String getApp();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String getDevice();

    @Key("osVersion")
    @DefaultValue("9.0")
    String getOsVersion();

    @Key("project")
    @DefaultValue("First Java Project")
    String getProject();

    @Key("build")
    @DefaultValue("browserstack-build-1")
    String getBuild();

    @Key("name")
    @DefaultValue("first_test")
    String getName();
}
