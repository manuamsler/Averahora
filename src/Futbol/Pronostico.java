package Futbol;

public class Pronostico {
    String NombreDelEquipoLocalp;
    String NombreDelEquipoVisitantep;

    //String Descripcion;
    int IdequipoLocalp;
    int IdequipoVisitantep;
        String Local;
    String Empate;
    String Visita;

    public String getNombreDelEquipoLocalp(){return NombreDelEquipoLocalp;
    }
    public void setNombreDelEquipoLocalp(String NombreDelEquipoLocalp){this.NombreDelEquipoLocalp=NombreDelEquipoLocalp;}
    public String getNombreDelEquipoVisitante(){return NombreDelEquipoVisitantep;
    }
    public void setNombreDelEquipoVisitantep(String NombreDelEquipoVisitantep){this.NombreDelEquipoVisitantep=NombreDelEquipoVisitantep;}

    public int getIdequipoLocalp(){return IdequipoLocalp;}
    public void setIdequipoLocalp(int IdequipoLocalp){this.IdequipoLocalp=IdequipoLocalp;}
    public int getIdequipoVisitantep(){return IdequipoVisitantep;}
    public void setIdequipoVisitantep(int IdequipoVisitantep){this.IdequipoVisitantep=IdequipoVisitantep;}
    public String getLocal(){return Local;}
    public void setLocal(String Local){this.Local=Local;}
    public String getEmpate(){return Empate;}
    public void setEmpate(String Empate){this.Empate=Empate;}
    public String getVisita(){return Visita;}
    public void setVisita(String Visita){this.Visita=Visita;}
    public Enum Resultadoprono() {

        if (this.Local.equals("X")) {return Resultado.GANADOR;}
        if (this.Empate.equals("X")){return Resultado.EMPATE;}
        else {return Resultado.PERDEDOR;}
}}
