package it.danilodellorco.cocktail.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Country {
    @PrimaryKey (autoGenerate = true)
    public int _id;
    @ColumnInfo(name="Paese")
    public String Paese;
    @ColumnInfo(name="Capitale")
    public String Capitale;
    @ColumnInfo(name="Continente")
    public String Continente;
    @ColumnInfo(name="Popolazione")
    public String Popolazione;
    @ColumnInfo(name="Superficie")
    public String Superficie;
    @ColumnInfo(name="Indipendenza")
    public String Indipendenza;
    @ColumnInfo(name="Valuta")
    public String Valuta;
    @ColumnInfo(name="Codice")
    public String Codice;
    @ColumnInfo(name="Prefisso")
    public String Prefisso;
    @ColumnInfo(name="TLD")
    public String TLD;


}

