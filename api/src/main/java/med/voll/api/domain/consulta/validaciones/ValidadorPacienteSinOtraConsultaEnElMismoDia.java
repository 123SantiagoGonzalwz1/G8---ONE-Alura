package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.consulta.IConsultaRepository;

public class ValidadorPacienteSinOtraConsultaEnElMismoDia {

    private IConsultaRepository repository;

    public void validar(DatosReservaConsulta datos) {
        var primerHorario = datos.fecha().withHour(7);
        var ultimoHorario = datos.fecha().withHour(18);
        var pacienteTieneOtraConsultaEnElDia = repository.existsByPacienteeIdAndFechaBetween(datos.idPaciente(), primerHorario, ultimoHorario);

        if (pacienteTieneOtraConsultaEnElDia) {
            throw new ValidacionException("El paciente ya tiene una consulta reservada para ese dia.");
        }
    }
}
