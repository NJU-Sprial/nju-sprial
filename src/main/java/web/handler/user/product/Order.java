package web.handler.user.product;

import blservice.OrderService;
import exception.ErrorParamException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
import vo.SubmitOrderVO;
import web.security.WebSecurityConfig;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by zjy on 2017/9/13.
 * 投资者 > 浏览在售商品 > 下单 的相关路由
 */
@Controller
public class Order {
//    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/user/placeOrder/{productID}", method= RequestMethod.GET)
    public String placeOrder(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username,
                             @PathVariable String productID,
                              Model model) {
        model.addAttribute("orderTime", LocalDateTime.now());
        model.addAttribute("productID", productID);
        model.addAttribute("pname", LocalDateTime.now());
        model.addAttribute("username", username);
        return "/user/product/placeOrder";
    }

    @RequestMapping(value = "/user/placeOrder/submit", method= RequestMethod.POST)
    public String productList(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username,
                              @RequestParam(value = "orderTime", required = true) String orderTime,
                              @RequestParam(value = "productID", required = true) String productID,
                              @RequestParam(value = "pname", required = true) String pname,
                              @RequestParam(value = "interestRate", required = true) String interestRate,
                              @RequestParam(value = "amount", required = true) String amount,
                              RedirectAttributesModelMap modelMap) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        try {
//            if(orderService.submitOrder(new SubmitOrderVO(
//                    LocalDateTime.parse(orderTime,formatter),productID,username,Double.parseDouble(interestRate), Double.parseDouble(amount)))
//                    ){
//                modelMap.addFlashAttribute("alertType","alert-success");
//                modelMap.addFlashAttribute("alertMessage","购买成功");
//                return "redirect:/user/product/"+ productID +"/overview";
//            }
//            else {
//                modelMap.addFlashAttribute("alertType","alert-danger");
//                modelMap.addFlashAttribute("alertMessage","购买失败，请稍后再试");
//                return "redirect:/user/placeOrder";
//            }
//        } catch (ErrorParamException | NumberFormatException e) {
//            modelMap.addFlashAttribute("alertType","alert-danger");
//            modelMap.addFlashAttribute("alertMessage",e.getMessage());
//            return "redirect:/user/placeOrder";
//        }

        modelMap.addFlashAttribute("alertType","alert-success");
        modelMap.addFlashAttribute("alertMessage","购买成功");
        return "redirect:/user/product/"+ productID +"/overview";
    }
}
