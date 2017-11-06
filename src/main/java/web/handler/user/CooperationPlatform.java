package web.handler.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import vo.PartnerVO;
import vo.ProjectCooperationVO;
import web.security.WebSecurityConfig;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xiaoJun on 2017/9/12.
 */
@Controller
public class CooperationPlatform {

    @RequestMapping(value = "/user/cooperationPlatform", method= RequestMethod.GET)
    public String cooperationPlatform(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model){

        //假数据
        List<ProjectCooperationVO> cooperationProjectList = Arrays.asList(
                new ProjectCooperationVO("项目1","项目1","基础资产导入",Arrays.asList(
                        new PartnerVO("刘某","男","国泰君安证券","投资银行部")
                )),
                new ProjectCooperationVO("项目2","项目2","基础资产导入",Arrays.asList(
                        new PartnerVO("王某","男","国泰君安证券","资本市场部"),
                        new PartnerVO("伍某","男","国泰君安证券","投资银行部"),
                        new PartnerVO("万某","男","中诚信国际信用评级有限公司 ","研究员"),
                        new PartnerVO("谢某","男","安永会计师事务所","评估专员")
                )),
                new ProjectCooperationVO("项目3","项目3","基础资产导入",Arrays.asList(
                        new PartnerVO("刘某","男","中债信用增信公司","产品经理")
                ))
        );

        model.addAttribute("cooperationProjectList",cooperationProjectList);

        return "/user/cooperationPlatform";
    }

}
