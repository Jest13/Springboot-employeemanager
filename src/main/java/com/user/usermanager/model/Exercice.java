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
        @OneToMany
        private List<Userprograms> userprograms;

        @Entity
        static class Userprograms {
            private Long id;
            private String program_id;
            private String user_id;

        }

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

    public Exercice(String name, String description, Long muscle_id, String exemple, String difficuly, List<Muscle> muscle, List<Userprograms> userprograms) {
        this.name = name;
        this.description = description;
        this.muscle_id = muscle_id;
        this.exemple = exemple;
        this.difficuly = difficuly;
        this.muscle = muscle;
        this.userprograms = userprograms;
    }



}
