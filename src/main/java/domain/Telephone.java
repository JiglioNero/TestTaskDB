package domain;

import javax.persistence.*;

@Table(name="telephones")
@Entity
public class Telephone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String number;
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employees_id")
    private Employee employee;



}
