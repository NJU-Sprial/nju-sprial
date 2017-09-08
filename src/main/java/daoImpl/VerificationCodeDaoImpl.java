package daoImpl;

import dao.VerificationCodeDao;
import org.springframework.stereotype.Repository;
import po.VerificationCodePO;

/**
 * Created by yinywf on 2017/9/7
 */
@Repository("VerificationCodeDao")
public class VerificationCodeDaoImpl extends SimpleHibernateDaoImpl<VerificationCodePO,String> implements VerificationCodeDao{
}
