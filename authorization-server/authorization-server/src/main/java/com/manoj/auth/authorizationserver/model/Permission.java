package com.manoj.auth.authorizationserver.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "permission")
public class Permission {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;

    public Permission() {
    }

    public Permission(Permission permission) {
        this.name = permission.getName();
    }

}
