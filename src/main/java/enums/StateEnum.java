package enums;

public enum StateEnum {
    ORDER_ERROR(-1,"订单出错"),
    ORDER_SUCCESS(0,"订单完成"),
    ORDER_DEAL(1,"已接单"),
    ORDER_AWAIT(2,"待接单"),
    PAY_END(3,"已结账"),
    PAY_AWAIT(4,"待结账");
    private int state;
    private String message;

    StateEnum(int state, String message) {
        this.state = state;
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
