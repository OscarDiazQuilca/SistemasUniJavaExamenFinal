/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Fecha;
import model.Persona;
import model.Alumno;
import model.Curso;
import model.CursoAperturado;
import model.Docente;
import model.Matricula;

public class Test {

    public static void main(String[] args) {

        Fecha f1 = new Fecha(26, 1, 2025, 3, 48, 55);
        System.out.println(f1);

        Persona p1 = new Persona("75972621", "Oscar Andres Diaz Quilca", 2000, "odiazquilca@gmail.com");
        System.out.println("************DATOS DE LA PERSONA************\n" + p1);

        Persona p2 = new Persona("55972621", "Veronica Quilca Huamani", 1980, "vquilca@gmail.com");
        System.out.println("************DATOS DE LA PERSONA************\n" + p2);

        Alumno a1 = new Alumno(p1, 2020, true, "909090909");
        System.out.println("************DATOS DEL ALUMNO************\n" + a1);

        Docente d1 = new Docente(p2, 2015, 2000, true, "909090909");
        System.out.println("************DATOS DEL DOCENTE************\n" +d1);

        Curso c1 = new Curso(111, "Java Programacion", true, 2);
        System.out.println("************DATOS DEL CURSO************\n" +c1);

        CursoAperturado ca1 = new CursoAperturado(1001, d1, c1, 2025, 350);
        System.out.println("************DATOS DEL CURSO APERTURADO************\n" +ca1);

        Matricula m1 = new Matricula(ca1, a1, true, 2025);
        System.out.println("************DATOS DE LA MATRICULA************\n" +m1);

    }

}
