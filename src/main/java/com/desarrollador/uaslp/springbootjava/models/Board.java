package com.desarrollador.uaslp.springbootjava.models;

import org.apache.catalina.User;

import javax.persistence.*;
import javax.persistence.Column;

@Entity
@Table(name = "boards")

public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 300)
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Board board = (Board) object;
        return id == board.id &&
                java.util.Objects.equals(name, board.name);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id, name);
    }
}
