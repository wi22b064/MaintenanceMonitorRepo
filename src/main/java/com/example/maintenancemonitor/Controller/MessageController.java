package com.example.maintenancemonitor.Controller;

import com.example.maintenancemonitor.Model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    Message msg = new Message();

    @RequestMapping("/api/message")
    public String send(){
        return msg.getMessage();
    }

    @RequestMapping("/api/message/set")
    public String set(@RequestParam String m){
        msg.setMessage(m);
        return "ok";
    }
}
