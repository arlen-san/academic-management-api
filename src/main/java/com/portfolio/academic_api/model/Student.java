package com.portfolio.academic_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= "tb_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório e não pode ficar em branco.")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "O e-mail é obrigatório.")
    @Email(message = "Formato de e-mail inválido.")
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = "A matrícula é obrigatória.")
    @Column(nullable = false, unique = true)
    private String enrollmentNumber; // Número de matrícula

    // Construtor vazio (Obrigatório para a biblioteca do banco de dados funcionar)
    public Student() {
    }

    // Construtor com parâmetros
    public Student(Long id, String name, String email, String enrollmentNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enrollmentNumber = enrollmentNumber;
    }

    // Getters e Setters (Como os atributos são 'private', precisamos deles para ler e alterar os dados)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }
}
