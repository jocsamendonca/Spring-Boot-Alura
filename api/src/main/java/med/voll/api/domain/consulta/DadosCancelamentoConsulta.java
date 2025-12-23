package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo
) {
}
