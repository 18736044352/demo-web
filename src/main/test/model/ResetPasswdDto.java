package model;

/**
 * Created by iss on 17/12/25.
 */
public class ResetPasswdDto extends BaseClass {
    private String inviteCode;
    private String mobile;
    private String password;
    private String token;

    public ResetPasswdDto() {
        super();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getToken() {
        return token;
    }

    @Override
    public void setToken(String token) {
        this.token = token;
    }

}
