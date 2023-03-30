package Futbol;

public class Partido {
    String NombreDelEquipoLocal;
    String NombreDelEquipoVisitante;

    //String Descripcion;
    int IdequipoLocal;
    int IdequipoVisitante;
    int GolesLocal;
    int GolesVisitante;

    public String getNombreDelEquipoLocal(){return NombreDelEquipoLocal;
    }
    public void setNombreDelEquipoLocal(String NombreDelEquipoLocal){this.NombreDelEquipoLocal=NombreDelEquipoLocal;}
    public String getNombreDelEquipoVisitante(){return NombreDelEquipoVisitante;
    }
    public void setNombreDelEquipoVisitante(String NombreDelEquipoVisitante){this.NombreDelEquipoVisitante=NombreDelEquipoVisitante;}

    public int getIdequipoLocal(){return IdequipoLocal;}
    public void setIdequipoLocal(int IdequipoLocal){this.IdequipoLocal=IdequipoLocal;}
    public int getIdequipoVisitante(){return IdequipoVisitante;}
    public void setIdequipoVisitante(int IdequipoVisitante){this.IdequipoVisitante=IdequipoVisitante;}
    public int getGolesLocal(){return GolesLocal;}
    public void setGolesLocal(int GolesLocal){this.GolesLocal=GolesLocal;}
    public int getGolesVisitante(){return GolesVisitante;}
    public void setGolesVisitante(int GolesVisitante){this.GolesVisitante=GolesVisitante;}
    public String equipo(){
        return " Equipo "+this.NombreDelEquipoLocal+" id "+this.IdequipoLocal;
    }//era para probar nomas
}
