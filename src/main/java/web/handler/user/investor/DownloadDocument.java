package web.handler.user.investor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by xiaoJun on 2017/9/16.
 */
@Controller
public class DownloadDocument {

    @GetMapping("/user/investor/downloadDocument")
    public String toMyOrder(Model model) {
        return "user/investor/documentDownload";
    }
}
