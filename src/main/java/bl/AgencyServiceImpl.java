package bl;

import blservice.AgencyService;
import dataservice.ProjectDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.ProjectPO;
import util.PO2VOUtil;
import vo.ProjectVO;

import java.util.List;

/**
 * Created by Water on 2017/10/20.
 */
@Service
public class AgencyServiceImpl implements AgencyService {
    private ProjectDataService projectDataService;

    @Autowired
    public AgencyServiceImpl(ProjectDataService projectDataService) {
        this.projectDataService = projectDataService;
    }
    /**
     * 获得平台内所有用户的所有项目，返回用户名和项目名列表
     *
     * @return
     */
    @Override
    public List<ProjectVO> getProjectList() {
        List<ProjectPO> projectPOs = projectDataService.getAllProject();
        return PO2VOUtil.projectPOs2VOs(projectPOs);
    }
}
