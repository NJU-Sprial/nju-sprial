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
                new ProjectCooperationVO("项目1","源计划1","基础资产导入",Arrays.asList(
                        new PartnerVO("刘某","男","工商银行","保安")
                )),
                new ProjectCooperationVO("项目2","源计划2","基础资产导入",Arrays.asList(
                        new PartnerVO("王某","男","工商银行","CEO"),
                        new PartnerVO("伍某","男","工商银行","清洁工"),
                        new PartnerVO("万某","男","工商银行","总经理"),
                        new PartnerVO("谢某","男","工商银行","门卫")
                )),
                new ProjectCooperationVO("项目3","源计划","基础资产导入",Arrays.asList(
                        new PartnerVO("刘某","男","工商银行","保安")
                ))
        );

        model.addAttribute("cooperationProjectList",cooperationProjectList);

        return "/user/cooperationPlatform";
    }

}
