package dto;

import java.util.List;

/**
 * 统一格式得到的数据
 * @param <T>
 */
public class ResultDto<T> {
    private List<T> data;

    public ResultDto(List<T> data) {
        this.data = data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }


    @Override
    public String toString() {
        return "ResultDto{" +
                "data=" + data +
                '}';
    }
}
