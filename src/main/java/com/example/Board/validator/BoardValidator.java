package com.example.Board.validator;

import com.example.Board.model.Board;
import org.springframework.stereotype.Component;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.thymeleaf.util.StringUtils;

@Component
public class BoardValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Board.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Board b = (Board) target;
        if(StringUtils.isEmpty(b.getContent())) {
            errors.rejectValue("content", "key", "Enter content.");
        }
    }
}
