/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovildaniela.Automovil1;

import com.mycompany.automovildaniela.clase.Enum.TipoAutomovil;
import com.mycompany.automovildaniela.clase.Enum.TipoColor;
import com.mycompany.automovildaniela.clase.Enum.TipoCombustible;



/**
 *
 * @author PC01
 */
public class Automovil1 {
    public String marca;
    public int modelo;
    public String motor;
    public TipoCombustible tipoCombustible;
    public TipoAutomovil tipoAutomovil;
    public int numeroPuertas;
    public int cantidadAsiento;
    public double velocidadMaxima;
    public TipoColor color;
    public double velocidadActual;

    public Automovil1() {
    }

    public Automovil1(String marca, int modelo, String motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsiento, double velodidadMaxima, TipoColor color, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsiento = cantidadAsiento;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }
      public void acelerar(double incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("Has sobrepasado el limite maximo de velocidad: " + velocidadMaxima + " km/h.");
        } else {
            velocidadActual += incremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
        }
    }

    public void tiempoEstimado() {
        if (velocidadActual > 0) {
            double tiempo = velocidadActual / velocidadActual;
            int horas = (int) tiempo;
            int minutos = (int) ((tiempo - horas) * 60);
            System.out.println("Tiempo estimado de llegada: " + horas + " horas y " + minutos + " minutos.");
        } else {
            System.out.println("El auto esta detenido");
        }
        System.out.println("");
    }

    public void desacelerar(double decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No es posible desacelerar mas");
        } else {
            velocidadActual -= decremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
        }
    }

    public void frenar() {
        if (velocidadActual > 0) {
            System.out.println("Frenando...");
            velocidadActual = 0;
            System.out.println("El automavil se ha detenido. Velocidad actual: " + velocidadActual + " km/h.");
        } else {
            System.out.println("El automovil ya esta detenido.");
        }
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsiento() {
        return cantidadAsiento;
    }

    public void setCantidadAsiento(int cantidadAsiento) {
        this.cantidadAsiento = cantidadAsiento;
    }

    public double getVelodidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelodidadMaxima(double velodidadMaxima) {
        this.velocidadMaxima = velodidadMaxima;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public void mostrarAtributos() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " L");
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Tipo de Automóvil: " + tipoAutomovil);
        System.out.println("Número de Puertas: " + numeroPuertas);
        System.out.println("Cantidad de Asientos: " + cantidadAsiento);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");

}
}
