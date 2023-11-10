package com.fabian.backend.shophouse.producto;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/producto")
@RequiredArgsConstructor
public class ProductoController {
    private String FILE_PATH_ROOT = "/Users/wilson/Documents/tiendafiles/producto/";
}
