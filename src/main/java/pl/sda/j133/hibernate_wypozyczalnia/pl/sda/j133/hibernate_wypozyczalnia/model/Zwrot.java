package pl.sda.j133.hibernate_wypozyczalnia.pl.sda.j133.hibernate_wypozyczalnia.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Zwrot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String notatka;
    private LocalDateTime dataZwrotu;

    @OneToMany(mappedBy = "zwrot")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Wypozyczenie> wypozyczenia;

    @OneToOne
    @EqualsAndHashCode.Exclude
    private Klient klientY;



}

