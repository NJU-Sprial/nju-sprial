package data;

import dataservice.ProjectDataService;
import org.springframework.stereotype.Service;
import po.ProjectPO;

import java.util.List;

/**
 * Created by Water on 2017/10/11.
 */
@Service
public class ProjectDataServiceImpl implements ProjectDataService {
    @Override
    public ProjectPO getProjectByProduct(String productID) {
        return null;
    }

    @Override
    public List<ProjectPO> getAllProject() {
        return null;
    }
}
