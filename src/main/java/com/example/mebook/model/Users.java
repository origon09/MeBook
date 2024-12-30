package com.example.mebook.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table
public class Users {


    public Users(String name, String school, int followers, int following) {
        this.name = name;
        this.school = school;
        this.followers = followers;
        this.following = following;
    }


    @Id
    @SequenceGenerator(
            name = "users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private Long id;
    private String name;
    private String school;
    private int followers;
    private int following;

    public Users() {

    }

    public Users(Long id, String name, String school, int followers, int following) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.followers = followers;
        this.following = following;
    }
}
