package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.CifradorDeSenha;
import org.springframework.security.crypto.bcrypt.BCrypt;


public class CifradorDeSenhaComBcrypt implements CifradorDeSenha {
    @Override
    public String cifraSenha(String senha) {

        // Gera um sal aleatório
        String salGerado = BCrypt.gensalt();
        //System.out.println("O sal gerado foi $" + salGerado + "$");

        // Gera a senha hasheada utilizando o sal gerado
        String senhaHasheada = BCrypt.hashpw(senha, salGerado);

        return senhaHasheada;
    }

    @Override
    public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
        return BCrypt.checkpw(senhaCifrada, senha);
    }
}
