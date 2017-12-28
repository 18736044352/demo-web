package model;

/**
 * Created by iss on 17/12/24.
 * 短信登录
 */
public class SmsLoginDto extends BaseClass{
//    public String mobile;
//    public String smsCode;
    /**
     * 账号密码加密串
     */
    private String value;
    private String orderNumber;
    private String pushClientId;
    /**
     * 数字签名值
     */
    private String sign;

    public SmsLoginDto() {
        super();
    }

//    public String getMobile() {
//
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    public String getSmsCode() {
//        return smsCode;
//    }
//
//    public void setSmsCode(String smsCode) {
//        this.smsCode = smsCode;
//    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPushClientId() {
        return pushClientId;
    }

    public void setPushClientId(String pushClientId) {
        this.pushClientId = pushClientId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
