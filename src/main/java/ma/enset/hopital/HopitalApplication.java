package ma.enset.hopital;

import ma.enset.hopital.entites.Patient;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("Ayoub");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(24);

        Patient patient2 = new Patient(null, "Mohamed", new Date(), false, 25);

        Patient patient3 = Patient.builder()
                .nom("Simo")
                .dateNaissance(new Date())
                .score(27)
                .malade(true)
                .build();
        patientRepository.save(patient);
        patientRepository.save(patient2);
        patientRepository.save(patient3);


    }
}
