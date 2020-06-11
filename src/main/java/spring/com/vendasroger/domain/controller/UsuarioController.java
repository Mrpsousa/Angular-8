package spring.com.vendasroger.domain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.com.vendasroger.domain.dto.UsuarioDTO;
import spring.com.vendasroger.domain.entity.Usuario;
import spring.com.vendasroger.domain.resouce.BaseController;
import spring.com.vendasroger.domain.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends BaseController<Usuario, UsuarioDTO, UsuarioService> {
}
