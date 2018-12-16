package entity;

import java.util.Date;

public class Pay {
    private String id;
    private String orderId;
    private String driverId;
    private String passengerId;
    private double amount;
    private Date time;
    private String payWay;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", driverId=" + driverId +
                ", passengerId=" + passengerId +
                ", amount=" + amount +
                ", time=" + time +
                ", payWay='" + payWay + '\'' +
                '}';
    }
}
