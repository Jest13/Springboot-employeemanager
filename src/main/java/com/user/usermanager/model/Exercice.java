package com.user.usermanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
    public class Exercice implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(nullable = false, updatable = false)
        private Long id;
        private String name;
        private String description;
        private Long muscle_id;
        private String exemple;
        private String difficuly;
        @OneToMany
        private List<Muscle> muscle;

    @Entity
    static class Muscle {
        @Id
        private Long id;
        private String name;
        private String body_part;
        private String image;
    }
        
        public Exercice() {
        }

}
