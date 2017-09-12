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
    public CashFlowDataVO getCashFlowData(String username, String projectName, String packageId, String cycle, Date pay, String unit) {
        int cycleNumber = Integer.parseInt(cycle);
        //查询跟之前接口不对等
//        onlineDesignService.getCashFlowDataVO(username,projectName,packageId,cycleNumber,pay,unit);
        return null;
    }
}
