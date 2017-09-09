package web.handler.user;

import blservice.OnlineDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import vo.LoanVO;

import java.util.List;

/**
 * Created by 铠联 on 2017/9/4.
 */
@Controller
public class OnlineDesign {
    @Autowired
    OnlineDesignService onlineDesignService;

    @GetMapping("/user/onlineDesign/importData")
    public String onlineDesign(){
        return "user/onlineDesign/importData";
    }

    @GetMapping("/user/onlineDesign/browseAndKeep")
    public String browseAndKeep(){
        return "user/onlineDesign/browseAndKeep";
    }

    @GetMapping("/user/onlineDesign/browseAndKeep/{username}/{pname}")
    public String browseAndKeepAfterAddProject(Model model, @PathVariable String username,@PathVariable String pname){
        if (onlineDesignService.testProject(username,pname)){
            return "error/error-404";
        }
        else {
            List<LoanVO> loanVOS = onlineDesignService.browseProject(username, pname);
            model.addAttribute("pname",pname);
            model.addAttribute("loans",loanVOS);
        }

        return "user/onlineDesign/browseAndKeepAfterAddProject";
    }

    @GetMapping("/user/onlineDesign/addMoreData")
    public String addMoreData(){
        return "user/onlineDesign/addMoreData";
    }
}
