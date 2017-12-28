package model;

/**
 * Created by iss on 17/12/24.
 */
public enum MobileType {
    ANDROID(1,"android"),
    IOS(2,"Ios");
    private int type;
    private String desc;

    MobileType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
