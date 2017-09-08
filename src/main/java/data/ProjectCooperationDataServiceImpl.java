package data;

import dataservice.ProjectCooperationDataService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vo.ProjectCooperationVO;

import java.util.List;

/**
 * Created by Water on 2017/9/7.
 */
@Service("ProjectCooperationDataService")
@Transactional
public class ProjectCooperationDataServiceImpl implements ProjectCooperationDataService {
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
}
