package ma.enset.hopital.repository;

import jdk.jfr.Registered;
import ma.enset.hopital.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
