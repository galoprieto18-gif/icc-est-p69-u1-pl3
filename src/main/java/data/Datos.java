package data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import models.Incidente;
import models.ServicioAfectado;

/**
 * Instantánea fija: 1000 incidentes explícitos, desordenados. No genera datos
 * al ejecutar.
 * 
 * SIMULACION DE LECTRUA DE UNA BASE DE DATOS LOS REGISTROS
 */
public final class Datos {
    private Datos() {
    }

    public static List<Incidente> cargar() {
        List<Incidente> datos = new ArrayList<>(1000);
        bloque0(datos);
        bloque1(datos);
        bloque2(datos);
        bloque3(datos);
        bloque4(datos);
        bloque5(datos);
        bloque6(datos);
        bloque7(datos);
        bloque8(datos);
        bloque9(datos);
        return datos;
    }

    private static void bloque0(List<Incidente> datos) {
        datos.add(new Incidente("INC-0345", 4, 15,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0731", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0787", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0712", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0709", 2, 60, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente(
                "INC-0373", 4, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente(
                "INC-0155", 2, 15, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0545", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 0)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0909", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0086", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0381", 4, 30, List.of(), LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0628", 3, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0695", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0036", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0040", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0323", 2, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0475", 4, 120, List.of(), LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente(
                "INC-0269", 1, -120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0569", 1, 60, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente( 
                "INC-0053", 1, -120, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0766", 2, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0812", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0760", 1, 60,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente(
                "INC-0054", 1, -120, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0294", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0716", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente(
                "INC-0051", 1, -120, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0488", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente(
                "INC-0433", 3, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente(
                "INC-0983", 3, -120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0205", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0449", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0528", 1, 0, List.of(), LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente(
                "INC-0614", 4, 0, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0102", 3, 15, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0887", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0833", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0427", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0721", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0084", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0389", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0680", 3, 120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0739", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0014", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0919", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0950", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0115", 2, 60, List.of(), LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0491", 4, -120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0644", 3, 0, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente(
                "INC-0049", 4, 60, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0164", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0437", 3, -30, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0474", 4, 120, List.of(), LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente(
                "INC-0825", 3, 0, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0001", 2, -120, List.of(), LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0106", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0072", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0512", 1, 15, List.of(), LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0039", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0243", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0924", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente(
                "INC-0047", 4, 60, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0099", 1, 30, List.of(), LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0864", 2, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0312", 2, 0, List.of(), LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0130", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0684", 4, 15, List.of(), LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0023", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0817", 4, 60, List.of(), LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente(
                "INC-0454", 1, -30, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0634", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0998", 3, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente(
                "INC-0180", 4, 15, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0828", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0980", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0657", 3, -120, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente(
                "INC-0151", 2, 15, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0866", 1, 0, List.of(), LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0392", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0222", 3, 15, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0232", 1, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0367", 4, 0, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0425", 4, 120, List.of(), LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0098", 1, 30, List.of(), LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente(
                "INC-0239", 3, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0274", 1, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente(
                "INC-0055", 1, -120, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0724", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente(
                "INC-0898", 4, 30, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0765", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0914", 1, 60, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente(
                "INC-0150", 3, -120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0321", 2, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0259", 1, -120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0700", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0253", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0485", 2, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente(
                "INC-0653", 3, 120, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0297", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0284", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
    }

    private static void bloque1(List<Incidente> datos) {
        datos.add(new Incidente("INC-0060", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0691", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente(
                "INC-0146", 3, -120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0959", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0396", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0791", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0754", 4, 60, List.of(), LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0967", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0704", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0969", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0406", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0337", 2, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0116", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0907", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0103", 3, 15, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0361", 2, 0, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0395", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0743", 1, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0883", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0756", 1, 60,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0018", 1, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente(
                "INC-0214", 3, 30, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0888", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0272", 1, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0667", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0855", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0976", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0917", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente(
                "INC-0779", 4, 60, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente(
                "INC-0032", 3, 120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0260", 1, -120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0579", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0629", 3, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0748", 3, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0568", 1, 60, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0400", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente(
                "INC-0615", 4, 0, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0105", 3, 15, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0383", 4, 30, List.of(), LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0220", 4, 60, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0207", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente(
                "INC-0240", 3, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0386", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0736", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente(
                "INC-0455", 1, -30, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente(
                "INC-0212", 3, 30, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0788", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0522", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente(
                "INC-0581", 4, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente(
                "INC-0236", 3, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0342", 4, 15,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0354", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0473", 4, 120, List.of(), LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0997", 3, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0348", 2, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0783", 3, 120, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0801", 2, 120, List.of(), LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0202", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0811", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0575", 3, 0, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0816", 4, 60, List.of(), LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0631", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0706", 2, 60, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0252", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0936", 3, -120, List.of(), LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0304", 2, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0017", 1, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente(
                "INC-0443", 3, 30, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0065", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0264", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0458", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0882", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0135", 2, 15, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0668", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0088", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0945", 3, 120, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0753", 4, 60, List.of(), LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente(
                "INC-0519", 2, 120, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0596", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0830", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0300", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente(
                "INC-0899", 4, 30, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente(
                "INC-0981", 3, -120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente(
                "INC-0952", 1, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0011", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0630", 3, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0938", 3, -120, List.of(), LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0061", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0258", 1, -120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0489", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0768", 2, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0218", 4, 60, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0502", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente(
                "INC-0896", 4, 30, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0660", 3, -120, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0460", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente(
                "INC-0989", 1, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0467", 4, 0, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0423", 4, 120, List.of(), LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0210", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
    }

    private static void bloque2(List<Incidente> datos) {
        datos.add(new Incidente("INC-0876", 1, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0290", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0006", 4, 120, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0742", 1, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0767", 2, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0254", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0703", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0772", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0459", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0995", 3, 120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0537", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0314", 2, 0, List.of(), LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0671", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0393", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0132", 2, 15, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente(
                "INC-0953", 1, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0352", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0318", 3, -1, List.of(), LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0746", 3, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0908", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0075", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0481", 2, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0626", 3, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0571", 3, 0, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0456", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0073", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0306", 1, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0832", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0675", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0059", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0893", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente(
                "INC-0280", 1, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0867", 1, 0, List.of(), LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0109", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0510", 2, 60,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0956", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0642", 3, 0, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0499", 3, -30, List.of(), LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0759", 1, 60,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0590", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0618", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0193", 3, 15, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0191", 3, 15, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0845", 3, 15,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0334", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0673", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0104", 3, 15, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0844", 3, 15,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0247", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente(
                "INC-0613", 4, 0, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0751", 4, 60, List.of(), LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0564", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0091", 4, -1, List.of(), LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0851", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0541", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 0)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0322", 2, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0551", 4, 120, List.of(), LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0910", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0498", 3, -30, List.of(), LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0705", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0421", 4, 120, List.of(), LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0429", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0681", 4, 15, List.of(), LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0560", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0647", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente(
                "INC-0148", 3, -120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0299", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0796", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente(
                "INC-0442", 3, 30, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0217", 4, 60, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0890", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0504", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0802", 2, 120, List.of(), LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0927", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0875", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0404", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0920", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0496", 3, -30, List.of(), LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0609", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0223", 3, 15, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0241", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0659", 3, -120, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0544", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 0)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente(
                "INC-0277", 1, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0112", 2, 60, List.of(), LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0911", 1, 60, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0683", 4, 15, List.of(), LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0693", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0663", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0892", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0636", 2, 15,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0639", 2, 15,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0718", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0161", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0068", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0329", 4, 30, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0536", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0192", 3, 15, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente(
                "INC-0464", 4, -120, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0996", 3, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
    }

    private static void bloque3(List<Incidente> datos) {
        datos.add(new Incidente("INC-0507", 2, 60,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0111", 2, 60, List.of(), LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0171", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0123", 2, -120, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0446", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente(
                "INC-0276", 1, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0889", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0912", 1, 60, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0283", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0257", 1, -120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0620", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente(
                "INC-0584", 4, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0136", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0330", 4, 30, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0698", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0588", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0770", 2, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente(
                "INC-0477", 1, -1, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0702", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0799", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0902", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0470", 4, 0, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0717", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0346", 2, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0548", 3, -30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0101", 3, 15, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0547", 3, -30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0593", 1, 60, List.of(), LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente(
                "INC-0777", 4, 60, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0042", 4, 60, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0632", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0880", 1, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0803", 2, 120, List.of(), LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0189", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0466", 4, 0, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0764", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0166", 2, 60, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0934", 2, 60, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0399", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0858", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0930", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0387", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0197", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0738", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0853", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0071", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0182", 2, 60, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0305", 2, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente(
                "INC-0651", 3, 120, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0978", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0403", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0201", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0508", 2, 60,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0979", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0552", 4, 120, List.of(), LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0941", 3, 120, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0143", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0357", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0287", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0327", 4, 30, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0133", 2, 15, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0138", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0064", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0125", 2, -120, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0961", 1, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0324", 2, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0935", 2, 60, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0122", 2, -120, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0873", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0422", 4, 120, List.of(), LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0343", 4, 15,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0957", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0244", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente(
                "INC-0048", 4, 60, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0795", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0382", 4, 30, List.of(), LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0391", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0200", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0081", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0946", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0281", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0484", 2, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0891", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0317", 3, -1, List.of(), LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0781", 3, 120, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0020", 1, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0643", 3, 0, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0339", 2, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0905", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0487", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0521", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0175", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0296", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0416", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente(
                "INC-0453", 1, -30, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0325", 2, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0792", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0744", 1, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0775", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente(
                "INC-0611", 4, 0, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
    }

    private static void bloque4(List<Incidente> datos) {
        datos.add(new Incidente("INC-0838", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente(
                "INC-0176", 4, 15, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0948", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0420", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0256", 1, -120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0621", 4, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0160", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0877", 1, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0286", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0126", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0913", 1, 60, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0113", 2, 60, List.of(), LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0734", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0141", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0319", 3, -1, List.of(), LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0862", 2, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0650", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0617", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0771", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0661", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0417", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0878", 1, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0038", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0186", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente(
                "INC-0726", 2, 30, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0119", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0494", 4, -120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-1000", 3, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0506", 2, 60,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0390", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente(
                "INC-0268", 1, -120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente(
                "INC-0518", 2, 120, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0415", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0774", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0523", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0688", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0682", 4, 15, List.of(), LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0315", 2, 0, List.of(), LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0515", 1, 15, List.of(), LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente(
                "INC-0152", 2, 15, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0288", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0144", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0566", 1, 60, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0332", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0857", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0886", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0359", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente(
                "INC-0238", 3, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0142", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0710", 2, 60, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0863", 2, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0378", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0881", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0183", 2, 60, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0608", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0407", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente(
                "INC-0982", 3, -120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0554", 4, 120, List.of(), LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0501", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0794", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0923", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0083", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente(
                "INC-0971", 2, 15, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0331", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0376", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente(
                "INC-0154", 2, 15, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0782", 3, 120, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0509", 2, 60,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente(
                "INC-0951", 1, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0336", 2, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0761", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente(
                "INC-0149", 3, -120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente(
                "INC-0582", 4, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0785", 3, 120, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0797", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0385", 4, 30, List.of(), LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0411", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0815", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0758", 1, 60,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0221", 3, 15, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0248", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente(
                "INC-0602", 3, -30, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0120", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente(
                "INC-0479", 1, -1, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0606", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente(
                "INC-0975", 2, 15, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0818", 4, 60, List.of(), LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0028", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0366", 4, 0, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0713", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0735", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0188", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0562", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0289", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0725", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0511", 1, 15, List.of(), LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0885", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente(
                "INC-0050", 4, 60, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0490", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0347", 2, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
    }

    private static void bloque5(List<Incidente> datos) {
        datos.add(new Incidente("INC-0044", 4, 60, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0580", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0007", 4, 120, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente(
                "INC-0780", 4, 60, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0301", 2, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0852", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0689", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente(
                "INC-0603", 3, -30, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0835", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0128", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0622", 4, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente(
                "INC-0270", 1, -120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0789", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0170", 2, 60, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0625", 4, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente(
                "INC-0654", 3, 120, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0592", 1, 60, List.of(), LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente(
                "INC-0823", 3, 0, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0208", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0578", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente(
                "INC-0441", 3, 30, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0534", 4, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0672", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0701", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0439", 3, -30, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0874", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0591", 1, 60, List.of(), LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente(
                "INC-0374", 4, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0159", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0233", 1, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0282", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0839", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0174", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente(
                "INC-0451", 1, -30, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0187", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0871", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0846", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0199", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0414", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0784", 3, 120, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0641", 3, 0, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente(
                "INC-0480", 1, -1, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0977", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0685", 4, 15, List.of(), LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0926", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0646", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0492", 4, -120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0333", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0185", 2, 60, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0524", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0916", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0714", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0430", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0165", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0070", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente(
                "INC-0778", 4, 60, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0616", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0110", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0662", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0117", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente(
                "INC-0431", 3, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0999", 3, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0707", 2, 60, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0428", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0275", 1, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0360", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente(
                "INC-0178", 4, 15, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0666", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0242", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente(
                "INC-0897", 4, 30, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0408", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente(
                "INC-0177", 4, 15, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0370", 4, 0, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0134", 2, 15, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0557", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente(
                "INC-0211", 3, 30, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0940", 3, -120, List.of(), LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0457", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0820", 4, 60, List.of(), LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0063", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0358", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0733", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0107", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0842", 3, 15,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0966", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0699", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0468", 4, 0, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0600", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0773", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0190", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0576", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0308", 1, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0968", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0529", 1, 0, List.of(), LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente(
                "INC-0035", 3, 120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0697", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0595", 1, 60, List.of(), LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0362", 2, 0, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0369", 4, 0, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0409", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T10:00:00")));
    }

    private static void bloque6(List<Incidente> datos) {
        datos.add(new Incidente("INC-0096", 1, 30, List.of(), LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0810", 3, -120, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0807", 3, -120, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0827", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0565", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0553", 4, 120, List.of(), LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0800", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0860", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente(
                "INC-0776", 4, 60, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0169", 2, 60, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0008", 4, 120, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0500", 3, -30, List.of(), LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0341", 4, 15,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente(
                "INC-0476", 1, -1, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0225", 3, 15, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente(
                "INC-0267", 1, -120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente(
                "INC-0585", 4, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0226", 4, -30, List.of(), LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0538", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente(
                "INC-0954", 1, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0749", 3, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0145", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente(
                "INC-0652", 3, 120, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0732", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0549", 3, -30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0364", 2, 0, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente(
                "INC-0728", 2, 30, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0206", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0856", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente(
                "INC-0517", 2, 120, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0745", 1, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0861", 2, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente(
                "INC-0612", 4, 0, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0572", 3, 0, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0196", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0843", 3, 15,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0558", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0526", 1, 0, List.of(), LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0635", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0525", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente(
                "INC-0432", 3, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0413", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0230", 4, -30, List.of(), LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0398", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0623", 4, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0255", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0087", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0922", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0095", 4, -1, List.of(), LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0093", 4, -1, List.of(), LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente(
                "INC-0452", 1, -30, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0076", 2, 60, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0094", 4, -1, List.of(), LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente(
                "INC-0046", 4, 60, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0894", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0129", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0158", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0436", 3, -30, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0118", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente(
                "INC-0604", 3, -30, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente(
                "INC-0984", 3, -120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0607", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0365", 2, 0, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente(
                "INC-0444", 3, 30, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0328", 4, 30, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente(
                "INC-0465", 4, -120, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0227", 4, -30, List.of(), LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0379", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0679", 3, 120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente(
                "INC-0605", 3, -30, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0471", 4, 120, List.of(), LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0250", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0292", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0826", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0532", 4, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0219", 4, 60, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0932", 2, 60, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0097", 1, 30, List.of(), LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0303", 2, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0737", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente(
                "INC-0516", 2, 120, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0865", 2, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0027", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0108", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente(
                "INC-0955", 1, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0497", 3, -30, List.of(), LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0405", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0944", 3, 120, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0906", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0884", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente(
                "INC-0434", 3, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0194", 3, 15, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0162", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente(
                "INC-0462", 4, -120, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0563", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0090", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0752", 4, 60, List.of(), LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0058", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0637", 2, 15,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0546", 3, -30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
    }

    private static void bloque7(List<Incidente> datos) {
        datos.add(new Incidente("INC-0556", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0350", 2, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0418", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0388", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0447", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0229", 4, -30, List.of(), LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0678", 3, 120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0493", 4, -120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0805", 2, 120, List.of(), LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0708", 2, 60, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0970", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0022", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0804", 2, 120, List.of(), LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente(
                "INC-0463", 4, -120, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0163", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0045", 4, 60, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0665", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0231", 1, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0426", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0670", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0793", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0483", 2, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0082", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0377", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0472", 4, 120, List.of(), LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0750", 3, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0029", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0273", 1, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0535", 4, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0723", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0533", 4, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0837", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0757", 1, 60,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0993", 3, 120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0719", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente(
                "INC-0986", 1, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0309", 1, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0021", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0594", 1, 60, List.of(), LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0859", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0419", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0078", 2, 60, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0962", 1, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente(
                "INC-0987", 1, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0694", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0079", 2, 60, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0503", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente(
                "INC-0601", 3, -30, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0438", 3, -30, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente(
                "INC-0520", 2, 120, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0262", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0363", 2, 0, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0024", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0741", 1, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0495", 4, -120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0173", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0763", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0809", 3, -120, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0224", 3, 15, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0320", 3, -1, List.of(), LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0271", 1, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 50)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0597", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0228", 4, -30, List.of(), LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0402", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0486", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0077", 2, 60, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0311", 2, 0, List.of(), LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0543", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 0)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0482", 2, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente(
                "INC-0824", 3, 0, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0964", 1, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0676", 3, 120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0195", 3, 15, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0931", 2, 60, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente(
                "INC-0583", 4, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0687", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0344", 4, 15,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0840", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0814", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0181", 2, 60, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0790", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0918", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0963", 1, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente(
                "INC-0990", 1, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0598", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0550", 3, -30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0947", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0356", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente(
                "INC-0461", 4, -120, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0872", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0293", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0539", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0850", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0137", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0740", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0009", 4, 120, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0410", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0540", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0121", 2, -120, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0380", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
    }

    private static void bloque8(List<Incidente> datos) {
        datos.add(new Incidente("INC-0004", 2, -120, List.of(), LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0513", 1, 15, List.of(), LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0868", 1, 0, List.of(), LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0216", 4, 60, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0249", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0624", 4, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente(
                "INC-0729", 2, 30, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente(
                "INC-0435", 3, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0690", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0349", 2, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0316", 3, -1, List.of(), LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0645", 3, 0, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0351", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0813", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0209", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0448", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0172", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0139", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0100", 1, 30, List.of(), LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0326", 4, 30, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0901", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0599", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0157", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente(
                "INC-0278", 1, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0265", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0928", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0069", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0769", 2, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0640", 2, 15,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente(
                "INC-0821", 3, 0, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0841", 3, 15,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0722", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0168", 2, 60, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0933", 2, 60, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0692", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0140", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0012", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0656", 3, -120, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0124", 2, -120, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente(
                "INC-0034", 3, 120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente(
                "INC-0033", 3, 120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0664", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente(
                "INC-0147", 3, -120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente(
                "INC-0375", 4, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0013", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0633", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente("INC-0829", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0649", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente(
                "INC-0974", 2, 15, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0246", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0080", 2, 60, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0610", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente(
                "INC-0213", 3, 30, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0067", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0949", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0412", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0394", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0555", 4, 120, List.of(), LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0285", 4, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0074", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0747", 3, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0114", 2, 60, List.of(), LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0530", 1, 0, List.of(), LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0066", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0092", 4, -1, List.of(), LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente(
                "INC-0655", 3, 120, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0005", 2, -120, List.of(), LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0184", 2, 60, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0762", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0003", 2, -120, List.of(), LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente(
                "INC-0215", 3, 30, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0939", 3, -120, List.of(), LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0847", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0559", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente(
                "INC-0279", 1, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0131", 2, 15, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente("INC-0527", 1, 0, List.of(), LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0567", 1, 60, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0831", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0010", 4, 120, List.of(new ServicioAfectado("Servicio-1", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente(
                "INC-0052", 1, -120, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0295", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente(
                "INC-0730", 2, 30, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0167", 2, 60, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0686", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0041", 4, 60, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0016", 1, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
        datos.add(new Incidente("INC-0786", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0755", 4, 60, List.of(), LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0836", 1, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0469", 4, 0, List.of(), LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0921", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0869", 1, 0, List.of(), LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente(
                "INC-0985", 3, -120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0711", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0958", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente(
                "INC-0822", 3, 0, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0353", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0965", 1, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0002", 2, -120, List.of(), LocalDateTime.parse("2026-10-02T11:00:00")));
    }

    private static void bloque9(List<Incidente> datos) {
        datos.add(new Incidente("INC-0808", 3, -120, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente(
                "INC-0237", 3, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0674", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0806", 3, -120, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0043", 4, 60, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente(
                "INC-0031", 3, 120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0340", 2, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0338", 2, 0,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0368", 4, 0, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-05T10:00:00")));
        datos.add(new Incidente("INC-0895", 4, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0089", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0849", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0848", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-04T10:00:00")));
        datos.add(new Incidente("INC-0307", 1, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0929", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0062", 3, -30, List.of(), LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0834", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0440", 3, -30, List.of(new ServicioAfectado("Servicio-1", 50)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0992", 3, 120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0235", 1, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente(
                "INC-0445", 3, 30, List.of(new ServicioAfectado("Servicio-1", 500),
                        new ServicioAfectado("Servicio-2", 50), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0677", 3, 120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-01T07:00:00")));
        datos.add(new Incidente(
                "INC-0371", 4, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0960", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0384", 4, 30, List.of(), LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0879", 1, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0574", 3, 0, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente(
                "INC-0478", 1, -1, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-01T12:00:00")));
        datos.add(new Incidente("INC-0335", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0298", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente(
                "INC-0973", 2, 15, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0450", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0943", 3, 120, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0658", 3, -120, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0798", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0401", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-05T11:00:00")));
        datos.add(new Incidente("INC-0505", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0251", 3, -120,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 500)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0870", 1, 0, List.of(), LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente(
                "INC-0988", 1, 120, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0573", 3, 0, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente(
                "INC-0153", 2, 15, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-05T08:00:00")));
        datos.add(new Incidente("INC-0648", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0669", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0854", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0204", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0619", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T08:00:00")));
        datos.add(new Incidente("INC-0514", 1, 15, List.of(), LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0638", 2, 15,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente(
                "INC-0372", 4, -30, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0589", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente(
                "INC-0727", 2, 30, List.of(new ServicioAfectado("Servicio-1", 0),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 0)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0994", 3, 120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0355", 4, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0577", 1, -120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0586", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0261", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0570", 1, 60, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0037", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-01T08:00:00")));
        datos.add(new Incidente("INC-0156", 4, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-03T10:00:00")));
        datos.add(new Incidente("INC-0991", 3, 120, List.of(new ServicioAfectado("Servicio-1", 0)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0302", 2, 15,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 100), new ServicioAfectado("Servicio-4", 10)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0198", 3, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0542", 4, 0,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 0)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0561", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0127", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-05T12:00:00")));
        datos.add(new Incidente("INC-0715", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 100), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-04T12:00:00")));
        datos.add(new Incidente("INC-0291", 4, 60,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-04T11:00:00")));
        datos.add(new Incidente("INC-0057", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente("INC-0424", 4, 120, List.of(), LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0696", 3, 60,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0245", 3, 0,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0904", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente("INC-0397", 1, -30,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-04T07:00:00")));
        datos.add(new Incidente("INC-0025", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0263", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 10),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0925", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 100)),
                LocalDateTime.parse("2026-10-05T09:00:00")));
        datos.add(new Incidente("INC-0903", 2, -120,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 500),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-02T08:00:00")));
        datos.add(new Incidente(
                "INC-0900", 4, 30, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 0), new ServicioAfectado("Servicio-3", 100)),
                LocalDateTime.parse("2026-10-02T10:00:00")));
        datos.add(new Incidente("INC-0942", 3, 120, List.of(), LocalDateTime.parse("2026-10-04T08:00:00")));
        datos.add(new Incidente("INC-0313", 2, 0, List.of(), LocalDateTime.parse("2026-10-01T09:00:00")));
        datos.add(new Incidente("INC-0085", 2, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0819", 4, 60, List.of(), LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente(
                "INC-0972", 2, 15, List.of(new ServicioAfectado("Servicio-1", 50),
                        new ServicioAfectado("Servicio-2", 100), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0587", 1, 120,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 100),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 50),
                        new ServicioAfectado("Servicio-5", 50)),
                LocalDateTime.parse("2026-10-02T11:00:00")));
        datos.add(new Incidente("INC-0627", 3, 30, List.of(new ServicioAfectado("Servicio-1", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0915", 1, 60, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T11:00:00")));
        datos.add(new Incidente("INC-0026", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0203", 4, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 50)),
                LocalDateTime.parse("2026-10-02T12:00:00")));
        datos.add(new Incidente("INC-0056", 2, 120,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 100)),
                LocalDateTime.parse("2026-10-03T11:00:00")));
        datos.add(new Incidente(
                "INC-0179", 4, 15, List.of(new ServicioAfectado("Servicio-1", 10),
                        new ServicioAfectado("Servicio-2", 10), new ServicioAfectado("Servicio-3", 10)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0937", 3, -120, List.of(), LocalDateTime.parse("2026-10-05T07:00:00")));
        datos.add(new Incidente(
                "INC-0266", 1, -120, List.of(new ServicioAfectado("Servicio-1", 100),
                        new ServicioAfectado("Servicio-2", 500), new ServicioAfectado("Servicio-3", 50)),
                LocalDateTime.parse("2026-10-02T09:00:00")));
        datos.add(new Incidente("INC-0234", 1, -1,
                List.of(new ServicioAfectado("Servicio-1", 500), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 10), new ServicioAfectado("Servicio-4", 100),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-03T07:00:00")));
        datos.add(new Incidente("INC-0030", 3, -1,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 50), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-02T07:00:00")));
        datos.add(new Incidente("INC-0015", 2, -30,
                List.of(new ServicioAfectado("Servicio-1", 0), new ServicioAfectado("Servicio-2", 500),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0),
                        new ServicioAfectado("Servicio-5", 10)),
                LocalDateTime.parse("2026-10-04T09:00:00")));
        datos.add(new Incidente("INC-0531", 4, -30, List.of(new ServicioAfectado("Servicio-1", 500)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0310", 1, 30,
                List.of(new ServicioAfectado("Servicio-1", 10), new ServicioAfectado("Servicio-2", 50),
                        new ServicioAfectado("Servicio-3", 500), new ServicioAfectado("Servicio-4", 0)),
                LocalDateTime.parse("2026-10-01T10:00:00")));
        datos.add(new Incidente("INC-0720", 3, -30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 500)),
                LocalDateTime.parse("2026-10-03T09:00:00")));
        datos.add(new Incidente("INC-0019", 1, 30,
                List.of(new ServicioAfectado("Servicio-1", 50), new ServicioAfectado("Servicio-2", 0),
                        new ServicioAfectado("Servicio-3", 0), new ServicioAfectado("Servicio-4", 500)),
                LocalDateTime.parse("2026-10-03T12:00:00")));
    }
}
