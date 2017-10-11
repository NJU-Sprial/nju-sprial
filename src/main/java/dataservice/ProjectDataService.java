package dataservice;

import po.ProjectPO;

/**
 * Created by Water on 2017/10/11.
 */
public interface ProjectDataService {
   ProjectPO getProjectByProduct(String productID);
}
