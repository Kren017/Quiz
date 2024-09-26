package com.mycompany.marioclases;

public class Mario {
   
    private String nombre;
    private int vidas;
    private int movimiento; 
    private int salto; 
    private int dañoSalto;  

    public Mario(String nombre, int vidas, int dañoSalto) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.movimiento = 0; 
        this.salto = 0;    
        this.dañoSalto = dañoSalto; 
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }

    public int getDañoSalto() {
        return dañoSalto;
    }

    public void desplazamientoMario() {
        if (movimiento == 1) {
            System.out.println(nombre + " se está moviendo a la derecha.");
        } else if (movimiento == -1) {
            System.out.println(nombre + " se está moviendo a la izquierda.");
        } else {
            System.out.println(nombre + " no se está moviendo.");
        }
    }

    public void saltar() {
        if (salto == 1) {
            System.out.println(nombre + " está saltando y causa " + dañoSalto + " de daño.");
        } else {
            System.out.println(nombre + " no está saltando.");
        }
    }

    public void perderVida() {
        if (vidas > 0) {
            vidas--;
            System.out.println(nombre + " Vidas restantes: " + vidas);
            if (vidas == 0) {
                System.out.println(nombre + " Se acabó");
            }
        }
    } 
}


