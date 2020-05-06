package xyz.lsgdut.dhxt.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.Orderform;
import xyz.lsgdut.dhxt.pojo.OrderformExample;

public interface OrderformMapper {
    long countByExample(OrderformExample example);

    int deleteByExample(OrderformExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Orderform record);

    int insertSelective(Orderform record);

    List<Orderform> selectByExample(OrderformExample example);

    Orderform selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByExample(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByPrimaryKeySelective(Orderform record);

    int updateByPrimaryKey(Orderform record);
}