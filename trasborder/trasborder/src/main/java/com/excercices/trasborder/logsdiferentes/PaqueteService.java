package com.excercices.trasborder.logsdiferentes;

import org.springframework.stereotype.Service;

@Service
public class PaqueteService {

    private final ClientFactory clientFactory;

    public PaqueteService(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    public PaqueteDTO getPackageCustom(){
        PaqueteDTO paqueteDTO = new PaqueteDTO("Package 123", "Success");

        String clientId = ClientHolder.getClientId();
        ClientStrategy strategy = clientFactory.getStrategy(clientId);
        return strategy.proccess(paqueteDTO);
    }
}
