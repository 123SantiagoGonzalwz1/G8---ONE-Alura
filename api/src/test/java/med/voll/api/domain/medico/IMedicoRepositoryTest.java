package med.voll.api.domain.medico;

import jakarta.persistence.EntityManager;
import med.voll.api.domain.consulta.Consulta;
import med.voll.api.domain.direccion.DatosDireccion;
import med.voll.api.domain.paciente.DatosRegistroPaciente;
import med.voll.api.domain.paciente.Paciente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class IMedicoRepositoryTest {

    @Autowired
    private IMedicoRepository iMedicoRepository;

    @Autowired
    private EntityManager em;

    @Test
    @DisplayName("Deberia devolver null cuando el medico buscado existe, pero no esta disponible en esa fecha.")
    void elegirMedicoAleatorioDisponibleEnLaFechaEscenario1() {
        // given or arrange
        var lunesSiguienteALas10 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY)).atTime(10,0);
        var medico = registrarMedico("Medico1", "medico@gmail.com",  "1234546789", Especialidad.CARDIOLOGIA);
        var paciente = registrarPaciente("Paciente1", "paciente@gmail.com", "324123456");
        registrarConsulta(medico, paciente, lunesSiguienteALas10);

        // when or act
        var medicoLibre = iMedicoRepository.elegirMedicoAleatorioDisponibleEnLaFecha(Especialidad.CARDIOLOGIA, lunesSiguienteALas10);

        // then or assert
        assertThat(medicoLibre).isNull();
    }

    @Test
    @DisplayName("Deberia devolver un medico cuando el medico buscado esta disponible en esa fecha.")
    void elegirMedicoAleatorioDisponibleEnLaFechaEscenario2() {
        // given or arrange
        var lunesSiguienteALas10 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY)).atTime(10,0);
        var medico = registrarMedico("Medico1", "medico@gmail.com",  "1234546789", Especialidad.CARDIOLOGIA);

        // when or act
        var medicoLibre = iMedicoRepository.elegirMedicoAleatorioDisponibleEnLaFecha(Especialidad.CARDIOLOGIA, lunesSiguienteALas10);

        // then or assert
        assertThat(medicoLibre).isEqualTo(medico);
    }

    private void registrarConsulta(Medico medico, Paciente paciente, LocalDateTime fecha) {
        em.persist(new Consulta(null, medico, paciente, fecha));
    }

    private Medico registrarMedico(String nombre, String email, String documento, Especialidad especialidad) {
        var medico = new Medico(datosMedico(nombre, email, documento, especialidad));
        em.persist(medico);
        return medico;
    }

    private Paciente registrarPaciente(String nombre, String email, String documento) {
        var paciente = new Paciente(datosPaciente(nombre, email, documento));

        em.persist(paciente);
        return paciente;
    }

    private DatosRegistroMedico datosMedico(String nombre, String email, String documento, Especialidad especialidad) {
        return new DatosRegistroMedico(
                nombre,
                email,
                "3412397861",
                documento,
                especialidad,
                datosDireccion()
        );
    }

    private DatosRegistroPaciente datosPaciente(String nombre, String email, String documento) {
        return new DatosRegistroPaciente(
                nombre,
                email,
                "3354567456",
                documento,
                datosDireccion()
        );
    }

    private DatosDireccion datosDireccion() {
        return new DatosDireccion(
                "35",
                "42",
                "A",
                "Ciudadela",
                "Bogotá",
                "123455",
                "Cundinamarca"
        );
    }
}