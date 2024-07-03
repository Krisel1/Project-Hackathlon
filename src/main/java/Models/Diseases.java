package Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Diseases")
public class Diseases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;

    public Diseases() {
    }

    public Diseases(String name, String description) {
        this.name = name;
        this.description = description;
    }

}

