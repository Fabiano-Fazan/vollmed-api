package med.voll.api.dto;

import med.voll.api.entity.EspecialidadeMedica;
import med.voll.api.entity.MedicoEntity;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public record DadosListagemMedico(String nome, String email, String crm, EspecialidadeMedica especialidadeMedica) {


    public DadosListagemMedico(MedicoEntity medicoEntity) {
        this(medicoEntity.getNome(), medicoEntity.getCrm(), medicoEntity.getEmail(), medicoEntity.getEspecialidadeMedica());
    }
}
