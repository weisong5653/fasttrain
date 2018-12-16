package websocket;

import com.alibaba.fastjson.JSONObject;
import enums.StateEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author weisong
 * @date 2018/12/14 11:00 PM
 */
@Service
public class WebSockerDo extends TextWebSocketHandler {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    //在线用户列表
    private static final ArrayList<WebSocketSession> users;
    //用户标识
//    private static final String CLIENT_ID = "username";

    static {
        users = new ArrayList<WebSocketSession>();
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("成功建立连接");
//        Object passenger = getPassenger(session);
//        System.out.println("5555" + username);
//        if (passenger != null) {
        users.add(session);
        logger.debug("添加了session:"+session);
//            session.sendMessage(new TextMessage("成功建立socket连接"));
//            System.out.println(passenger);
//            System.out.println(session);
//        }
        System.out.println("当前在线数量:"+users.size());
    }


    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        System.out.println(message.getPayload());

        WebSocketMessage message1 = new TextMessage("server:" + message);
        try {
            session.sendMessage(message1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private Object getPassenger(WebSocketSession session) {
        try {

            Object object = session.getAttributes().get("passenger");
            return object;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 发送信息给指定用户
     * @param message
     * @return
     */
    public boolean sendMessageToUser(String message,Object data) throws IOException {
        TextMessage textMessage = null;
        for (WebSocketSession user : users) {
            if (user.getAttributes().get("passenger") != null &&
                    user.isOpen() && StateEnum.ORDER_DEAL.getMessage().equals(message)) {
                textMessage = new TextMessage(message);
                user.sendMessage(textMessage);
            } else if (user.getAttributes().get("driver") != null &&
                    user.isOpen() && StateEnum.PAY_END.getMessage().equals(message)){
                textMessage = new TextMessage(JSONObject.toJSON(data).toString());
                user.sendMessage(textMessage);
            }
        }

//        WebSocketSession session = users.get(clientId);
//        System.out.println("sendMessage:" + session);
//        if (!session.isOpen()) {
//            System.out.println("7657");
//            return false;
//        }
//        try {
//            session.sendMessage(message);
//        } catch (IOException e) {
//            System.out.println(e);
//            return false;
//        }
        return true;
    }



}

