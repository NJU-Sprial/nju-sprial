package dataservice;

import po.ProjectPO;

import java.util.List;

/**
 * Created by Water on 2017/10/11.
 */
public interface ProjectDataService {
   ProjectPO getProjectByProduct(String productID);

   List<ProjectPO> getAllProject();
}
