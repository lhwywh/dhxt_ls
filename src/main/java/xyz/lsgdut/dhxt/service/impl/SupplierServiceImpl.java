package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.SupplierMapper;
import xyz.lsgdut.dhxt.pojo.Supplier;
import xyz.lsgdut.dhxt.pojo.SupplierExample;
import xyz.lsgdut.dhxt.service.SupplierService;

import java.util.List;
@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierMapper supplierMapper;

    @Override
    public List<Supplier> getAllSuppliers() {
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria =supplierExample.createCriteria();
        criteria.andSupplierIdIsNotNull();
        List<Supplier> suppliers = supplierMapper.selectByExample(supplierExample);
        return suppliers;
    }

    @Override
    public Supplier getOneSupplierById(int supplierId) {
        Supplier supplier = supplierMapper.selectByPrimaryKey(supplierId);
        return  supplier;
    }

    @Override
    public String updateOneSupplier(Supplier supplier) {
        int i = supplierMapper.updateByPrimaryKeySelective(supplier);
        System.out.println("updateOnePart返回:"+i);
        if (i==0){
            return "修改失败，供应商编号重复";
        }else{
            return "修改成功";
        }
    }

    @Override
    public String deleteOneSupplier(int supplierId) {
        int i = supplierMapper.deleteByPrimaryKey(supplierId);
        if (i==0){
            return "修改失败，供应商编号不存在";
        }else{
            return "删除成功";
        }
    }

    @Override
    public String addOneSupplier(Supplier supplier) {
        System.out.println(supplier.getSupplierId());
        int i = supplierMapper.insert(supplier);
        System.out.println("addOneSupplier返回：" + i);
        if (i == 0) {
            return "添加失败";
        } else {
            return "添加成功";
        }
    }


}
