package arvin.constant;

import arvin.result.IResult;
import lombok.Getter;

public enum ResultEnum implements IResult {
    SUCCESS(2001, "SUCCESS"),
    FAILD(2002, "FAILD"),
    FORBIDDEN(2003, "FORBIDDEN"),
    VALIDATE_FAILED(2004, "VALIDATE FAILED");

    @Getter
    private Integer code;
    @Getter
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
