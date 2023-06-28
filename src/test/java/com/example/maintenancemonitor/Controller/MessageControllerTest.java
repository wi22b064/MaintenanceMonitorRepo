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

    @Test
    void reset(){
        MessageController controller = new MessageController();
        String result = controller.reset();
        assertEquals(result, "ok");
    }

    @Test
    void flowTest(){
        MessageController controller = new MessageController();
        //send
        String result = controller.send();
        assertEquals(result, "Everything works as expected");
        //set
        result = controller.set("Service checks: No power until 5:00 pm");
        assertEquals(result, "ok");
        //send
        result = controller.send();
        assertEquals(result, "Service checks: No power until 5:00 pm");
        //reset
        result = controller.reset();
        assertEquals(result, "ok");
        //send
        result = controller.send();
        assertEquals(result, "Everything works as expected");
    }
}
