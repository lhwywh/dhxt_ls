package xyz.lsgdut.dhxt.service;

import xyz.lsgdut.dhxt.pojo.Orderform;
import xyz.lsgdut.dhxt.pojo.VO.OrderVO;

import java.util.List;


public interface OrderService {
    List<OrderVO> getAllOrder();

    OrderVO getOneOrderById(int orderId);

    String addOneOrder(Orderform order);

    List<OrderVO> getTodayOrders();
}
