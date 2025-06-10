package com.narayun.portfolio.controller;

import com.narayun.portfolio.model.Message;
import com.narayun.portfolio.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping
    public Message saveMessage(@RequestBody Message message) {
        return messageService.saveMessage(message);
    }
}
