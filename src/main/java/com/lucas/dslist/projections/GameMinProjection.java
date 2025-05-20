package com.lucas.dslist.projections;

public interface GameMinProjection {

    // Métodos GET correspondentes a consulta SQL

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
