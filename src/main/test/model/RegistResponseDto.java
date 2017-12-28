package model;

/**
 * Created by iss on 17/12/24.
 */
public class RegistResponseDto {
    /**
     * app登录返回token信息
     */
    private String token;

    /**
     * 用户等级
     * @return
     */
    private Integer level;
    /**
     * 信誉分
     */
    private Float score;

    /**
     * 用户头像
     */
    private String headImg;

    /**
     * true 企业员工 false 非企业员工
     * @return
     */
    private Boolean emloyeeIs=false;

    /**
     *是否可以使用余额 0 能使用 1 不能使用
     */
    private Integer useBalance;

    /**
     * uuid
     */
    private String uuid;

    private String nickName;

    private String mobile;

    private String email;

    /**
     * 用户类型:
     */
    private Integer type;

    /**
     * 用户子类型
     */
    private Integer subType;

    /**
     * 用户状态:
     */
    private Integer status;


    public RegistResponseDto() {
        super();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Boolean getEmloyeeIs() {
        return emloyeeIs;
    }

    public void setEmloyeeIs(Boolean emloyeeIs) {
        this.emloyeeIs = emloyeeIs;
    }

    public Integer getUseBalance() {
        return useBalance;
    }

    public void setUseBalance(Integer useBalance) {
        this.useBalance = useBalance;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
