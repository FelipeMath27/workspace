package com.excercices.trasborder.logsdiferentes;

import org.springframework.stereotype.Component;

@Component
public class ClienteUnoStrategy implements ClientStrategy{

    @Override
    public PaqueteDTO proccess(PaqueteDTO paqueteDTO) {
        paqueteDTO.setDetail("Full log: " + paqueteDTO.getDetail());
        return paqueteDTO;
    }

    @Override
    public String getClientId() {
        return "UNO";
    }
}
