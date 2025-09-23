package med.voll.api.dto;

import med.voll.api.entity.EspecialidadeMedica;

public record DadosCadastroMedico(String nome, String email, String crm, EspecialidadeMedica especialidadeMedica, DadosEndereco dadosEndereco) {
}
