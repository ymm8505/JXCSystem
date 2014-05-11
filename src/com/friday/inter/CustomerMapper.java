package com.friday.inter;

import com.friday.model.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}