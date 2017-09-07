package bl;

import blservice.ProductDesignService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 * Created by Water on 2017/9/7.
 */
@Service
public class ProductDesignServiceImpl implements ProductDesignService {
    /**
     * 获取该用户的所有项目的项目名称
     *
     * @param username 用户名
     * @return
     */
    @Override
    public List<String> getAllProduct(String username) {
        return null;
    }

    /**
     * 获取用户单个项目下的所有资产包编号
     *
     * @param username 用户名
     * @param pname    项目名称
     * @return
     */
    @Override
    public List<String> getAllPackageNumber(String username, String pname) {
        return null;
    }
}
