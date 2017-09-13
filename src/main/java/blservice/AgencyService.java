package blservice;

import vo.ProjectVO;

import java.util.List;

/**
 * Created by 铠联 on 2017/9/13.
 */
public interface AgencyService {
    /**
     * 获得平台内所有用户的所有项目，返回用户名和项目名列表
     * @return
     */
    List<ProjectVO> getProjectList();
}
