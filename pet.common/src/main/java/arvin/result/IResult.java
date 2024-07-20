package arvin.result;

public interface IResult {
    /*
     * 状态返回码
     */
    Integer getCode();
    /*
     * 状态返回信息
     */
    String getMessage();
}
