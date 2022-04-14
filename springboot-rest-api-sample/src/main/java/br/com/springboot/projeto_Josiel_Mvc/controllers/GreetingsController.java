package br.com.springboot.projeto_Josiel_Mvc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * A sample greetings controller to return greeting text
 *  RestController intercepta todas requisição através da url mapeada
 *  Navegodar  / celular / tablet / outra máquina / app , depois executa métodos
 */
@RestController 
public class GreetingsController {
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/mostrarNome/{name}", method = RequestMethod.GET)  //parametro acessando a pág pela URL
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Projeto Cadastro Spring Boot API MVC: " + name + "!";     
    }
}
