package data;

import dao.ProjectDao;
import dataservice.ProjectCooperationDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import po.ProjectPO;
import vo.ProjectCooperationVO;

import java.util.List;

/**
 * Created by Water on 2017/9/7.
 */
@Service("ProjectCooperationDataService")
@Transactional
public class ProjectCooperationDataServiceImpl implements ProjectCooperationDataService {

    @Autowired
    ProjectDao projectDao;
    /**
     * 获取用户所有的项目
     * TODO
     *
     * @param username
     * @return 项目列表
     */
    @Override
    public List<ProjectCooperationVO> findCooperationProjects(String username) {
        return null;
    }


    /**
     * 判断是否有该项目
     * 如果有该项目 返回true
     *
     * @param username
     * @param projectName
     * @return
     */
    @Override
    public boolean testProject(String username, String projectName) {
        String hql = "from ProjectPO p where p.owner = ? and p.projectName = ?";
        ProjectPO projectPO = projectDao.findUnique(hql,username,projectName);
        if (projectPO==null){
            return false;
        }
        return true;
    }
}
