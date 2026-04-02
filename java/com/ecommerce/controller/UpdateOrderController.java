package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.service.*;

@Controller
public class UpdateOrderController {
    OrderService service = new OrderServiceImpl();

    @GetMapping("/edit")
    public String edit(@RequestParam int id, Model model) throws Exception {
        model.addAttribute("order", service.getOrderById(id));
        return "update_order";
    }

    @PostMapping("/update")
    public String update(com.ecommerce.model.Order o) throws Exception {
        service.updateOrder(o);
        return "redirect:/view";
    }
}