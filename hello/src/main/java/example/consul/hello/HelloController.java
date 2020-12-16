package example.consul.hello;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wansoo.
 * User: accomplishlee
 * Date: 2020/12/16
 * Time: 11:21 오전
 */
@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

    private final HelloProperty helloProperty;

    @GetMapping("/greeting")
    public String greeting() {
        return helloProperty.getMessage();
    }
}
