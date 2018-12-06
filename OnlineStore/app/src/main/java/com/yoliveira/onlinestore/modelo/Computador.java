package com.yoliveira.onlinestore.modelo;

import java.util.UUID;

public class Computador {
    private String uuid;
    private Marca marca;
    private Sistema sistema;
    private Processador cpu;

    private boolean usado;
    private String tipo;
    private int memoriaram;
    private int hd;
    private int ssd;
    private String preco;
    private double nota;

    public Computador(){
        this.uuid= UUID.randomUUID().toString();
    }
    public Computador(String uuid){
        this.uuid=uuid;
    }



    public String getUUID() {
        return uuid;
    }

//    public void setUuid(String uuid) {
//        this.uuid = uuid;
//    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public Processador getCpu() {
        return cpu;
    }

    public void setCpu(Processador cpu) {
        this.cpu = cpu;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMemoriaram() {
        return memoriaram;
    }

    public void setMemoriaram(int memoriaram) {
        this.memoriaram = memoriaram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
