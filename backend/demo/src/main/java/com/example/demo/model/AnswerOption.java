package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "answer_options")
public class AnswerOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_answer_option;

    @Column(nullable = false)
    private Integer id_question;

    @Column(length = 100)
    private String option_name;

    // Getters e Setters
    public Integer getId_answer_option() { return id_answer_option; }
    public void setId_answer_option(Integer id_answer_option) { this.id_answer_option = id_answer_option; }

    public Integer getId_question() { return id_question; }
    public void setId_question(Integer id_question) { this.id_question = id_question; }

    public String getOption_name() { return option_name; }
    public void setOption_name(String option_name) { this.option_name = option_name; }
}
