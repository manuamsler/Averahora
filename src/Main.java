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
        int aux=0;
        //--------------------------lectura de archivo resultados-----------------------------

        boolean primeraLinea= true ;//si quisiera saltar mas lineas usaria un while(?)
        int i=0;
        for (String unaLinea : Files.readAllLines(Paths.get(RutaAMiArchivo))) {

            if (primeraLinea) {
                primeraLinea = false;
            } else {


                String[] SinComas = unaLinea.split(";");//le saco los ";"

                CalculoAux calc = new CalculoAux();
                Partido equi = new Partido();//creo un objeto de la clase Equipo
                equi.setNombreDelEquipoLocal(SinComas[0]);
                equi.setIdequipoLocal(Integer.parseInt(SinComas[1]));
                equi.setGolesLocal(Integer.parseInt(SinComas[2]));
                equi.setGolesVisitante(Integer.parseInt(SinComas[3]));
                equi.setNombreDelEquipoVisitante(SinComas[5]);
                equi.setIdequipoVisitante(Integer.parseInt(SinComas[4]));


                ArrayPartidosEId.add(equi);
                Arraygoles.add(calc);

                calc.setGolesA((Integer.parseInt(SinComas[2])));
                calc.setGolesB((Integer.parseInt(SinComas[3])));

            }
        }

        //Imprimimos los elementos del ArrayList
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
            System.out.println(
                    calc.ResultadoPartido());



        }
        System.out.println("-----------------Leer Pronostico----------------------");
        boolean primeraLineap= true ;//salto primer linea

        for (String unaLineap : Files.readAllLines(Paths.get(RutaAMiArchivo1))) {

            if (primeraLineap) {
                primeraLineap = false;
            } else {


                String[] SinComasp = unaLineap.split(";");//le saco los ";"
                System.out.println("aaaaaaaaveeeerrrrr"+SinComasp[2]);//en[2]=local,en[3]=empate y en [4]=visitante

                //CalculoAux calc = new CalculoAux();
                Pronostico pro = new Pronostico();//creo un objeto de la clase Equipo
                pro.setNombreDelEquipoLocalp(SinComasp[0]);
                pro.setIdequipoLocalp(Integer.parseInt(SinComasp[1]));
                pro.setNombreDelEquipoVisitantep(SinComasp[6]);
                pro.setIdequipoVisitantep(Integer.parseInt(SinComasp[5]));
                pro.setLocal(SinComasp[2]);
                pro.setEmpate(SinComasp[3]);
                pro.setVisita(SinComasp[4]);

                Arraypro.add(pro);

            }
        }
        System.out.println("\n...Resultados de los equipos locales...");
        Iterator<Pronostico> itrPartidos2 = Arraypro.iterator();
        while(itrPartidos2.hasNext()) {
            Pronostico pro = itrPartidos2.next();
            System.out.println("Ud pronostico q el equipo local:"+
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

