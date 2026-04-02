package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.service.*;

@Controller
public class ViewOrderController {
    OrderService service = new OrderServiceImpl();

    @GetMapping("/view")
    public String view(Model model) throws Exception {
        model.addAttribute("orders", service.getAllOrders());
        return "view_orders";
    }
}