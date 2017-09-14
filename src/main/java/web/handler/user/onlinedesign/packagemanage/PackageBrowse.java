package web.handler.user.onlinedesign.packagemanage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import vo.AssetPackageVO;
import web.security.WebSecurityConfig;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xiaoJun on 2017/9/12.
 */

@Controller
public class PackageBrowse {


    @RequestMapping(value = "/user/onlineDesign/packageManage/packageBrowse", method= RequestMethod.GET)
    public String toPackageBrowse(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model){

        List<AssetPackageVO> allPackageVOList = Arrays.asList(
                new AssetPackageVO(username, "项目1", "0001", 3, LocalDateTime.now(),100,100),
                new AssetPackageVO(username, "项目1", "0002", 3, LocalDateTime.now(),100,100),
                new AssetPackageVO(username, "项目1", "0003", 3, LocalDateTime.now(),100,100));

        model.addAttribute("allPackageVOList",allPackageVOList);

        return "/user/onlineDesign/assetPackageBrowse";
    }
}
