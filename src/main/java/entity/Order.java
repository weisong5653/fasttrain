package entity;

public class Order {
    private String id;
    private String passengerId;
    private String  driverId;
    private String createTime;
    private String  endTime;
    private String evalution;
    private int score;
    private int state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getevalution() {
        return evalution;
    }

    public void setevalution(String evalution) {
        this.evalution = evalution;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", passengerId=" + passengerId +
                ", driverId=" + driverId +
                ", createTime='" + createTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", evalution='" + evalution + '\'' +
                ", score=" + score +
                ", state=" + state +
                '}';
    }
}
