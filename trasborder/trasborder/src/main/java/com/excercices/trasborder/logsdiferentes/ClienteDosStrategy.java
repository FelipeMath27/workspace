package com.excercices.trasborder.logsdiferentes;

import org.springframework.stereotype.Component;

@Component
public class ClienteDosStrategy implements ClientStrategy{
    @Override
    public PaqueteDTO proccess(PaqueteDTO paqueteDTO) {
        paqueteDTO.setDetail("Abstract: send");
        return paqueteDTO;
    }

    @Override
    public String getClientId() {
        return "DOS";
    }
}
