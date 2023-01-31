package br.com.api.produtos.modelo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

// ANOTATION RESPONSAVEL POR INSTANCIAR OBJETOS
@Component
@Getter
@Setter
public class RespostaModelo {
    
    // ATRIBUTO
    private String mensagem;
}
