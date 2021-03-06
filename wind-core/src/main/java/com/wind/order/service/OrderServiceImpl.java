package com.wind.order.service;

import com.wind.order.dao.OrderDao;
import com.wind.order.model.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/5/2.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;


    @Override
    public void addOrderInfo(OrderVO orderVO) {
        orderDao.addOrderInfo(orderVO);
    }

    @Override
    public List<OrderVO> getOrderInfos(int userId) {
        return orderDao.getOrderInfos(userId);
    }

    @Override
    public void deleteOrderInfo(int orderId) {
       orderDao.deleteOrderInfo(orderId);
    }

    @Override
    public void changeOrderState(int orderId) {
   orderDao.changeOrderState(orderId);
    }

    @Override
    public List<OrderVO> getWzfOrderInfos(int userId) {
        return orderDao.getWzfOrderInfos(userId);
    }

    @Override
    public List<OrderVO> getYzfOrderInfos(int userId) {
        return orderDao.getYzfOrderInfos(userId);
    }
}
