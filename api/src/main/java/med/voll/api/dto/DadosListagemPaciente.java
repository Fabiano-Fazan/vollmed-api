package med.voll.api.dto;

import med.voll.api.entity.PacienteEntity;

public record DadosListagemPaciente(String nome, String email, String cfp) {


    public DadosListagemPaciente(PacienteEntity pacienteEntity) {
        this(pacienteEntity.getNome(), pacienteEntity.getCpf(), pacienteEntity.getEmail());
    }
}
