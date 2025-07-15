package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.consulta.IConsultaRepository;

public class ValidarMedicoConOtraConsultaEnElMismoHorario {
    private IConsultaRepository repository;

    public void validar(DatosReservaConsulta datos) {
        var medicoTieneOtraConsultaEnElMismoHorario = repository.existsByMedicoIdAndFecha(datos.idMedico(), datos.fecha());

        if (medicoTieneOtraConsultaEnElMismoHorario) {
            throw new ValidacionException("El medico ya tiene otra consulta en esa misma fecha y hora.");
        }
    }
}
