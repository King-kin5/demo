package com.demo.demo.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;
    private String address;
    private int rooms;

    public Apartment(int id,String address, String name, int rooms){
        this.id=id;
        this.address=address;
        this.name=name;
        this.rooms=rooms;

    }
}
