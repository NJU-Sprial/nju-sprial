package daoImpl;

import dao.ProjectCoordinatorDao;
import org.springframework.stereotype.Repository;
import po.ProjectCoordinatorPO;

/**
 * Created by yinywf on 2017/9/7
 */
@Repository("ProjectCoordinatorDao")
public class ProjectCoordinatorDaoImpl extends SimpleHibernateDaoImpl<ProjectCoordinatorPO,Integer> implements ProjectCoordinatorDao {
}
