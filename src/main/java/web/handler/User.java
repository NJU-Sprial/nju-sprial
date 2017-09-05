package web.handler;

import blservice.ProductManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import vo.ProductVO;
import vo.RecruitmentSituationVO;
import web.security.WebSecurityConfig;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zjy
 * 用户登录后才能访问的路由
 */
@Controller
public class User {
//	@Autowired
	private ProductManageService productManageService;

	@RequestMapping(value = "/user/name", method= RequestMethod.GET)
	public @ResponseBody
	String userName(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username) {
		return "user: " + username;
	}

	@RequestMapping(value = "/user/ManagementPlatform", method= RequestMethod.GET)
	public String managementPlatform(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model) {
//		List<ProductVO> productList = productManageService.getProductList(username);
//		List<List<RecruitmentSituationVO>> sponsorList = new ArrayList<>();
//		for(ProductVO productVO:productList){
//			sponsorList.add(productManageService.getRecruitmentSituation(username, productVO.getProductID()));
//		}
//		model.addAttribute("productList",productList);
//		model.addAttribute("sponsorList",sponsorList);


		//假数据
		List<ProductVO> fakeProductList = Arrays.asList(
				new ProductVO("productID1","示例产品1","￥10000",0.4,0.3,"5星","A机构","B机构","不动产","XXXXXXX", LocalDateTime.of(2018,9,5,23,59),LocalDateTime.of(2017,9,10,23,59)),
				new ProductVO("productID2","示例产品2","￥20000",0.4,0.3,"4星","C机构","D机构","不动产","XXXXXXXXXX", LocalDateTime.of(2018,3,9,23,59),LocalDateTime.of(2017,10,1,23,59))
		);
		List<List<RecruitmentSituationVO>> fakeSponsorList = new ArrayList<>();
		for(ProductVO productVO:fakeProductList){
			fakeSponsorList.add(Arrays.asList(new RecruitmentSituationVO("张三","￥2000","10%"),
					new RecruitmentSituationVO("李四","￥1500","9%")
			));
		}
		model.addAttribute("productList", fakeProductList);
		model.addAttribute("sponsorList", fakeSponsorList);

		return "/user/ManagementPlatform";
	}
}
