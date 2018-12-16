package entity;

public class Driver {
    private String id;
    private String phone;
    private String plateNumber;
    private String carType;
    private String color;
    private String proofIdentity;
    private int orders;
    private double grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProofIdentity() {
        return proofIdentity;
    }

    public void setProofIdentity(String proofIdentity) {
        this.proofIdentity = proofIdentity;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", platenumber='" + plateNumber + '\'' +
                ", cartype='" + carType + '\'' +
                ", color='" + color + '\'' +
                ", proofIdentity='" + proofIdentity + '\'' +
                ", orders=" + orders +
                ", grade=" + grade +
                '}';
    }
}
