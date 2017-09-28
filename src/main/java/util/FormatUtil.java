package util;

import java.time.format.DateTimeFormatter;

/**
 * Created by zjy on 2017/9/28.
 * 统一定义一些类型的格式
 */
public class FormatUtil {

    /**
     * 统一字符串表示的日期格式
     */
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
}
