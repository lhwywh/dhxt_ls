package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.OrderformMapper;
import xyz.lsgdut.dhxt.mapper.PartinfoMapper;
import xyz.lsgdut.dhxt.mapper.SupplierMapper;
import xyz.lsgdut.dhxt.pojo.Orderform;
import xyz.lsgdut.dhxt.pojo.OrderformExample;
import xyz.lsgdut.dhxt.pojo.VO.OrderVO;
import xyz.lsgdut.dhxt.pojo.VO.PartinfoVO;
import xyz.lsgdut.dhxt.service.OrderService;
import xyz.lsgdut.dhxt.service.PartService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderformMapper orderMapper;
    @Autowired
    PartinfoMapper partinfoMapper;
    @Autowired
    SupplierMapper supplierMapper;
    @Autowired
    PartService partService;
    @Override
    public List<OrderVO> getAllOrder() {
        OrderformExample orderExample = new OrderformExample();
        OrderformExample.Criteria criteria = orderExample.createCriteria();
        criteria.andOrderIdIsNotNull();
        List<OrderVO> orderVOS=new ArrayList<>();
        List<Orderform> orders = orderMapper.selectByExample(orderExample);
        if (orders==null){
            return null;
        }
        for (int i=0;i<orders.size();i++){
            Orderform order = orders.get(i);
            PartinfoVO partinfoVO = partService.getOnePartById(order.getPartId());
            OrderVO orderVO = new OrderVO(partinfoVO,order);
            orderVOS.add(orderVO);
        }
        return  orderVOS;
    }

    @Override
    public OrderVO getOneOrderById(int orderId) {
        Orderform order = orderMapper.selectByPrimaryKey(orderId);
        PartinfoVO partinfoVO = partService.getOnePartById(order.getPartId());
        OrderVO orderVO = new OrderVO(partinfoVO,order);
        return orderVO;
    }

    @Override
    public String addOneOrder(Orderform order) {
        int i = orderMapper.insert(order);
        System.out.println("addOneOrder返回：" + i);
        if (i == 0) {
            return "添加失败";
        } else {
            return "添加成功";
        }
    }

    @Override
    public List<OrderVO> getTodayOrders() {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String time=null;
        time=dateformat.format(date);
        Date date2=new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date2);
        calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
        date2=calendar.getTime(); //这个时间就是日期往后推一天的结果
        String time2 = dateformat.format(date2);
        OrderformExample orderExample = new OrderformExample();
        OrderformExample.Criteria criteria = orderExample.createCriteria();
        System.out.println("date1: "+date+"date2"+date2);
        try {
            criteria.andDateBetween(dateformat.parse(time),dateformat.parse(time2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Orderform> orderforms = orderMapper.selectByExample(orderExample);
        List<OrderVO> orderVOS = new ArrayList<>();
        if (orderforms==null){
            return null;
        }
        for (int i=0;i<orderforms.size();i++){
            Orderform order = orderforms.get(i);
            PartinfoVO partinfoVO = partService.getOnePartById(order.getPartId());
            OrderVO orderVO = new OrderVO(partinfoVO,order);
            orderVOS.add(orderVO);
        }
        return  orderVOS;
    }


}
