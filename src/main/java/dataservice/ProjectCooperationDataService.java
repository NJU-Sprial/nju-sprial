package dataservice;


import vo.ProjectCooperationVO;

import java.util.List;
/**
 * Created by Water on 2017/9/7.
 */
public interface ProjectCooperationDataService {
    /**
     * 获取用户所有的项目
     * TODO
     * @param username
     * @return 项目列表
     */
    List<ProjectCooperationVO> findCooperationProjects(String username);
}
