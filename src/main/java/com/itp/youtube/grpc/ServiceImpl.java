package com.itp.youtube.grpc;

import org.springframework.security.access.annotation.Secured;
import com.itp.youtube.Config.gRPCConfig;
import com.itp.youtube.grpc.dto.mMessage1;
import com.itp.youtube.grpc.dto.mMessage2.Message2;
import com.itp.youtube.grpc.service.RouteGuideGrpc.RouteGuideImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class ServiceImpl extends RouteGuideImplBase {

    private static final Logger log = LoggerFactory.getLogger(ServiceImpl.class);

  //test code
    @Override
    @Secured("ROLE_GREET")
    public void listFeatures(Message2 request, StreamObserver<mMessage1.Message1> responseObserver) {
    
       mMessage1.Message1 p= mMessage1.Message1.newBuilder().setFirstName("indu").setLastName("indu").build();

        responseObserver.onNext(p);
        responseObserver.onCompleted();
    }
    
    // test code
    @Secured("ROLE_GREET2")
    @Override
    public void getFeature(mMessage1.Message1 request, StreamObserver<Message2> responseObserver) {
        
        Message2 p= Message2.newBuilder().setFirstName("indu").setLastName("indu").build();
        responseObserver.onNext(p);
        responseObserver.onCompleted();
    }
}
