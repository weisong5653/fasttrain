package entity;

import java.util.Date;

public class Path {
    private String id;
    private String orderId;
    private int sequenceNumber;
    private Date time;
    private double longitude;
    private double latitude;
    private String origin;
    private String terminus;

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

    public int getSequence_number() {
        return sequenceNumber;
    }

    public void setSequence_number(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTerminus() {
        return terminus;
    }

    public void setTerminus(String terminus) {
        this.terminus = terminus;
    }

    @Override
    public String toString() {
        return "Path{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", sequence_number=" + sequenceNumber +
                ", time=" + time +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", origin='" + origin + '\'' +
                ", terminus='" + terminus + '\'' +
                '}';
    }
}
