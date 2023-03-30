import Futbol.CalculoAux;
import Futbol.Partido;
import Futbol.Pronostico;
import Futbol.Resultado;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException{
        String RutaAMiArchivo="H:\\resultadosmanu.csv";
        String RutaAMiArchivo1="H:\\pronosticosmanu.csv";
        ArrayList<Partido> ArrayPartidosEId = new ArrayList<Partido>();
        ArrayList<CalculoAux> Arraygoles = new ArrayList<CalculoAux>();
        ArrayList<Pronostico> Arraypro = new ArrayList<Pronostico>();
        int cont=0;
        //int aux=0;
        //--------------------------lectura de archivo resultados-----------------------------

        boolean primeraLinea= true ;//si quisiera saltar mas lineas usaria un while(?)
        int i=0;
        for (String unaLinea : Files.readAllLines(Paths.get(RutaAMiArchivo))) {
            if (primeraLinea) {
                primeraLinea = false;
            } else {
                String[] SinComas = unaLinea.split(";");//le saco los ";"

                CalculoAux calc = new CalculoAux();//creo un objeto de la clase CalculoAux
                Partido equi = new Partido();//creo un objeto de la clase Partido
                equi.setNombreDelEquipoLocal(SinComas[0]);//nombre equipo local
                equi.setIdequipoLocal(Integer.parseInt(SinComas[1]));//id equipo local
                equi.setGolesLocal(Integer.parseInt(SinComas[2]));//goles equipo local
                equi.setGolesVisitante(Integer.parseInt(SinComas[3]));//goles euipo visitante
                equi.setNombreDelEquipoVisitante(SinComas[5]);//nombre equipo visitante
                equi.setIdequipoVisitante(Integer.parseInt(SinComas[4]));//id equipo visitante

                ArrayPartidosEId.add(equi);
                Arraygoles.add(calc);

                calc.setGolesA((Integer.parseInt(SinComas[2])));//goles de local
                calc.setGolesB((Integer.parseInt(SinComas[3])));//goles de visitante

            }
        }

        //Imprimimos los elementos del ArrayList
        //imprime los equipos y los id, solo para saber si andaba
        System.out.println("\n... Equipos: e Id: de los partidos de Futbol ...");
        Iterator<Partido> itrPartidos = ArrayPartidosEId.iterator();
        while(itrPartidos.hasNext()) {
            Partido equi = itrPartidos.next();
            System.out.println(
                    equi.getNombreDelEquipoLocal() + " "
                            + equi.getIdequipoLocal() + "----"
                            + equi.getIdequipoVisitante() + " "
                            + equi.getNombreDelEquipoVisitante());
        }

        // Imprimimos los elementos del ArrayList de calculo auxiliar
        System.out.println("\n...Resultados de los equipos locales...");
        Iterator<CalculoAux> itrPartidos1 = Arraygoles.iterator();
        while(itrPartidos1.hasNext()) {
            CalculoAux calc = itrPartidos1.next();
            System.out.println(calc.ResultadoPartido());//muestra los resultados de los partidos
            // con los Enum correspondientes...si el local gano, el visitante perdio
            //si el local perdio, significa q gano el visitante...esto tambien desp lo borrare
        }


        System.out.println("-----------------Leer Pronostico----------------------");
        boolean primeraLineap= true ;//salto primer linea

        for (String unaLineap : Files.readAllLines(Paths.get(RutaAMiArchivo1))) {
            if (primeraLineap) {primeraLineap = false;}
            else {
                String[] SinComasp = unaLineap.split(";");//le saco los ";"
                System.out.println("aaaaaaaaveeeerrrrr"+SinComasp[2]);  //"verifico donde esta la X nomas" despues lo borrare
                                                                        // -->en[2]=local,en[3]=empate y en [4]=visitante

                Pronostico pro = new Pronostico();//creo un objeto de la clase Pronostico
                pro.setNombreDelEquipoLocalp(SinComasp[0]);//nombre del equipo local
                pro.setIdequipoLocalp(Integer.parseInt(SinComasp[1]));//ID del equipo local
                pro.setNombreDelEquipoVisitantep(SinComasp[6]);//nombre del equipo visitante
                pro.setIdequipoVisitantep(Integer.parseInt(SinComasp[5]));//id del equipo visitante
                pro.setLocal(SinComasp[2]);//si la X esta aca, eligio local
                pro.setEmpate(SinComasp[3]);//lo mismo pero empate
                pro.setVisita(SinComasp[4]);//lo mismo pero gano el visitante

                Arraypro.add(pro);
            }
        }

        System.out.println("\n...Resultados de los equipos locales...");
        Iterator<Pronostico> itrPartidos2 = Arraypro.iterator();
        while(itrPartidos2.hasNext()) {
            Pronostico pro = itrPartidos2.next();
            System.out.println("Ud pronostico q el equipo local:"+//muestra el pronostico
                                                                    //despues lo borrare tambien
                    pro.Resultadoprono());
       }

        System.out.println("\n...compara...");
        Iterator<CalculoAux> itrPartidos12 = Arraygoles.iterator();
        while(itrPartidos12.hasNext()) {
            CalculoAux calc = itrPartidos12.next();

            Iterator<Pronostico> itrPartidos22 = Arraypro.iterator();
            while(itrPartidos22.hasNext()) {
                Pronostico pro = itrPartidos22.next();

               if(calc.ResultadoPartido().equals(pro.Resultadoprono())){
                   cont++;}
              // else{aux=0;}

            }}

                System.out.println("Ud acerto:............."+cont);


            System.out.println("Fin");

    }}

