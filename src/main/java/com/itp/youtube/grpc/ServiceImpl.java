package com.itp.youtube.grpc;



import com.itp.youtube.grpc.dto.mMessage1;
import com.itp.youtube.grpc.dto.mMessage2.Message2;
import com.itp.youtube.grpc.service.RouteGuideGrpc.RouteGuideImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ServiceImpl extends RouteGuideImplBase {

    @Override
    public void listFeatures(Message2 request, StreamObserver<mMessage1.Message1> responseObserver) {
       mMessage1.Message1 p= mMessage1.Message1.newBuilder().setFirstName("indu").setLastName("indu").build();

        responseObserver.onNext(p);
        responseObserver.onCompleted();
    }

    @Override
    public void getFeature(mMessage1.Message1 request, StreamObserver<Message2> responseObserver) {
        Message2 p= Message2.newBuilder().setFirstName("indu").setLastName("indu").build();
        responseObserver.onNext(p);
        responseObserver.onCompleted();
    }
}
