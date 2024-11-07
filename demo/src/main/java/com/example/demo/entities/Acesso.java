package com.example.demo.entities;

public class Acesso {
    private static String senha = "1234";

    public static String ChecarSenha(String senhaAtual){
        if(senhaAtual.equals(senha)){
            return "true";
        }
        return "false";
    }
}
