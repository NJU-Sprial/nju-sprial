package daoImpl;

import dao.ProjectInfoDao;
import org.springframework.stereotype.Repository;
import po.ProjectInfoPO;

@Repository("ProjectInfoDao")
public class ProjectInfoDaoImpl extends  SimpleHibernateDaoImpl<ProjectInfoPO,String> implements ProjectInfoDao {
}
