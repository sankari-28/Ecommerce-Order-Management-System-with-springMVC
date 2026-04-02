package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.model.Order;
import com.ecommerce.service.*;

@Controller
public class AddOrderController {
    OrderService service = new OrderServiceImpl();

    @GetMapping("/add")
    public String showForm() { return "add_order"; }

    @PostMapping("/save")
    public String save(Order o) throws Exception {
        service.addOrder(o);
        return "redirect:/view";
    }
}