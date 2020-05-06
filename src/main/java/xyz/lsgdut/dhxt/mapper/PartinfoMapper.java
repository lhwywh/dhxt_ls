package xyz.lsgdut.dhxt.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.Partinfo;
import xyz.lsgdut.dhxt.pojo.PartinfoExample;

public interface PartinfoMapper {
    long countByExample(PartinfoExample example);

    int deleteByExample(PartinfoExample example);

    int deleteByPrimaryKey(Integer partId);

    int insert(Partinfo record);

    int insertSelective(Partinfo record);

    List<Partinfo> selectByExample(PartinfoExample example);

    Partinfo selectByPrimaryKey(Integer partId);

    int updateByExampleSelective(@Param("record") Partinfo record, @Param("example") PartinfoExample example);

    int updateByExample(@Param("record") Partinfo record, @Param("example") PartinfoExample example);

    int updateByPrimaryKeySelective(Partinfo record);

    int updateByPrimaryKey(Partinfo record);
}