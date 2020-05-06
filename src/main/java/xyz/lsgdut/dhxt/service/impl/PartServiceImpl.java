package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.OrderMapper;
import xyz.lsgdut.dhxt.mapper.PartinfoMapper;
import xyz.lsgdut.dhxt.mapper.SupplierMapper;
import xyz.lsgdut.dhxt.pojo.*;
import xyz.lsgdut.dhxt.pojo.VO.PartinfoVO;
import xyz.lsgdut.dhxt.service.OrderService;
import xyz.lsgdut.dhxt.service.PartService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static xyz.lsgdut.dhxt.utils.Constant.ADD;

@Service
public class PartServiceImpl implements PartService {
    @Autowired
    private PartinfoMapper partMapper;

    @Autowired
    private SupplierMapper supplierMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderService orderService;


    @Override
    public String addOnePart(Partinfo partInfo) {
        System.out.println(partInfo.getPartId());
        int i = partMapper.insert(partInfo);
        System.out.println("addOnePart返回：" + i);
        if (i == 0) {
            return "添加失败";
        } else {
            return "添加成功";
        }
    }

    @Override
    public List<PartinfoVO> getAllParts() {
        PartinfoExample partinfoExample = new PartinfoExample();
        PartinfoExample.Criteria criteria =partinfoExample.createCriteria();
        criteria.andPartIdIsNotNull();
        List<PartinfoVO> partinfoVOS = new ArrayList<>();
        List<Partinfo> partInfos =
                partMapper.selectByExample(partinfoExample);
        for (int i=0;i<partInfos.size();i++){
            Partinfo partinfo = partInfos.get(i);
            Supplier mainSupplier = supplierMapper.selectByPrimaryKey(partinfo.getMainSupplierId());
            Supplier secSupplier = supplierMapper.selectByPrimaryKey(partinfo.getSecSupplierId());
            PartinfoVO partinfoVO = new PartinfoVO(partinfo,mainSupplier.getSupplierName(),secSupplier.getSupplierName());
            partinfoVOS.add(partinfoVO);
        }

        return partinfoVOS;
    }

    @Override
    public PartinfoVO getOnePartById(int partId) {
        Partinfo partInfo = partMapper.selectByPrimaryKey(partId);
        Supplier mainSupplier = supplierMapper.selectByPrimaryKey(partInfo.getMainSupplierId());
        Supplier secSupplier = supplierMapper.selectByPrimaryKey(partInfo.getSecSupplierId());
        PartinfoVO partinfoVO = new PartinfoVO(partInfo,mainSupplier.getSupplierName(),secSupplier.getSupplierName());
        return  partinfoVO;
    }

    @Override
    public String updateOnePart(Partinfo partInfo) {
        int i = partMapper.updateByPrimaryKeySelective(partInfo);
        System.out.println("updateOnePart返回:"+i);
        if (i==0){
            return "修改失败，零件编号重复";
        }else{
            return "修改成功";
        }
    }

    @Override
    public String updatePartNum(int partId, int addOrReduce,int num) {
        int a=0;
        Partinfo partinfo =  partMapper.selectByPrimaryKey(partId);
        if (partinfo==null){
            return "更新失败,零件不存在";
        }
        if (addOrReduce==ADD){
            partinfo.setPartNum(partinfo.getPartNum()+num);
            return "更新成功 入库后库存为："+partinfo.getPartNum();
        }else{
            if (partinfo.getPartNum()<num){
                return "库存不够了 不能订货了";
            }else{
              if ((partinfo.getPartNum()-num)<partinfo.getCriticalValue()){
                  Orderform order = new Orderform();
                  order.setPartId(partId);
                  order.setDate(new Date());
                  order.setMainSupplierId(partinfo.getMainSupplierId());
                  order.setSecSupplierId(partinfo.getSecSupplierId());
                  order.setOderNum(num*2);
                  orderService.addOneOrder(order);
                  a=1;
              }
            }
            partinfo.setPartNum(partinfo.getPartNum()-num);
            int i = partMapper.updateByPrimaryKey(partinfo);
            if (i==1&&a==1){
                return "更新成功 出库后库存为："+partinfo.getPartNum()+" 小于库存临界值 订货数量："+num*2;
            }else if(i==1){
                return "更新成功 入库后库存为："+partinfo.getPartNum();
            }else{
                return "更新失败";
            }
        }

    }

    @Override
    public String deleteOnePart(int id) {
        int i = partMapper.deleteByPrimaryKey(id);
        System.out.println("deleteOnePart返回:"+i);
        if (i==0){
            return "删除失败，零件不存在";
        }else{
            return "删除成功";
        }

    }
}
