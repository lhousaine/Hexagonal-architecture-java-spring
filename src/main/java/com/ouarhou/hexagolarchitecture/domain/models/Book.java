package com.ouarhou.hexagolarchitecture.domain.models;

import java.io.Serializable;
import java.util.UUID;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {
    @NotNull
    private UUID id;
    @Size(min = 10, max = 100, message = "Number of characters should be in between 10 and 100 inclusive")
    private String title;
    @Size(min = 10, max = 2000, message = "Number of characters should be in between 10 and 2000 inclusive")
    private String content;
}