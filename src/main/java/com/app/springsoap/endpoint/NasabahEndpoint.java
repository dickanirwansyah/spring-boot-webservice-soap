package com.app.springsoap.endpoint;

import com.app.springsoap.entity.Nasabah;
import com.app.springsoap.service.NasabahService;
import com.myhost.spring_soap.nasabah_ws.GetResponseNasabahAll;
import com.myhost.spring_soap.nasabah_ws.NasabahInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class NasabahEndpoint {

    private static final String STATIC_NAME_SPACE = "http://myhost.com/spring-soap/nasabah-ws";

    @Autowired
    private NasabahService nasabahService;

    @PayloadRoot(namespace = STATIC_NAME_SPACE,
        localPart = "getRequestNasabahAll")
    @ResponsePayload
    public GetResponseNasabahAll getAllNasabah(){
        GetResponseNasabahAll responseNasabah = new GetResponseNasabahAll();
        List<NasabahInfo> nasabahInfos = new ArrayList<>();
        List<Nasabah> nasabahs = nasabahService.getAllNasabah();
        for (int i=0; i < nasabahs.size(); i++){
            NasabahInfo nasabahInfo = new NasabahInfo();
            BeanUtils.copyProperties(nasabahs.get(i), nasabahInfo);
            nasabahInfos.add(nasabahInfo);
        }
        responseNasabah.getNasabahInfo()
                .addAll(nasabahInfos);
        return responseNasabah;
    }
}
