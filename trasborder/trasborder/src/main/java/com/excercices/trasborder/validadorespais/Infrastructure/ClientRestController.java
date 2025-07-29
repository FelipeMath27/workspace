package com.excercices.trasborder.validadorespais.Infrastructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientRestController {

    private final ClientService clientService;

    public ClientRestController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/valid")
    public String valid(@RequestParam String country, @RequestParam String identification){
        boolean valid = clientService.vaidateIdentification(country,identification);
        return valid ? "Valid identification" : "Invalid identification";
    }
}
