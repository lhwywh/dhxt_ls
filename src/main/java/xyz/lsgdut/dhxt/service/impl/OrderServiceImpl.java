package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.OrderMapper;
import xyz.lsgdut.dhxt.mapper.PartinfoMapper;
import xyz.lsgdut.dhxt.mapper.SupplierMapper;
import xyz.lsgdut.dhxt.pojo.Order;
import xyz.lsgdut.dhxt.pojo.OrderExample;
import xyz.lsgdut.dhxt.pojo.VO.OrderVO;
import xyz.lsgdut.dhxt.pojo.VO.PartinfoVO;
import xyz.lsgdut.dhxt.service.OrderService;
import xyz.lsgdut.dhxt.service.PartService;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    PartinfoMapper partinfoMapper;
    @Autowired
    SupplierMapper supplierMapper;
    @Autowired
    PartService partService;
    @Override
    public List<OrderVO> getAllOrder() {
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andOrderIdIsNull();
        List<OrderVO> orderVOS=null;
        List<Order> orders = orderMapper.selectByExample(orderExample);
        for (int i=0;i<orders.size();i++){
            Order order = orders.get(i);
            PartinfoVO partinfoVO = partService.getOnePartById(order.getPartId());
            OrderVO orderVO = new OrderVO(partinfoVO,order);
            orderVOS.add(orderVO);
        }
        return  orderVOS;
    }

    @Override
    public OrderVO getOneOrderById(int orderId) {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        PartinfoVO partinfoVO = partService.getOnePartById(order.getPartId());
        OrderVO orderVO = new OrderVO(partinfoVO,order);
        return orderVO;
    }

    @Override
    public String addOneOrder(Order order) {
        int i = orderMapper.insert(order);
        System.out.println("addOneOrder返回：" + i);
        if (i == 0) {
            return "添加失败";
        } else {
            return "添加成功";
        }
    }
}
