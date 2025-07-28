package com.excercices.trasborder.stackoverflow.Infrastructure;

import com.excercices.trasborder.stackoverflow.Application.ClientDTO;
import com.excercices.trasborder.stackoverflow.Domain.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientRestController {

    @PostMapping("/create-order")
    public ResponseEntity<Void> createOrder(@RequestBody ClientDTO clientDTO){
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public Client obtenerCliente(@PathVariable Long id) {
        return null;
    }
}
