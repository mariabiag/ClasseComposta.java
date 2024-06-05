public class Cliente {

			private String nome;
			private String CPF;
			private String dataNascimento;
			private Produto produto;
			
			public Cliente (String novoNome, String novoCPF, String novaDataNascimento, Produto novoProduto) {
				this.nome = novoNome;
				this.CPF = novoCPF;
				this.dataNascimento = novaDataNascimento;
				this.produto = novoProduto;
				}
			
			public String getNome () {
				return nome;
			}
			
			public String getCPF () {
				return CPF;
			}
			
			public String getDataNascimento () {
				return dataNascimento;
			}
			
			public void setNome (String novoNome) {
				this.nome = novoNome;
			}
			
			public void setCPF (String novoCPF) {
				this.CPF = novoCPF;
			}
			
			public void setDataNascimento (String novoDataNascimento) {
				this.dataNascimento = novoDataNascimento;
			}
			
			public void setProduto (Produto novoProduto) {
				this.produto =  novoProduto;
			}		
				public String imprimirInformacoes (){
					return "Seu nome é: "  + this.nome + "\n Seu cpf é: " + this.CPF + "\n Sua data de nascimento é: " + this.dataNascimento + "\n O produto é: " + this.produto;
	}

}
