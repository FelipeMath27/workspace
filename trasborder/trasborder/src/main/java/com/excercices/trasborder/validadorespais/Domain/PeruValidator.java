package com.excercices.trasborder.validadorespais.Domain;

public class PeruValidator implements IdentifcationValidator{

    @Override
    public boolean isValid(String identification) {
        return identification != null && identification.matches("\\d{11}");
    }

    @Override
    public String getCountry() {
        return "PE";
    }
}
