package med.voll.api.domain.consulta.validaciones.reserva;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.consulta.IConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidarMedicoConOtraConsultaEnElMismoHorario implements IValidadorDeConsultas {

    @Autowired
    private IConsultaRepository repository;

    public void validar(DatosReservaConsulta datos) {
        var medicoTieneOtraConsultaEnElMismoHorario = repository.existsByMedicoIdAndFecha(datos.idMedico(), datos.fecha());

        if (medicoTieneOtraConsultaEnElMismoHorario) {
            throw new ValidacionException("El medico ya tiene otra consulta en esa misma fecha y hora.");
        }
    }
}
