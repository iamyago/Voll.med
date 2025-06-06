package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

@Embeddable

public class Endereco {
        private String logradouro;
        private String bairro;
        private String cep;
        private String numero;
        private String complemento;
        private String cidade;
        private String uf;

        public Endereco(DadosEndereco dados) {
                this.logradouro = dados.logradouro();
                this.cep = dados.cep();
                this.uf = dados.uf();
                this.bairro = dados.bairro();
                this.numero = dados.numero();
                this.complemento = dados.complemento();
                this.cidade = dados.cidade();
        }
}
