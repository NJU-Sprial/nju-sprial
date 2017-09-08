package daoImpl;

import dao.ProjectDao;
import org.springframework.stereotype.Repository;
import po.ProjectPO;

/**
 * Created by yinywf on 2017/9/7
 */
@Repository("ProjectDao")
public class ProjectDaoImpl extends  SimpleHibernateDaoImpl<ProjectPO,Integer> implements ProjectDao {
}
