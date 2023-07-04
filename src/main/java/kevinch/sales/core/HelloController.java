package kevinch.sales.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/upload-csv-sales-stock")
    public String salesstock() {
        return "Our Progress...";
    }

    @RequestMapping("/upload-csv-sales-lines")
    public String salesline() {
        return "Our Progress...";
    }
}