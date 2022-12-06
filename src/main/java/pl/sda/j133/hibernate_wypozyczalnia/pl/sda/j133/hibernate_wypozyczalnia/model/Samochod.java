package pl.sda.j133.hibernate_wypozyczalnia.pl.sda.j133.hibernate_wypozyczalnia.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Samochod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nrRej;
    private String marka;
    private String model;
    private int iloscMiejsc;

    @OneToMany(mappedBy = "samochod")
    @EqualsAndHashCode.Exclude
    private Set<Wypozyczenie> wypozyczenia;

    @OneToMany
    @EqualsAndHashCode.Exclude
    private Klient klientY;

    @OneToMany
    @EqualsAndHashCode.Exclude
    private Zwrot zwrot;
}
