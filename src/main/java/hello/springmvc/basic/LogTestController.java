package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace(" trace my log="+ name);
        log.trace("trace log={}", name);

        log.debug("debug log=" + name); // 개발 서버 같은곳에서 보는 정보
        log.info(" info log={}", name); // 운영 시스템에서도 봐야 하는 정보
        log.warn(" warn log=" + name); // 경고
        log.error("error log={}", name); // 에러

        return "ok";
    }
}
