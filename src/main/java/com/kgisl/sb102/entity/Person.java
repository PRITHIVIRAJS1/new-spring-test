package com.kgisl.sb102.entity;

import org.springframework.data.annotation.Id;

public record Person(@Id Long id, String uname, String email) {
}