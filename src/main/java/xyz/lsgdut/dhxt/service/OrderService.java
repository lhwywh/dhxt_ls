package xyz.lsgdut.dhxt.service;

import xyz.lsgdut.dhxt.pojo.Orderform;
import xyz.lsgdut.dhxt.pojo.VO.OrderVO;

import java.util.List;


public interface OrderService {
    List<OrderVO> getAllOrder();

    List<OrderVO> getAllIncompleteOrder();

    OrderVO getOneOrderById(int orderId);

    String addOneOrder(Orderform order);

    List<OrderVO> getTodayOrders();

    String deleteOneOrderById(int orderId);

    String completeOneOrder(int id);
}
