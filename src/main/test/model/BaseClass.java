package model;

/**
 * Created by iss on 17/12/24.
 */
public class BaseClass {
    private String shansongId;
    private int mobileType;
    private String appVersion;
    private String token;
    private String cityId;

    public BaseClass() {
        super();
    }

    public String getShansongId() {
        return shansongId;
    }

    public void setShansongId(String shansongId) {
        this.shansongId = shansongId;
    }

    public int getMobileType() {
        return mobileType;
    }

    public void setMobileType(int mobileType) {
        this.mobileType = mobileType;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
