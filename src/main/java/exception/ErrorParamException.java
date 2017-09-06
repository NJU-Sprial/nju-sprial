package exception;

/**
 * Created by zjy on 2017/9/5.
 * blservice的接口使用参数不考核要求的通用异常
 * <br><br>
 *     e.g.
 *     <p>
 *         在接口
 *         public Sring interface_eg(String param) throws ErrorParamException;
 *         中，
 *         若param不是正确参数，则抛出此异常
 *     </p>
 *  <br><br>
 */
public class ErrorParamException extends Exception{

    /**
     *
     * @param message 抛出此异常的原因，请使用中文，内容会直接在网页上显示
     */
    public ErrorParamException(String message) {
        super(message);
    }
}
