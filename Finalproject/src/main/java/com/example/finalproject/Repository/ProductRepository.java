package com.example.finalproject.Repository;

import com.example.finalproject.Model.Employee;
import com.example.finalproject.Model.Product;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>{



 Product findProductByCode(Integer code);
    Product findProductByNameAndAge(String name,Integer age);


   List<Product> findAllByEmpid(Integer id );
}
