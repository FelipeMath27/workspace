package com.excercices.trasborder.validadorespais.Infrastructure;

import com.excercices.trasborder.validadorespais.Application.ValidatorFactory;
import com.excercices.trasborder.validadorespais.Domain.IdentifcationValidator;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ValidatorFactory validatorFactory;

    public ClientService(ValidatorFactory validatorFactory) {
        this.validatorFactory = validatorFactory;
    }

    public boolean vaidateIdentification (String country, String identification){
        IdentifcationValidator identifcationValidator = validatorFactory.getValidator(country);
        if (identification == null){
            throw new IllegalArgumentException("This country is not support" + country);
        }
        return identifcationValidator.isValid(identification);
    }
}
