package vo;

/**
 * Created by zjy on 2017/9/12.
 * 投资人 > 产品详情 > 产品跟踪 > 证券信息 的一条信息
 */
public class SecuritiesMessageVO {
    private String title;
    private String content;

    /**
     *
     * @param title 标题
     * @param content 内容
     */
    public SecuritiesMessageVO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
