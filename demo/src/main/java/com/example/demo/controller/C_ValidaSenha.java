package com.example.demo.controller;

import com.example.demo.service.S_ValidaSenha;
import org.springframework.stereotype.Controller;

@Controller
public class C_ValidaSenha {
    public static String ChecarSenha(String senhaAtual){
        if(!senhaAtual.isEmpty() && S_ValidaSenha.ValidaSenha(senhaAtual)){
            return "true";
        }
        return "false";
    }
}
