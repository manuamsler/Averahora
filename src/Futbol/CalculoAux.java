package Futbol;

public class CalculoAux {
    int golesA;
    int golesB;

    public int getGolesA() {
        return golesA;
    }

    public void setGolesA(int golesA) {
        this.golesA = golesA;
    }

    public int getGolesB() {
        return golesB;
    }

    public void setGolesB(int golesB) {
        this.golesB = golesB;
    }

    public Enum ResultadoPartido() {//compara los goles de los partidos y devuelve el Enum q corresponde
        if (this.golesA > this.golesB) {
            return Resultado.GANADOR;
        } else if (this.golesA < this.golesB){return Resultado.PERDEDOR;}
        else{return Resultado.EMPATE;}
    }
}
