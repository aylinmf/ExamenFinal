package com.example.examenfinal.configuracion;

public class foto {

    //Nombre de la base de datos
    public static final String NAME_DATABASE = "DBase";

    //Creacion de la tabla persona en la base de datos
    public static final String TABLA_MEDICAMENTO = "medicamentos";

    //Creacion de los atributos de la tabla
    public static final String ID = "id";
    public static final String DESCRIPCION = "descripcion";
    public static final String CANTIDAD = "cantidad";
    public static final String TIEMPO = "tiempo";
    public static final String REPROCIDAD = "reprocidad";
    public static final String IMAGEN = "imagen";


    //Creacion y eliminacion de la tabla

    public static final String CREATE_TABLE_MEDICAMENTO = "CREATE TABLE " + TABLA_MEDICAMENTO +
            "("+
            ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            DESCRIPCION +" TEXT, "+
            CANTIDAD +" TEXT, "+
            TIEMPO +" TEXT, "+
            REPROCIDAD +" TEXT, "+
            IMAGEN +" TEXT"+
            ")";
    public static final String DROP_TABLE_MEDICAMENTO = "DROP TABLE IF EXIST " + TABLA_MEDICAMENTO;

    //Seleccionar todas las personas
    public static final String SELECT_TABLE_MEDICAMENTO = "SELECT * FROM " + TABLA_MEDICAMENTO;



}
