package com.mydeveloperplanet.myspringwebfluxplanet.examples;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * A handler for own examples
 */
@Component
public class ExampleHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, Spring Webflux Example!"));
    }

    public Mono<ServerResponse> helloFurther1(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, Spring Webflux Example 1!"));
    }

    public Mono<ServerResponse> helloFurther2(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, Spring Webflux Example 2!"));
    }

    public Mono<ServerResponse> helloFurther3(ServerRequest request) {
        String name = request.queryParam("name").get();
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, " + name + "!"));
    }

}
