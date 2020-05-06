package xyz.lsgdut.dhxt.service;

import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.Supplier;

import java.util.List;


public interface SupplierService {
    List<Supplier> getAllSuppliers();

    Supplier getOneSupplierById(int supplierId);

    String updateOneSupplier(Supplier supplier);

    String deleteOneSupplier(int supplierId);

    String addOneSupplier(@Param("partInfo") Supplier supplier);
}
