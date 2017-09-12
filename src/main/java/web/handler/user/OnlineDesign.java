package web.handler.user;

import blservice.OnlineDesignService;
import constranst.ProjectSession;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import vo.LoanVO;
import web.security.WebSecurityConfig;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by 铠联 on 2017/9/4.
 */
@Controller
public class OnlineDesign {
    @Autowired
    OnlineDesignService onlineDesignService;

    @GetMapping("/user/onlineDesign/importData")
    public String onlineDesign() {
        return "user/onlineDesign/importData";
    }

    @GetMapping("/user/onlineDesign/browseAndKeep")
    public String browseAndKeep() {
        return "user/onlineDesign/browseAndKeep";
    }

    @PostMapping("/user/onlineDesign/browseAndKeepAfterAddProject")
    public String browseAndKeepAfterAddProject(Model model, HttpSession session,
                                               @SessionAttribute(WebSecurityConfig.SESSION_KEY) String username,
                                               @RequestParam(value = "pname", required = true) String pname,
                                               @RequestParam(value = "ptype", required = true) String ptype,
                                               @RequestParam(value = "pway", required = true) String pway,
                                               @RequestParam(value = "file", required = true) MultipartFile file) {
        String message = "";
        boolean sucess = false;
        System.out.println("contacted!");
        if (onlineDesignService.testProject(username, pname)) {
            return "error/error-404";
        } else {
            //向项目中添加数据
// 获取文件名
            String fileName = username + file.getOriginalFilename();
            message += ("上传的文件名为：" + file.getOriginalFilename() + "\n");
            // 文件上传后的路径
            String filePath = System.getProperty("user.dir") + "/userFiles/";
            System.out.println("filePath:" + filePath);
            File dest = new File(filePath + fileName);
            try {
                // 解决中文问题，liunx下中文路径，图片显示问题
                // 检测是否存在目录
                if (!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdirs();
                }
                file.transferTo(dest);

                //开始处理文书
                if (session.getAttribute(WebSecurityConfig.SESSION_KEY) != null) {
                    if (onlineDesignService.importBasicPropertyData(username, pname, ptype, pway, dest)) {
                        sucess = true;
                    } else {
                        message += "文件格式不符合规范！\n";
                    }
                } else {
                    message += "账户已下线，请重新登录！\n";
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                message += "处理文件失败\n";
                e.printStackTrace();
            } finally {
                if (dest.exists() && dest.isFile()) {
                    dest.delete();
                }
            }
            model.addAttribute("result", message);

            //查看添加数据后的项目
            List<LoanVO> loanVOS = onlineDesignService.browseProject(username, pname);
            model.addAttribute("pname", pname);
            model.addAttribute("loans", loanVOS);
        }
        System.out.println("end!");
        return "user/onlineDesign/browseAndKeepAfterAddProject";
    }

    @GetMapping("/user/onlineDesign/addMoreData")
    public String addMoreData() {
        return "user/onlineDesign/addMoreData";
    }
}
