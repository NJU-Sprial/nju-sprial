package blservice;

import enums.UserType;

/**
 * Created by zjy on 2017/9/10.
 */
public interface AccountService {

    /**
     * 获取用户类型
     * @param username 用户名
     * @return 如果该用户不存在，返回null
     */
     public UserType getUserType(String username);
}
