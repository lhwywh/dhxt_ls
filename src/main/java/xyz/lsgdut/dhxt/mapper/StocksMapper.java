package xyz.lsgdut.dhxt.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.Stocks;
import xyz.lsgdut.dhxt.pojo.StocksExample;

public interface StocksMapper {
    long countByExample(StocksExample example);

    int deleteByExample(StocksExample example);

    int deleteByPrimaryKey(Integer partId);

    int insert(Stocks record);

    int insertSelective(Stocks record);

    List<Stocks> selectByExample(StocksExample example);

    Stocks selectByPrimaryKey(Integer partId);

    int updateByExampleSelective(@Param("record") Stocks record, @Param("example") StocksExample example);

    int updateByExample(@Param("record") Stocks record, @Param("example") StocksExample example);

    int updateByPrimaryKeySelective(Stocks record);

    int updateByPrimaryKey(Stocks record);
}