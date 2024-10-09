package fornari.nucleo.domain.dto.usuario;

import fornari.nucleo.domain.dto.EnderecoDto;
import fornari.nucleo.domain.entity.Endereco;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDate;

@Data
public class UsuarioEmployeeResponseDto {

    private Integer id;

    private String nome;

    private String cpf;

    private String email;

    private LocalDate dtNasc;

    private String funcao;

    private EnderecoDto endereco;
}
