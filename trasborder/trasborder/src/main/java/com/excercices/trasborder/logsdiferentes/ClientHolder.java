package com.excercices.trasborder.logsdiferentes;

public class ClientHolder {
    public static final ThreadLocal<String> context = new ThreadLocal<>();

    public static void setClientId(String id){
        context.set(id);
    }

    public static String getClientId(){
        return context.get();
    }

    public static void clear(){
        context.remove();
    }
 }
