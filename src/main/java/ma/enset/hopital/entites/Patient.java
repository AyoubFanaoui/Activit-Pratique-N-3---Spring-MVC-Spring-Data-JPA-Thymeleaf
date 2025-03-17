package ma.enset.hopital.entites;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.Date;
public class Patient {
    private Long id;
    private String nom;
    private Date dateNaissance;
    private boolean malade;
    private int score;
}
