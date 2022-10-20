package za.ac.cput.service;

/* OrderService.java
   Author: Damone Hartnick
   Student Number : 219093717
   Date: August 2022
*/

import za.ac.cput.domain.Order;

import java.util.List;

public interface OrderService extends  IService <Order, String> {

    List<Order> findAll();
    Order update (Order order);
    boolean delete ( String orderID);


    //Order findByOrderId ( String orderID);




}







