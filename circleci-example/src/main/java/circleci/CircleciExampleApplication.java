package circleci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CircleciExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircleciExampleApplication.class, args);
    }

    @GetMapping
    String showGreetings() {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta http-equiv="X-UA-Compatible" content="IE=edge">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Document</title>
                </head>
                <body>
                    <p>Hello from Beksultan</p>
                    <img src="https://i.pinimg.com/564x/81/26/35/812635875bbc1b778f1dc33d3699aaf0.jpg">
                </body>
                </html>
                """;
    }

}
