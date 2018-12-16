package dto;

/**
 * @author weisong
 * @date 2018/12/16 11:56 AM
 */
public class PayEndDto {
    private double amount;
    private int score;
    private String evalution;

    public PayEndDto(double amount, int score, String evalution) {
        this.amount = amount;
        this.score = score;
        this.evalution = evalution;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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
        return "PayEndDto{" +
                "amount=" + amount +
                ", score=" + score +
                ", evalution='" + evalution + '\'' +
                '}';
    }
}
