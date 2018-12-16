package dto;

/**
 * @author weisong
 * @date 2018/11/22 3:51 PM
 */
public class TemporaryPyDrOrdDto {
    private double amount;
    private String payWay;
    private int score;
    private String evalution;

    public TemporaryPyDrOrdDto(double amount, String payWay, int score, String evalution) {
        this.amount = amount;
        this.payWay = payWay;
        this.score = score;
        this.evalution = evalution;
    }

    public TemporaryPyDrOrdDto() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getEvalution() {
        return evalution;
    }

    public void setEvalution(String evalution) {
        this.evalution = evalution;
    }

    @Override
    public String toString() {
        return "TemporaryPyDrOrdDto{" +
                "amount=" + amount +
                ", payWay='" + payWay + '\'' +
                ", score=" + score +
                ", evalution='" + evalution + '\'' +
                '}';
    }
}
