package pl.sda.j133.hibernate_wypozyczalnia.pl.sda.j133.hibernate_wypozyczalnia.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Wypozyczenie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDate dataWypozyczenia;
    private String numerUmowy;

    @CreationTimestamp
    private LocalDate datPlanowanegoZwrotu;

    private Double cenaWynajmu;

    @OneToMany
    @EqualsAndHashCode.Exclude
    private Samochod samochod;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    private Samochod samochodX;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    private  Klient klientY;

    @OneToMany(mappedBy = "wypozyczenie")
    @EqualsAndHashCode.Exclude
    private Zwrot zwrot;
}

