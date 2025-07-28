package com.excercices.trasborder.validadorespais.Domain;

public class ColombiaValidator implements IdentifcationValidator{

    @Override
    public boolean isValid(String identification) {
        return identification != null && identification.matches("\\d{9}-\\d")
    }

    @Override
    public String getCountry() {
        return "CO";
    }
}
