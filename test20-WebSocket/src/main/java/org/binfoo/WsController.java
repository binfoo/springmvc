package org.binfoo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by ZhangHongbin on 2017/9/12.
 */
@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ResponseMessage say(RequestMessage requestMessage){
        System.out.println(requestMessage.getName());
        return new ResponseMessage("welcome," + requestMessage.getName() + "!");
    }

}
