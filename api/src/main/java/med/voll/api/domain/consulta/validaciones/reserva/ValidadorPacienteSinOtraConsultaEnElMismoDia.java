package med.voll.api.domain.consulta.validaciones.reserva;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.consulta.IConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteSinOtraConsultaEnElMismoDia implements IValidadorDeConsultas {

    @Autowired
    private IConsultaRepository repository;

    public void validar(DatosReservaConsulta datos) {
        var primerHorario = datos.fecha().withHour(7);
        var ultimoHorario = datos.fecha().withHour(18);
        var pacienteTieneOtraConsultaEnElDia = repository.existsByPacienteIdAndFechaBetween(datos.idPaciente(), primerHorario, ultimoHorario);

        if (pacienteTieneOtraConsultaEnElDia) {
            throw new ValidacionException("El paciente ya tiene una consulta reservada para ese dia.");
        }
    }
}
