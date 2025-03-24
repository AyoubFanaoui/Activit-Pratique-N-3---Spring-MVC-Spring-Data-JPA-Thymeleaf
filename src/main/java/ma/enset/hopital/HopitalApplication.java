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



        patientRepository.save(new Patient(null, "Ayoub", new Date(), false, 25));
        patientRepository.save(new Patient(null, "Mohamed", new Date(), false, 22));
        patientRepository.save(new Patient(null, "Imane", new Date(), false, 26));


    }
}
