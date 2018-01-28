package RentHome.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "house")
public class House {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numberOfTenant")
    private int numberOfTenant;

    @Column(name = "smoker")
    private boolean smoker;

    @Column(name = "pet")
    private String pet;

    @Column(name = "size")
    private double size;

    @Column(name = "location")
    private String location;

    @Column(name = "priceRange")
    private String priceRange;

    @Column(name = "accessories")
    private String accessories;
}
