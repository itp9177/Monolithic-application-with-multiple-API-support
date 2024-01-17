package com.itp.youtube;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication
public class YoutubeApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(YoutubeApplication.class, args);
     /*   Server server = ServerBuilder
                .forPort(8085)
                .addService(new serv()).build();

        server.start();
        server.getServices().getFirst().getMethods().stream().map(x->x.getMethodDescriptor().getFullMethodName()+"yes").forEach(System.out::println);
        System.out.println(server.isShutdown());
        server.awaitTermination();
        System.out.println(server.isShutdown());*/

    }

}
