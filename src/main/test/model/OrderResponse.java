package model;

import java.util.Date;
import java.util.List;

/**
 * Created by iss on 17/12/26.
 */
public class OrderResponse {

    /**
     * 订单号
     */
    private String orderNumber;

    private String fromAddr;

    private String fromAddrDetail;

    private String toAddr;

    private String toAddrDetail;

    private String pickupPassword;

    public boolean isAppoint;

    public int status;

    public long createDate;

    public int sender;

    public String sm;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getFromAddr() {
        return fromAddr;
    }

    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr;
    }

    public String getFromAddrDetail() {
        return fromAddrDetail;
    }

    public void setFromAddrDetail(String fromAddrDetail) {
        this.fromAddrDetail = fromAddrDetail;
    }

    public String getToAddr() {
        return toAddr;
    }

    public void setToAddr(String toAddr) {
        this.toAddr = toAddr;
    }

    public String getToAddrDetail() {
        return toAddrDetail;
    }

    public void setToAddrDetail(String toAddrDetail) {
        this.toAddrDetail = toAddrDetail;
    }

    public String getPickupPassword() {
        return pickupPassword;
    }

    public void setPickupPassword(String pickupPassword) {
        this.pickupPassword = pickupPassword;
    }

    public boolean isAppoint() {
        return isAppoint;
    }

    public void setAppoint(boolean appoint) {
        isAppoint = appoint;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public int getSender() {
        return sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }
}
