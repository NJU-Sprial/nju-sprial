package bl;

import blservice.PackageMeasureService;
import org.springframework.stereotype.Service;
import vo.CashFlowDataVO;

import java.util.Date;

@Service
public class PackageMeasureServiceImpl implements PackageMeasureService {
    @Override
    public CashFlowDataVO getCashFlowData(String username, String projectName, String packageId, String cycle, Date pay, String unit) {
        return null;
    }
}
