package bl;

import blservice.OnlineDesignService;
import blservice.PackageMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.CashFlowDataVO;

import java.util.Date;

@Service
public class PackageMeasureServiceImpl implements PackageMeasureService {
    @Autowired
    OnlineDesignService onlineDesignService;
    @Override
    //TODO
    //算法相关
    public CashFlowDataVO getCashFlowData(String username, String projectName, String packageId, String cycle, Date pay, String unit) {

        return null;
    }
}
