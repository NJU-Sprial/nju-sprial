package web.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 铠联 on 2017/9/1.
 */
@Controller
public class Index {
//    @Autowired
//    private CaseRecommendService caseRecommendService;
//    @Autowired
//    private UserService userService;

    /**
     * 首页
     * @return
     */
    @RequestMapping(value= {"/","/index"},method= RequestMethod.GET)
    public String home() {
        return "index";
    }

}
