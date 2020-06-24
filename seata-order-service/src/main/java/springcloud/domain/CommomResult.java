package springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname CommomResult
 * @Description TODO
 * @Date 2020/6/24 16:56
 * @Created by ChenHao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommomResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommomResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
