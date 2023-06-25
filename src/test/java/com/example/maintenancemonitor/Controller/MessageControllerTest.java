package com.example.maintenancemonitor.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MessageControllerTest {

    @Test
    void sendMessage(){
        MessageController controller = new MessageController();
        String result = controller.send();
        assertEquals(result, "Everything works as expected");
    }

    @Test
    void setMessage(){
        MessageController controller = new MessageController();
        String result = controller.set("Service checks: No power until 5:00 pm");
        assertEquals(result, "ok");
    }

}
