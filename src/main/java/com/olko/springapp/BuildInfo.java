package com.olko.springapp;

public class BuildInfo {
    private final String application;
    private final String version;
    private final String time;
    private final String[] profiles;

    public BuildInfo(String application, String version, String time, String[] profiles) {
        this.application = application;
        this.version = version;
        this.time = time;
        this.profiles = profiles;
    }

    public String getApplication() {
        return application;
    }

    public String getVersion() {
        return version;
    }

    public String getTime() {
        return time;
    }

    public String[] getProfiles() {
        return profiles;
    }
}
