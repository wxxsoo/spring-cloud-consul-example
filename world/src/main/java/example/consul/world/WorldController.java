package example.consul.world;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wansoo.
 * User: accomplishlee
 * Date: 2020/12/16
 * Time: 1:50 오후
 */
@RestController
@RequestMapping("/world")
@RequiredArgsConstructor
public class WorldController {

    private final WorldProperty worldProperty;

    @GetMapping("/greeting")
    public String greeting() {
        return worldProperty.getMessage();
    }
}
