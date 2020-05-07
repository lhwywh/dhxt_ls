package xyz.lsgdut.dhxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyz.lsgdut.dhxt.pojo.Orderform;
import xyz.lsgdut.dhxt.pojo.VO.OrderVO;
import xyz.lsgdut.dhxt.service.OrderService;
import xyz.lsgdut.dhxt.utils.ExcelUtil;
import xyz.lsgdut.dhxt.utils.JSONResult;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dhxt/order/")
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

    @RequestMapping(value = "/addOneOrder")
    @ResponseBody
    public JSONResult addOneOrder(@ModelAttribute Orderform order) {
        System.out.println(order.getDate());
        String msg = orderService.addOneOrder(order);

        if (msg != null) {
            return JSONResult.ok(msg);
        } else {
            return JSONResult.errorMsg("控制层出现问题");
        }
    }

    @RequestMapping(value = "/getAllOrders")
    @ResponseBody
    public JSONResult getAllOrders() {
        List<OrderVO> orderVOS = new ArrayList<>();
        orderVOS=orderService.getAllOrder();
        if (orderVOS.size()==0) {
            return JSONResult.errorMsg("还没有订货信息");
        } else {
            return JSONResult.ok(orderVOS);
        }
    }

    @RequestMapping(value = "/getAllIncompleteOrders")
    @ResponseBody
    public JSONResult getAllIncompleteOrders() {
        List<OrderVO> orderVOS = new ArrayList<>();
        orderVOS=orderService.getAllIncompleteOrder();
        if (orderVOS.size()==0) {
            return JSONResult.errorMsg("还没有未完成的订货信息");
        } else {
            return JSONResult.ok(orderVOS);
        }
    }

    @RequestMapping("/getTodayForm")
    @ResponseBody
    public JSONResult getTodayForm(){

        List<OrderVO> orders = orderService.getTodayOrders();
        if (orders.size()==0){
            return JSONResult.errorMsg("还没有订货报表");
        }else{
            return  JSONResult.ok(orders);
        }
    }



    @RequestMapping("/exportExcel")
    public void export(HttpServletResponse response){

        List<OrderVO> orders = orderService.getTodayOrders();
        if (orders==null){

        }else{
            System.out.println("aaaa"+JSONResult.ok(orders).toString());
            //导出操作

            ExcelUtil.exportExcel(orders,"订货报表","sheet1",OrderVO.class,"testDATA.xls",response);

        }
    }

    @RequestMapping("/deleteOneOrder")
    @ResponseBody
    public JSONResult deleteOneOrder(@RequestParam(value = "orderId", required = true, defaultValue = "-1") int id){
        String msg = orderService.deleteOneOrderById(id);
        if (msg!=null){
            if(msg.contains("成功")){
                return JSONResult.ok(msg);
            }else{
                return  JSONResult.errorMsg(msg);
            }
        }else{
            return JSONResult.errorMsg("控制层出现问题");
        }
    }

    @RequestMapping("/completeOneOrder")
    @ResponseBody
    public JSONResult completeOneOrder(@RequestParam(value = "orderId", required = true, defaultValue = "-1") int id){
        String msg = orderService.completeOneOrder(id);
        if (msg!=null){
            if(msg.contains("成功")){
                return JSONResult.ok(msg);
            }else{
                return  JSONResult.errorMsg(msg);
            }
        }else{
            return JSONResult.errorMsg("控制层出现问题");
        }
    }

}
