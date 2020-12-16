package example.consul.world;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wansoo.
 * User: accomplishlee
 * Date: 2020/12/16
 * Time: 1:50 오후
 */
@RefreshScope
@Configuration
@Getter
public class WorldProperty {
    @Value("${spring.message}")
    private String message;
}
