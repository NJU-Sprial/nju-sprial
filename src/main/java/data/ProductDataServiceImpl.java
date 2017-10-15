package data;

import dao.OrderDao;
import dao.ProductDao;
import dao.ProjectDao;
import dataservice.ProductDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import po.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


@Service("ProductDataService")
@Transactional
public class ProductDataServiceImpl implements ProductDataService{

    @Autowired
    ProductDao productDao;
    @Autowired
    ProjectDao projectDao;
    @Autowired
    OrderDao orderDao;
    @Override
    public List<ProductPO> getProductList(String username) {
        List<ProductPO> result = new LinkedList<>();
        List<ProjectPO> projectPOS = projectDao.findByProperty("owner", username);
        for (ProjectPO projectPO:projectPOS ){
            result.addAll(productDao.find("from ProjectPO where projectId = ?",projectPO.getId()));
        }
        return result;
    }

    @Override
    public List<RecruitmentSituationPO> getRecruitmentSituation(String username, String productID) {

        List<OrderPO> orderPOS = orderDao.find("from OrderPO where productId = ?",productID);
        List<RecruitmentSituationPO> result = orderPOS.stream().map(p->{
            RecruitmentSituationPO recruitmentSituationPO = new RecruitmentSituationPO();
            recruitmentSituationPO.setInvestor(p.getUsername());
            recruitmentSituationPO.setAmount(p.getAmount().toString());
            recruitmentSituationPO.setRate(p.getInterestRate().toString());
            return recruitmentSituationPO;}).collect(Collectors.toList());

        return result;
    }

    @Override
    public List<ProductPO> getOnSaleProductList() {
        List<ProductPO> productPOS = orderDao.find("from ProductPO where finished = ?",false);
        return productPOS==null?new ArrayList<>():productPOS;
    }

    @Override
    public ProductPO getProductInfo(int productID) {
        return productDao.get(productID);
    }

    @Override
    public List<ProductStrategyPO> getProductStrategys(int projectID) {
        return null;
    }


}
