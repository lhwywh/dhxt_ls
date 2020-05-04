package xyz.lsgdut.dhxt.controller;


import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.lsgdut.dhxt.bean.Part;
import xyz.lsgdut.dhxt.db.DBUtils;
import xyz.lsgdut.dhxt.db.PartMapper;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dhxt")
public class PartController {

    @RequestMapping("/getOnePartById")
    @ResponseBody
    public List<Part> getPartById(@RequestParam(value="partId",required=true,defaultValue="-1") int id) {
        SqlSession sqlSession = null;
        List<Part> partList = new ArrayList<Part>();
        try {
            sqlSession = DBUtils.openSqlSession();
            PartMapper partMapper = sqlSession.getMapper(PartMapper.class);
            Part part = partMapper.getPart(id);
            partList.add(part);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return partList;
    }

    @RequestMapping("/part")
    @ResponseBody
    public List<Part> getAllParts() {
        SqlSession sqlSession = null;
        List<Part> partList = new ArrayList<Part>();
        try {
            sqlSession = DBUtils.openSqlSession();
            PartMapper partMapper = sqlSession.getMapper(PartMapper.class);
            Part part = partMapper.getAllPart();
            partList.add(part);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return partList;
    }
}
