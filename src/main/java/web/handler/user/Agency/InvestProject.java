package web.handler.user.Agency;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by xiaoJun on 2017/9/16.
 */

@Controller
public class InvestProject {

    @GetMapping("/user/agency/investProject")
    public String toInvestProject(Model model) {
        return "user/agency/investProject";
    }
}
