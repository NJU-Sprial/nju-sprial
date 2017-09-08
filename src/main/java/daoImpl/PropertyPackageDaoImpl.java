package daoImpl;

import dao.PropertyPackageDao;
import org.springframework.stereotype.Repository;
import po.PropertyPackagePO;

/**
 * Created by yinywf on 2017/9/7
 */
@Repository("PropertyPackageDao")
public class PropertyPackageDaoImpl extends SimpleHibernateDaoImpl<PropertyPackagePO,Integer> implements PropertyPackageDao{
}
