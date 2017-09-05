package web.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 铠联 on 2017/9/4.
 */
@Controller
public class OnlineDesign {


    @GetMapping("/onlineDesign/importData")
    public String onlineDesign(){
        return "onlineDesign/importData";
    }

    @GetMapping("/onlineDesign/browseAndKeep")
    public String browseAndKeep(){
        return "onlineDesign/browseAndKeep";
    }

}
