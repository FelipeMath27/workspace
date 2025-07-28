package com.excercices.trasborder.validadorespais.Application;

import com.excercices.trasborder.validadorespais.Domain.IdentifcationValidator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidatorFactory {
    private final Map<String, IdentifcationValidator> validatorCountry = new HashMap<>();

    public ValidatorFactory(List<IdentifcationValidator> identifcationValidators){
        for (IdentifcationValidator validator: identifcationValidators){
            validatorCountry.put(validator.getCountry(),validator);
        }
    }

    public IdentifcationValidator getValidator(String codCountry){
        return validatorCountry.get(codCountry);
    }

}

