package fr.donovan.carculturquiz.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private Long id;
    private String username;
    private String password;

}
