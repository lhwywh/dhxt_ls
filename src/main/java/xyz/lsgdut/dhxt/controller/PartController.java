package xyz.lsgdut.dhxt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.lsgdut.dhxt.pojo.Partinfo;
import xyz.lsgdut.dhxt.pojo.VO.PartinfoVO;
import xyz.lsgdut.dhxt.service.PartService;
import xyz.lsgdut.dhxt.utils.JSONResult;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dhxt/part/")
public class PartController {

    @Autowired
    private PartService partService;

    @RequestMapping("/getOnePartById")
    @ResponseBody
    public JSONResult getPartById(@RequestParam(value = "partId", required = true, defaultValue = "-1") int id) {
       PartinfoVO partinfoVO = partService.getOnePartById(id);
        if (partinfoVO == null) {
            return JSONResult.errorMsg("找不到这个零件");
        } else {
            return JSONResult.ok(partinfoVO);
        }
    }

    @RequestMapping(value = "/addOnePart")
    @ResponseBody
    public JSONResult addOnePart(@ModelAttribute Partinfo partInfo1) {
        System.out.println("aaaa"+partInfo1.getPartName());
        String msg = partService.addOnePart(partInfo1);
        if (msg != null) {
            if (msg.contains("成功"))
                return JSONResult.ok(msg);
            else
                return JSONResult.errorMsg(msg);
        } else {
            return JSONResult.errorMsg("控制层出现问题");
        }
    }

    @RequestMapping(value = "/getAllParts")
    @ResponseBody
    public JSONResult getAllParts() {
        List<PartinfoVO> partinfoVOS = new ArrayList<>();
        partinfoVOS = partService.getAllParts();
        if (partinfoVOS.isEmpty()) {
            return JSONResult.errorMsg("还没有零件信息");
        } else {
            return JSONResult.ok(partinfoVOS);
        }
    }

    @RequestMapping("/updatePart")
    @ResponseBody
    public JSONResult updatePart(@ModelAttribute Partinfo partInfo1) {
        String msg = partService.updateOnePart(partInfo1);
        if (msg!=null){
            return JSONResult.ok(msg);
        }else{
            return JSONResult.errorMsg("控制层出现问题");
        }
    }

    @RequestMapping("/deleteOnePart")
    @ResponseBody
    public JSONResult deleteOnePart(@RequestParam(value = "partId", required = true, defaultValue = "-1") int id) {
        String msg = partService.deleteOnePart(id);
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

    @RequestMapping("/updatePartNum")
    @ResponseBody
    public JSONResult updatePartNum(@RequestParam(value = "partId", required = true, defaultValue = "-1") int id,
                                    @RequestParam(value = "addOrReduce", required = true, defaultValue = "-1") int addOrReduce,
                                    @RequestParam(value = "num", required = true, defaultValue = "0") int num) {
        String msg = partService.updatePartNum(id,addOrReduce,num);
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
