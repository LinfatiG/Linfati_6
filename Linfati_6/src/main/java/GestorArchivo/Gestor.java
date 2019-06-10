/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorArchivo;

import ContextoProblema.Celular;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author gilio
 */
public class Gestor {

    /**
     *
     * @param nombre
     */
    private ArrayList<Celular> celular = new ArrayList<>();

    public String leerArchivo(String nombre) {

        Path archivo = Paths.get(nombre);
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo.");
        }
        return contenido;
    }

    /**
     *
     * @param texto
     * @return
     */
    public String[] separarTelefonos(String texto) { //Se ingresa un texto y lo separa en un array de string según saltos de línea y comas.
        String[] separacion = texto.split("[\n;]+");
        return separacion;
    }

    /**
     *
     */
    public void agregarArray() {
        String[] infoCelular = separarTelefonos(leerArchivo("celulares.csv"));
        int cant = (infoCelular.length - 2) / 2; //Se obtiene la cantidad de celulares en el archivo csv
        System.out.println("Orden normal");
        System.out.println();

        for (int i = 0; i < cant; i++) {
            int pos = (i + 1) * 2;
            String nombreCelular = infoCelular[pos];
            double tamañoCelular = Double.parseDouble(infoCelular[pos + 1]);
            Celular celTemp = new Celular(nombreCelular, tamañoCelular);

            System.out.println(celTemp.toString());
            celular.add(celTemp);

        }

    }

    /**
     *
     * @param celular
     */
    public void selectionSort(ArrayList<Celular> celular) {

    }

    /**
     *
     * @param celular
     */
    public void insertionSort(ArrayList<Celular> celular) {

    }

    /**
     *
     * @param celular
     */
    public void mergeSort(ArrayList<Celular> celular) {

    }

}
