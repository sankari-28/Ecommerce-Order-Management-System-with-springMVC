package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.service.*;

@Controller
public class DeleteOrderController {
    OrderService service = new OrderServiceImpl();

    @GetMapping("/delete")
    public String delete(@RequestParam int id) throws Exception {
        service.deleteOrder(id);
        return "redirect:/view";
    }
}