package com.cool.photoalbum.model.domain;

public class Access {

    /**
     * currentVersion : 1.1.0
     * isGGOpen : false
     * isHWOpen : false
     */

    private String currentVersion;
    private boolean isGGOpen;
    private boolean isHWOpen;

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public boolean isIsGGOpen() {
        return isGGOpen;
    }

    public void setIsGGOpen(boolean isGGOpen) {
        this.isGGOpen = isGGOpen;
    }

    public boolean isIsHWOpen() {
        return isHWOpen;
    }

    public void setIsHWOpen(boolean isHWOpen) {
        this.isHWOpen = isHWOpen;
    }
}
