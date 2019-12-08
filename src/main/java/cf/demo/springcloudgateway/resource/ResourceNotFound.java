package cf.demo.springcloudgateway.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class ResourceNotFound {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    static final String FORWARDED_URL = "X-CF-Forwarded-Url";

    @GetMapping("/fallback")
    public String  serviceNotAvilable() {
        return "Unable Route Request - Service Down / Service Not found";
    }







}




