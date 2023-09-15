package com.example.app;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class EchoForm implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty
    @Size(max = 10)
    private String text;

}