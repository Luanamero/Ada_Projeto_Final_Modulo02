package edu.ada.util;
//fazer os métodos estáticos?
public abstract class MetodosUteis {
    //TODO fazer aqui os métodos para verificar os dados

    //    (verficar numero)
    public static boolean validaNome(String nome) {

        if (nome == null || nome.isEmpty()) {
            return false;
        }

        return true;
    }

    public static boolean validaEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int inicioIndex = email.indexOf('@');
        int finalIndex = email.lastIndexOf('.');

        if (inicioIndex <= 0 || finalIndex <= inicioIndex + 1 || finalIndex >= email.length() - 1) {
            return false;
        }

        return finalIndex > inicioIndex + 1;

    }

    public static boolean validaTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()) {
            return false;
        }

        if (telefone.length() != 10 && telefone.length() != 11) {
            return false;
        }

        return true;
    }


}