package plataforma;

public class Pessoas {

	
	int id;
	String nome;
    String email;
    String funcao;

    Pessoas(String nome, String email, int id, String funcao) {
        this.nome = nome;
        this.email = email;
        this.id = id;
        this.funcao = funcao;
    }

    String getNome() {
        return nome;
    }
    void setNome(String novoNome) {
        this.nome = novoNome;
    }

    String getEmail() {
        return email;
    }
    void setEmail(String novoEmail) {
        this.email = novoEmail;
    }

    int getId() {
        return id;
    }
    void setId(int novoId) {
        this.id = novoId;
    }

    String getFuncao() {
        return funcao;
    }
    void setFuncao(String novaFuncao) {
        this.funcao = novaFuncao;
    }

    public void add(Pessoas pessoas) {
    
    	
    	
    }
}



