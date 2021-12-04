package app.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Long id;

    @NotNull
    @Column(name = "username", nullable = false)
    public String username;

    @NotNull
    @Column(name = "email", nullable = false)
    public String email;
}
