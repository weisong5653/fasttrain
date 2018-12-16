package dto;

import enums.StateEnum;

/**
 * 封装订单信息
 */
public class OrderExecutionDto {
    private int state;
    private String stateInfo;
    private String valuation;
    private int score;
    private int id;

    public OrderExecutionDto() {
    }

    public OrderExecutionDto(StateEnum stateEnum, String valuation, int score, int id) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getMessage();
        this.valuation = valuation;
        this.score = score;
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public String getValuation() {
        return valuation;
    }

    public void setValuation(String valuation) {
        this.valuation = valuation;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderExecution{" +
                "state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", valuation='" + valuation + '\'' +
                ", score=" + score +
                ", id=" + id +
                '}';
    }
}
