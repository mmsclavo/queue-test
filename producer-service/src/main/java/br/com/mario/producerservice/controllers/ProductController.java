package br.com.mario.producerservice.controllers;

import br.com.mario.producerservice.services.ProductService;
import br.com.mario.producerservice.services.StringService;
import lombok.RequiredArgsConstructor;
import org.rabbitmq.dtos.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/products")
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<String> produces(@RequestBody ProductDTO dto) {
        service.createProduct(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
