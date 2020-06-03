package spring.com.vendasroger.domain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.com.vendasroger.domain.dto.ClienteDTO;
import spring.com.vendasroger.domain.entity.Clientes;
import spring.com.vendasroger.domain.resouce.BaseController;
import spring.com.vendasroger.domain.service.ClientesService;

@RestController
@RequestMapping("/clientes")
public class ClientesController extends BaseController<Clientes, ClienteDTO, ClientesService> {
}
