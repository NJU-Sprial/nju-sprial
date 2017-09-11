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


    /**
     * 判断是否有该项目
     * 如果有该项目 返回true
     * @param username
     * @param projectName
     * @return
     */
    public boolean testProject(String username, String projectName);

    /**
     * 获得用户的所有项目名称
     *
     * @param username
     * @return
     */
    public List<String> getProjectNameList(String username);

    String getProjectId(String username, String pname);
}
