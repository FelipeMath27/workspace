package com.excercices.trasborder.logsdiferentes;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ClientFactory {
    private final Map<String, ClientStrategy> strategyMap = new HashMap<>();

    public ClientFactory(List<ClientStrategy> strategies){
        for (ClientStrategy strategy : strategies){
            strategyMap.put(strategy.getClientId(),strategy);
        }
    }

    public ClientStrategy getStrategy(String clienteId) {
        return strategyMap.getOrDefault(clienteId, new DefaultStrategy());
    }

    private static class DefaultStrategy implements ClientStrategy {

        @Override
        public PaqueteDTO proccess(PaqueteDTO paqueteDTO) {
            paqueteDTO.setDetail("Unknown client");
            return paqueteDTO;
        }

        @Override
        public String getClientId() {
            return "DEFAULT";
        }
    }
}
