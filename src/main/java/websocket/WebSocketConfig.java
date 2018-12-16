package websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @author weisong
 * @date 2018/12/14 10:30 PM
 */
@Configuration
@EnableWebMvc
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        //注册websocket server实现类，"/createOrder"访问websocket的地址
        registry.addHandler(setHandler(), "/websocket").addInterceptors(new WebSocketInterceptor());
//        registry.addHandler(setHandler(), "/WebSocketHandler").addInterceptors(new WebSocketInterceptor()).setAllowedOrigins("*");
        System.out.println("现在的位置:registerWebSocketHandlers");
    }

    /**
     * 设置进行消息处理的处理器（生成处理器）
     * @return
     */
    @Bean
    public WebSocketHandler setHandler() {
        return new WebSockerDo();
    }
}
