package xyz.lsgdut.dhxt.service;

import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.Order;
import xyz.lsgdut.dhxt.pojo.VO.OrderVO;

import java.util.List;


public interface OrderService {
    List<OrderVO> getAllOrder();

    OrderVO getOneOrderById(int orderId);

    String addOneOrder(@Param("partInfo") Order order);
}
