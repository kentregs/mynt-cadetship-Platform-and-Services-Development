package ph.apper.activity;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("account-management")
    public static class AccountManagementController {

        @PostMapping
        public ResponseEntity create (@RequestBody Request request) {
//            LOGGER.info("{}", request);
            System.out.println(request);

            return ResponseEntity.ok().build();
        }

        @Data
        public static class Request {
            private String action;
            private String identifier;
        }
    }
}
