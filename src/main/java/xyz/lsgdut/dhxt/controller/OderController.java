package xyz.lsgdut.dhxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyz.lsgdut.dhxt.pojo.Order;
import xyz.lsgdut.dhxt.pojo.VO.OrderVO;
import xyz.lsgdut.dhxt.service.OrderService;
import xyz.lsgdut.dhxt.utils.JSONResult;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OderController {


    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOneOrderById")
    @ResponseBody
    public JSONResult getOneOrderById(@RequestParam(value = "orderId", required = true, defaultValue = "-1") int id) {
        OrderVO orderVO = orderService.getOneOrderById(id);
        if (orderVO == null) {
            return JSONResult.errorMsg("找不到这个订单");
        } else {
            return JSONResult.ok(orderVO);
        }
    }

    @RequestMapping(value = "/addOneOrder", method = RequestMethod.GET)
    @ResponseBody
    public JSONResult addOneOrder(@ModelAttribute Order order) {
        String msg = orderService.addOneOrder(order);

        if (msg != null) {
            return JSONResult.ok(msg);
        } else {
            return JSONResult.errorMsg("控制层出现问题");
        }
    }

    @RequestMapping(value = "/getAllOrders", method = RequestMethod.GET)
    @ResponseBody
    public JSONResult getAllOrders() {
        List<OrderVO> orderVOS = new ArrayList<>();
        orderVOS=orderService.getAllOrder();
        if (orderVOS.isEmpty()) {
            return JSONResult.errorMsg("还没有订货信息");
        } else {
            return JSONResult.ok(orderVOS);
        }
    }


}
