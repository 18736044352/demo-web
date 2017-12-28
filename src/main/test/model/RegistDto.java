package model;

/**
 * Created by iss on 17/12/24.
 */
public class RegistDto extends BaseClass{

    public String mobile;
    public String smsCode;
    private String orderNumber;
    private String pushClientId;
    /**
//     * 手机号 短信加密传
//     */
//    private String value;
    /**
     * 数字签名值
     */
    private String sign;

    public RegistDto() {
        super();
    }

//    public String getMobile() {
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
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
