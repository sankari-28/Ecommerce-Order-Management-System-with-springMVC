package com.ecommerce.repository;

import java.sql.*;
import java.util.*;
import com.ecommerce.model.Order;
import com.ecommerce.util.DBUtil;

public class OrderRepository {

    public void save(Order o) throws Exception {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO orders(customername,productname,quantity,price) VALUES(?,?,?,?)");

        ps.setString(1, o.getCustomerName());
        ps.setString(2, o.getProductName());
        ps.setInt(3, o.getQuantity());
        ps.setDouble(4, o.getPrice());

        ps.executeUpdate();
        con.close();
    }

    public List<Order> findAll() throws Exception {
        List<Order> list = new ArrayList<>();
        Connection con = DBUtil.getConnection();

        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM orders");

        while (rs.next()) {
            Order o = new Order();
            o.setOrderId(rs.getInt("orderid"));
            o.setCustomerName(rs.getString("customername"));
            o.setProductName(rs.getString("productname"));
            o.setQuantity(rs.getInt("quantity"));
            o.setPrice(rs.getDouble("price"));
            list.add(o);
        }

        con.close();
        return list;
    }

    public void delete(int id) throws Exception {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM orders WHERE orderid=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        con.close();
    }

    public Order findById(int id) throws Exception {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM orders WHERE orderid=?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Order o = new Order();
            o.setOrderId(rs.getInt("orderid"));
            o.setCustomerName(rs.getString("customername"));
            o.setProductName(rs.getString("productname"));
            o.setQuantity(rs.getInt("quantity"));
            o.setPrice(rs.getDouble("price"));
            return o;
        }
        return null;
    }

    public void update(Order o) throws Exception {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "UPDATE orders SET customername=?, productname=?, quantity=?, price=? WHERE orderid=?");

        ps.setString(1, o.getCustomerName());
        ps.setString(2, o.getProductName());
        ps.setInt(3, o.getQuantity());
        ps.setDouble(4, o.getPrice());
        ps.setInt(5, o.getOrderId());

        ps.executeUpdate();
        con.close();
    }
}