package data;

import dataservice.UnissuedProductDataService;
import exception.ErrorParamException;
import org.springframework.stereotype.Service;
import po.UnissuedProductPO;
import vo.ConceptualVO;

/**
 * Created by Water on 2017/9/8.
 */
@Service
public class UnissuedProductDataServiceImpl implements UnissuedProductDataService {
    /**
     * 获取用户某产品的方案
     * 在产品设计中，一个资产包对应一个方案
     * TODO 这里涉及一个复杂的查询，因此请求数据层完成该接口
     *
     * @param username      用户名
     * @param pname         项目名称
     * @param packageNumber 资产包编号
     * @return 如果这个资产包没有方案，则返回 sname为""，startDate,firstPayDate,lawEndDate为null，其它值均正常的 ConceptualVO
     * @see UnissuedProductPO
     */
    @Override
    public ConceptualVO getConceptual(String username, String pname, String packageNumber) {
        return null;
    }

    /**
     * 保存产品方案,如果方案名已存在代表修改，如果未存在代表添加
     * TODO：这里涉及一个复杂的查询，因此请求数据层完成该接口
     *
     * @param conceptualVO 方案的信息
     * @return 成功返回true，失败返回false
     * @throws ErrorParamException 有任何参数不正确时
     */
    @Override
    public boolean saveProductStrategy(ConceptualVO conceptualVO) throws ErrorParamException {
        return false;
    }
}
