package example.consul.gateway;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wansoo.
 * User: accomplishlee
 * Date: 2020/12/16
 * Time: 2:55 오후
 */
@RestController
@RequestMapping("/gateway")
@RequiredArgsConstructor
public class GatewayController {
    private final GatewayProperty gatewayProperty;

    @GetMapping("/greeting")
    public String greeting() {
        return gatewayProperty.getMessage();
//        return "i am gateway service";
    }
}
