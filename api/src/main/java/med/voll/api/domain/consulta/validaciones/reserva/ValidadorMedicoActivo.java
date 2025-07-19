package med.voll.api.domain.consulta.validaciones.reserva;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.medico.IMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoActivo implements IValidadorDeConsultas {

    @Autowired
    private IMedicoRepository repository;

    public void validar(DatosReservaConsulta datos) {
        // Selección del medico opcional
        if (datos.idMedico() == null) {
            return;
        }

        var medicoEstaActivo = repository.findActivoById(datos.idMedico());

        if (!medicoEstaActivo) {
            throw new ValidacionException("Consulta no puede ser reservada con medico excluido.");
        }

    }
}
