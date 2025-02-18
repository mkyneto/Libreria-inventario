//Nueva version 

/*
Has buscado alguna vez un hotel en
internet?
Has visto la cantidad de precios que hay para la mismahabitación?
Trivago te ayuda a comparar el precio de mas de 
700,000 hoteles
en mas de 175 paginas web, en vez de perder tiempo y dinero
trivago te lo hace facil para que encuentres tu hotel ideal
al mejor precio.
Solo entra a trivago.com
Hotel...Trivago
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pojo.Biblioteca;


class Main {
  public static final String separator = ",";
  List<Biblioteca> listBiblioteca;
  private List<Biblioteca> csvRead(){
    BufferedReader bufferReader = null;
    try {
      bufferReader = new BufferedReader(new FileReader("csv/inventario.csv"));
      String line = bufferReader.readLine();
      listBiblioteca = new ArrayList<Biblioteca>();
      while (line != null) {
        String[] campos = line.split(separator);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setTitulo(campos[0]);
        biblioteca.setAutor(campos[1]);
        biblioteca.setAnio(campos[2]);
        biblioteca.setEstante_numero(campos[3]);
        biblioteca.setEstante_seccion(campos[4]);
        biblioteca.setPiso(campos[5]);
        biblioteca.setEdificio(campos[6]);
        biblioteca.setSede(campos[7]);
        listBiblioteca.add(biblioteca);    
          line = bufferReader.readLine(); 
      }
      return listBiblioteca;
    } 
    catch (IOException e) {
      e.printStackTrace();
    } 
    finally {
      if (bufferReader != null) {
        try {
          bufferReader.close();
        } 
        catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return null;
  }
  public static void main(String[] args) {
    Main app = new Main();
    List<Biblioteca> bibliotecas = app.csvRead();
    int opcion = 0;
    while(opcion != 10){
      System.out.println("... Bienvenidos al Manu ...");
      System.out.println("Elije una opcion");
      System.out.println("1. Visualizacion de datos");
      System.out.println("2. Edicion de datos");
      System.out.println("3. Eliminacion de datos");
      System.out.println("4. Agregar nuevos datos ");
      System.out.println("5. Salir sin guardar");
      System.out.println("6. Salir");
      System.out.println("Ingrese una opcion: ");
      opcion = Integer.parseInt(System.console().readLine());
      switch(opcion){
//---------------------------------------------------------------------------------------------------------------------
        case 1:
          System.out.println("Elija modo de visualizacion");
          System.out.println("1. Toda la data");
          System.out.println("2. Buscar por titulo");
          System.out.println("3. Volver al menu anterior");
          System.out.println("Ingrese una opcion: ");
          //_____________________________________________________
          int opcion1=0;
          opcion1 = Integer.parseInt(System.console().readLine());
          switch(opcion1){
          case 1:
          Iterator<Biblioteca> it = bibliotecas.iterator();
          while(it.hasNext()) {
            Biblioteca biblioteca = it.next();
            System.out.println("..........................." + "\n" +"Titulo: " + biblioteca.getTitulo() + "\n" +"Autor: " + biblioteca.getAutor()+ "\n" + "Año: " +biblioteca.getAnio()+ "\n" + "Estante Numero: " + biblioteca.getEstante_numero()+ "\n"  + "Seccion: "+biblioteca.getEstante_seccion()+ "\n" +"Piso: "+biblioteca.getPiso()+ "\n" +"Edificio: " + biblioteca.getEdificio()+ "\n" +"Sede: " +biblioteca.getSede() );
          }
          break;

          case 2:
      Iterator<Biblioteca> it2 = bibliotecas.iterator();
      System.out.println("Ingrese el titulo a buscar: ");
      String titulo = System.console().readLine();
      System.out.println(titulo);
        while(it2.hasNext()){
            Biblioteca biblioteca = it2.next();
            if(biblioteca.getTitulo().equals(titulo)){
            System.out.println("..........................." + "\n" +"Titulo: " + biblioteca.getTitulo() + "\n" +"Autor: " + biblioteca.getAutor()+ "\n" + "Año: " +biblioteca.getAnio()+ "\n" + "Estante Numero: " + biblioteca.getEstante_numero()+ "\n"  + "Seccion: "+biblioteca.getEstante_seccion()+ "\n" +"Piso: "+biblioteca.getPiso()+ "\n" +"Edificio: " + biblioteca.getEdificio()+ "\n" +"Sede: " +biblioteca.getSede()+ "\n" +"..........................." + "\n"  );
            break;
            }
          if(it2.hasNext()== false){
            System.out.println("......................................." );
            System.out.println("No disponemos de esa datas");
            System.out.println("......................................." );
            break;
            }
        }
          break;
        case 3:
        System.out.println("......................................." );
        System.out.println("Saliendo...");
        System.out.println("......................................." );
              break;
        default:
        System.out.println("......................................." );
        System.out.println("Opcion no valida");
        System.out.println("......................................." );
          break;
        }
          break;
//---------------------------------------------------------------------------------------------------------------------
        case 2://_____________________________________________
        System.out.println("Modo de Edicion");
        System.out.println("Elija modo de Edicion");
        System.out.println("1. Editar libro");
        System.out.println("2. Editar sede");
        System.out.println("3. Editar seccion");
        System.out.println("4. Editar edificio");
        System.out.println("5. Editar  piso");
        System.out.println("6. Volver al menu anterior");
        System.out.println("Ingrese una opcion: ");
        //_____________________________________________________
        int opcion44=0;
        opcion44 = Integer.parseInt(System.console().readLine());
        switch(opcion44){
        case 1:
        Iterator<Biblioteca> it4_22 = bibliotecas.iterator();
        System.out.println("Ingrese el titulo Modificar: ");
        String titulo_jj = System.console().readLine();
          while(it4_22.hasNext()){
              Biblioteca biblioteca = it4_22.next();
              if(biblioteca.getTitulo().equals(titulo_jj)){
                System.out.println("Ingrese el nuevo titulo: ");
                String titulo_jj2 = System.console().readLine();
                biblioteca.setTitulo(titulo_jj2);
                System.out.println("..........................." + "\n" +"Titulo: " + biblioteca.getTitulo() + "\n" +"Autor: " + biblioteca.getAutor()+ "\n" + "Año: " +biblioteca.getAnio()+ "\n" + "Estante Numero: " + biblioteca.getEstante_numero()+ "\n"  + "Seccion: "+biblioteca.getEstante_seccion()+ "\n" +"Piso: "+biblioteca.getPiso()+ "\n" +"Edificio: " + biblioteca.getEdificio()+ "\n" +"Sede: " +biblioteca.getSede()+ "\n" +"..........................." + "\n"  );
                break;
              }
            if(it4_22.hasNext()== false){
              System.out.println("......................................." );
              System.out.println("Titulo No encontrado" );
              System.out.println("......................................." );
              break;
              }
          }
          break;
        case 2:
        Iterator<Biblioteca> it4_33 = bibliotecas.iterator();
        System.out.println("Ingrese el titulo a Modificar: ");
        String titulo_jj3 = System.console().readLine();
          while(it4_33.hasNext()){
              Biblioteca biblioteca = it4_33.next();
              if(biblioteca.getTitulo().equals(titulo_jj3)){
                System.out.println("Ingrese la nueva sede: ");
                String sede_jj2 = System.console().readLine();
                biblioteca.setSede(sede_jj2);
                System.out.println("..........................." + "\n" +"Titulo: " + biblioteca.getTitulo() + "\n" +"Autor: " + biblioteca.getAutor()+ "\n" + "Año: " +biblioteca.getAnio()+ "\n" + "Estante Numero: " + biblioteca.getEstante_numero()+ "\n"  + "Seccion: "+biblioteca.getEstante_seccion()+ "\n" +"Piso: "+biblioteca.getPiso()+ "\n" +"Edificio: " + biblioteca.getEdificio()+ "\n" +"Sede: " +biblioteca.getSede()+ "\n" +"..........................." + "\n"  );
                break;
              }
            if(it4_33.hasNext()== false){
              System.out.println("......................................." );
              System.out.println("Titulo No encontrado" );
              System.out.println("......................................." );
              break;
              }
          }
          break;
        case 3:
        Iterator<Biblioteca> it4_44 = bibliotecas.iterator();
        System.out.println("Ingrese el titulo a Modificar: ");
        String titulo_jj4 = System.console().readLine();
          while(it4_44.hasNext()){
              Biblioteca biblioteca = it4_44.next();
              if(biblioteca.getTitulo().equals(titulo_jj4)){
                System.out.println("Ingrese la nueva seccion: ");
                String seccion_jj2 = System.console().readLine();
                biblioteca.setEstante_seccion(seccion_jj2);
                System.out.println("..........................." + "\n" +"Titulo: " + biblioteca.getTitulo() + "\n" +"Autor: " + biblioteca.getAutor()+ "\n" + "Año: " +biblioteca.getAnio()+ "\n" + "Estante Numero: " + biblioteca.getEstante_numero()+ "\n"  + "Seccion: "+biblioteca.getEstante_seccion()+ "\n" +"Piso: "+biblioteca.getPiso()+ "\n" +"Edificio: " + biblioteca.getEdificio()+ "\n" +"Sede: " +biblioteca.getSede()+ "\n" +"..........................." + "\n"  );
                break;
              }
            if(it4_44.hasNext()== false){
              System.out.println("......................................." );
              System.out.println("Titulo No encontrado" );
              System.out.println("......................................." );
              break;
              }
          }
          break;
        case 4:
        Iterator<Biblioteca> it4_55 = bibliotecas.iterator();
        System.out.println("Ingrese el titulo a Modificar: ");
        String titulo_jj5 = System.console().readLine();
          while(it4_55.hasNext()){
              Biblioteca biblioteca = it4_55.next();
              if(biblioteca.getTitulo().equals(titulo_jj5)){
                System.out.println("Ingrese la nueva edificio: ");
                String edificio_jj2 = System.console().readLine();
                biblioteca.setEdificio(edificio_jj2);
                System.out.println("..........................." + "\n" +"Titulo: " + biblioteca.getTitulo() + "\n" +"Autor: " + biblioteca.getAutor()+ "\n" + "Año: " +biblioteca.getAnio()+ "\n" + "Estante Numero: " + biblioteca.getEstante_numero()+ "\n"  + "Seccion: "+biblioteca.getEstante_seccion()+ "\n" +"Piso: "+biblioteca.getPiso()+ "\n" +"Edificio: " + biblioteca.getEdificio()+ "\n" +"Sede: " +biblioteca.getSede()+ "\n" +"..........................." + "\n"  );
                break;
              }
            if(it4_55.hasNext()== false){
              System.out.println("......................................." );
              System.out.println("Titulo No encontrado" );
              System.out.println("......................................." );
              break;
              }
          }
          break;
        case 5:
        Iterator<Biblioteca> it4_66 = bibliotecas.iterator();
        System.out.println("Ingrese el titulo a Modificar: ");
        String titulo_jj6 = System.console().readLine();
          while(it4_66.hasNext()){
              Biblioteca biblioteca = it4_66.next();
              if(biblioteca.getTitulo().equals(titulo_jj6)){
                System.out.println("Ingrese la nueva piso: ");
                String piso_jj2 = System.console().readLine();
                biblioteca.setPiso(piso_jj2);
                System.out.println("..........................." + "\n" +"Titulo: " + biblioteca.getTitulo() + "\n" +"Autor: " + biblioteca.getAutor()+ "\n" + "Año: " +biblioteca.getAnio()+ "\n" + "Estante Numero: " + biblioteca.getEstante_numero()+ "\n"  + "Seccion: "+biblioteca.getEstante_seccion()+ "\n" +"Piso: "+biblioteca.getPiso()+ "\n" +"Edificio: " + biblioteca.getEdificio()+ "\n" +"Sede: " +biblioteca.getSede()+ "\n" +"..........................." + "\n"  );
                break;
              }
            if(it4_66.hasNext()== false){
              System.out.println("......................................." );
              System.out.println("Titulo No encontrado" );
              System.out.println("......................................." );
              break;
              }
          }
          break;
          case 6:
          System.out.println("......................................." );
          System.out.println("Volver al menu anterior");
          System.out.println("......................................." );
          break;
  
          default:
          System.out.println("......................................." );
          System.out.println("Opcion no valida");
          System.out.println("......................................." );
        }
            break;
//---------------------------------------------------------------------------------------------------------------------
          
          case 3://_____________________________________________
          System.out.println("Elija modo de Eliminacion");
          System.out.println("1. Eliminar libro");
          System.out.println("2. Eliminar sede");
          System.out.println("3. Eliminar seccion");
          System.out.println("4. Eliminar  piso");
          System.out.println("5. Volver al menu anterior");
          System.out.println("Ingrese una opcion: ");
          //_____________________________________________________
          int opcion4=0;
          opcion4 = Integer.parseInt(System.console().readLine());
          switch(opcion4){
          case 1:
          System.out.println("Ingrese el titulo a eliminar: ");
          String titulo_e = System.console().readLine();
          Iterator<Biblioteca> it4 = bibliotecas.iterator();
          while(it4.hasNext()){
              Biblioteca biblioteca = it4.next();
              if(biblioteca.getTitulo().equals(titulo_e)){
                      biblioteca.setTitulo("empty");
                      biblioteca.setAutor("empty");
                      biblioteca.setAnio("empty");
                      biblioteca.setEstante_numero("empty");
                      biblioteca.setEstante_seccion("empty");
                      biblioteca.setPiso("empty");
                      biblioteca.setEdificio("empty");
                      biblioteca.setSede("empty");
                      System.out.println("Tu libro ha sido eliminado");
              break;
              }
            if(it4.hasNext()== false){
              System.out.println("......................................." );
              System.out.println("No disponemos de esa datas de sede");
              System.out.println("......................................." );
              break;
              }
          }
          break;
          case 2:
          System.out.println("Ingrese la sede a eliminar: ");
          String sede = System.console().readLine();
          Iterator<Biblioteca> it5 = bibliotecas.iterator();
          while(it5.hasNext()){
          Biblioteca biblioteca = it5.next(); 
            if(biblioteca.getTitulo()!="empty" && biblioteca.getSede().equals(sede) ){
              System.out.println("......................................." );
              System.out.println("Aun existen libros en esta seccion");
              System.out.println("......................................." );
              break;
            } 
            if (biblioteca.getTitulo().equals("empty") && biblioteca.getSede().equals(sede)){
                    biblioteca.setSede("empty");
                    System.out.println("Tu sede ha sido eliminada");
                    break;          
            } else if(it5.hasNext()== false){
                    System.out.println("......................................." );
                    System.out.println("No disponemos de esa datas");
                    System.out.println("......................................." );
                    break;
                }        
        }
          break;
          case 3:
          System.out.println("Ingrese la seccion a eliminar: ");
          String seccionn = System.console().readLine();
          Iterator<Biblioteca> it6 = bibliotecas.iterator();
          while(it6.hasNext()){
              Biblioteca biblioteca = it6.next();
              if(biblioteca.getEstante_seccion().equals(seccionn) && biblioteca.getTitulo()!="empty"){
                System.out.println("......................................." );
                System.out.println("Aun existen libros en esta seccion");
                System.out.println("......................................." );
                break;
              }
            if (biblioteca.getTitulo().equals("empty") && biblioteca.getEstante_seccion().equals(seccionn)){
                    biblioteca.setEstante_seccion("empty");
                    System.out.println("Tu seccion ha sido eliminada");
                    break;
            } else if(it6.hasNext()== false){
                    System.out.println("......................................." );
                    System.out.println("No disponemos de esa datas");
                    System.out.println("......................................." );
                    break;
                }
        }
          break;
          case 4:
          System.out.println("Ingrese el piso a eliminar: ");
          String pisoo = System.console().readLine();
          Iterator<Biblioteca> it7 = bibliotecas.iterator();
          while(it7.hasNext()){
              Biblioteca biblioteca = it7.next();
              if(biblioteca.getPiso().equals(pisoo) && biblioteca.getTitulo()!="empty"){
                System.out.println("......................................." );
                System.out.println("Aun existen libros en esta seccion");
                System.out.println("......................................." );
                break;
              }
            if (biblioteca.getTitulo().equals("empty") && biblioteca.getPiso().equals(pisoo)){
                    biblioteca.setPiso("empty");
                    System.out.println("Tu piso ha sido eliminado");
                    break;
            } else if(it7.hasNext()== false){
                    System.out.println("......................................." );
                    System.out.println("No disponemos de esa datas");
                    System.out.println("......................................." );
                    break;
                }
        }
          break;
          case 5:
          System.out.println("......................................." );
          System.out.println("Volver al menu anterior");
          System.out.println("......................................." );
          break;
  
          default:
          System.out.println("......................................." );
          System.out.println("Opcion no valida");
          System.out.println("......................................." );
        }
            break;

//---------------------------------------------------------------------------------------------------------------------
        case 4://_____________________________________________
            System.out.println("Elija modo de Agregar dato");
            System.out.println("1. Agregar nuevo libro");
            System.out.println("2. Agregar nueva sede");
            System.out.println("3. Agregar nueva seccion");
            System.out.println("4. Agregar nuevo piso");
            System.out.println("5. Volver al menu anterior");
            System.out.println("Ingrese una opcion: ");
            //_____________________________________________________
            int opcion2=0;
            opcion2 = Integer.parseInt(System.console().readLine());
            switch(opcion2){
            case 1:
            Iterator<Biblioteca> it4_2 = bibliotecas.iterator();
            System.out.println("Ingrese el titulo a Ingresar: ");
            String titulo_j = System.console().readLine();
              while(it4_2.hasNext()){
                  Biblioteca biblioteca = it4_2.next();
                  if(biblioteca.getTitulo().equals(titulo_j)){
                  System.out.println("......................................." );
                  System.out.println("Titulo ya disponible");
                  System.out.println("......................................." );
                  break;
                  }
                if(it4_2.hasNext()== false){
                  System.out.println("......................................." );
                  System.out.println("Titulo disponible para ingreso" );
                  System.out.println("Ingrese el nuevo titulo: ");
                  System.out.println("......................................." );
                  String nuevoTitulo = System.console().readLine();
                  System.out.println("Ingrese el nuevo autor: ");
                  String nuevoAutor = System.console().readLine();
                  System.out.println("Ingrese el nuevo año: ");
                  String nuevoAnio = System.console().readLine();
                  System.out.println("Ingrese el nuevo estante: ");
                  String nuevoEstante_Numero = System.console().readLine();
                  System.out.println("Ingrese el nuevo estante: ");
                  String nuevoEstante_Seccion = System.console().readLine();
                  System.out.println("Ingrese el nuevo piso: ");
                  String nuevoPiso = System.console().readLine();
                  System.out.println("Ingrese el nuevo edificio: ");
                  String nuevoEdificio = System.console().readLine();
                  System.out.println("Ingrese el nuevo sede: ");
                  String nuevoSede = System.console().readLine();
                  Biblioteca bibliotec = new Biblioteca();
                  bibliotec.setTitulo(nuevoTitulo);
                  bibliotec.setAutor(nuevoAutor);
                  bibliotec.setAnio(nuevoAnio);
                  bibliotec.setEstante_numero(nuevoEstante_Numero);
                  bibliotec.setEstante_seccion(nuevoEstante_Seccion);
                  bibliotec.setPiso(nuevoPiso);
                  bibliotec.setEdificio(nuevoEdificio);
                  bibliotec.setSede(nuevoSede);
                  bibliotecas.add(bibliotec);                                  
                  System.out.println("Libro agregado");
                  System.out.println("..........................." + "\n" +"Titulo: " + bibliotec.getTitulo() + "\n" +"Autor: " + bibliotec.getAutor()+ "\n" + "Año: " +bibliotec.getAnio()+ "\n" + "Estante Numero: " + bibliotec.getEstante_numero()+ "\n"  + "Seccion: "+bibliotec.getEstante_seccion()+ "\n" +"Piso: "+bibliotec.getPiso()+ "\n" +"Edificio: " + bibliotec.getEdificio()+ "\n" +"Sede: " +bibliotec.getSede()+ "\n" +"..........................." + "\n"  );
                  break;
                  }
              }
              break;
              case 2:
              Iterator<Biblioteca> it4_3 = bibliotecas.iterator();
              System.out.println("Ingrese la sede a Ingresar: ");
              String sede = System.console().readLine();
                while(it4_3.hasNext()){
                    Biblioteca biblioteca = it4_3.next();
                    if(biblioteca.getSede().equals(sede)){
                    System.out.println("......................................." );
                    System.out.println("Sede ya disponible");
                    System.out.println("......................................." );
                    break;
                    }
                  if(it4_3.hasNext()== false){
                    System.out.println("......................................." );
                    System.out.println("Sede disponible para ingreso" );
                    System.out.println("Ingrese la nueva sede: ");
                    System.out.println("......................................." );
                    String nuevaSede = System.console().readLine();
                    Biblioteca biblioteccc = new Biblioteca();
                    biblioteccc.setTitulo("empty");
                    biblioteccc.setAutor("empty");
                    biblioteccc.setAnio("empty");
                    biblioteccc.setEstante_numero("empty");
                    biblioteccc.setEstante_seccion("empty");
                    biblioteccc.setPiso("empty");
                    biblioteccc.setEdificio("empty");
                    biblioteccc.setSede(nuevaSede);
                    bibliotecas.add(biblioteccc); 
                    System.out.println("Sede agregada");
                    System.out.println("Sede: " + biblioteccc.getSede());
                    System.out.println("......................................." );
                    break;
                    }
                }
                break;
                case 3:
              Iterator<Biblioteca> it4_4 = bibliotecas.iterator();
              System.out.println("Ingrese la seccion a Ingresar: ");
              String seccion_n = System.console().readLine();
                while(it4_4.hasNext()){
                    Biblioteca biblioteca = it4_4.next();
                    if(biblioteca.getEstante_seccion().equals(seccion_n)){
                    System.out.println("......................................." );
                    System.out.println("Seccion ya disponible");
                    System.out.println("......................................." );
                    break;
                    }
                  if(it4_4.hasNext()== false){
                    System.out.println("......................................." );
                    System.out.println("Seccion disponible para ingreso" );
                    System.out.println("Ingrese la nueva Seccion: ");
                    System.out.println("......................................." );
                    String seccion_nueva = System.console().readLine();
                    Biblioteca bibliotecc = new Biblioteca();
                    bibliotecc.setTitulo("empty");
                    bibliotecc.setAutor("empty");
                    bibliotecc.setAnio("empty");
                    bibliotecc.setEstante_numero("empty");
                    bibliotecc.setEstante_seccion(seccion_nueva);
                    bibliotecc.setPiso("empty");
                    bibliotecc.setEdificio("empty");
                    bibliotecc.setSede("empty");
                    bibliotecas.add(bibliotecc);   
                    System.out.println("Seccion agregada");
                    System.out.println("Seccion: " + bibliotecc.getEstante_seccion());
                    System.out.println("......................................." );
                    break;
                    }
                }
                break;
              case 4:
              Iterator<Biblioteca> it4_5 = bibliotecas.iterator();
              System.out.println("Ingrese el piso a Ingresar: ");
              String piso_n = System.console().readLine();
                while(it4_5.hasNext()){
                    Biblioteca biblioteca = it4_5.next();
                    if(biblioteca.getPiso().equals(piso_n)){
                    System.out.println("......................................." );
                    System.out.println("Piso ya disponible");
                    System.out.println("......................................." );
                    break;
                    }
                  if(it4_5.hasNext()== false){
                    System.out.println("......................................." );
                    System.out.println("Piso disponible para ingreso" );
                    System.out.println("Ingrese el nuevo piso: ");
                    System.out.println("......................................." );
                    String piso_nuevo = System.console().readLine();
                    Biblioteca bibliotecccc = new Biblioteca();
                    bibliotecccc.setTitulo("empty");
                    bibliotecccc.setAutor("empty");
                    bibliotecccc.setAnio("empty");
                    bibliotecccc.setEstante_numero("empty");
                    bibliotecccc.setEstante_seccion("empty");
                    bibliotecccc.setPiso(piso_nuevo);
                    bibliotecccc.setEdificio("empty");
                    bibliotecccc.setSede("empty");
                    bibliotecas.add(bibliotecccc); 
                    System.out.println("Piso agregado");
                    System.out.println("Piso: " + bibliotecccc.getPiso());
                    System.out.println("......................................." );
                    break;
                    }
                }
                break;

              case 5:
              System.out.println("......................................." );
              System.out.println("Volver al menu anterior");
              System.out.println("......................................." );
              break;
              default:
              System.out.println("......................................." );
              System.out.println("Opcion no valida");
              System.out.println("......................................." );
              break;

        }
          break;
//---------------------------------------------------------------------------------------------------------------------      
        case 5:
        System.out.println("Saliendo...");
        System.out.println("......................................." );
        System.exit(0);
//---------------------------------------------------------------------------------------------------------------------
        case 6:
        //export csv
        System.out.println("......................................." );
        System.out.println("Exportando a CSV");
        System.out.println("......................................." );
        try {
            FileWriter writer = new FileWriter("csv/inventario.csv");
            //if all fields have a value 2, do not write to csv
            for (Biblioteca biblioteca : bibliotecas) {
                if (biblioteca.getTitulo().equals("empty") && biblioteca.getAutor().equals("empty") && biblioteca.getAnio().equals("empty") && biblioteca.getEstante_numero().equals("empty") && biblioteca.getEstante_seccion().equals("empty") && biblioteca.getPiso().equals("empty") && biblioteca.getEdificio().equals("empty") && biblioteca.getSede().equals("empty")) {
                    continue;
                }else {   
                  writer.append(biblioteca.getTitulo());
                    writer.append(',');
                    writer.append(biblioteca.getAutor());
                    writer.append(',');
                    writer.append(biblioteca.getAnio());
                    writer.append(',');
                    writer.append(biblioteca.getEstante_numero());
                    writer.append(',');
                    writer.append(biblioteca.getEstante_seccion());
                    writer.append(',');
                    writer.append(biblioteca.getPiso());
                    writer.append(',');
                    writer.append(biblioteca.getEdificio());
                    writer.append(',');
                    writer.append(biblioteca.getSede());
                    writer.append('\n');
                }
              }
            writer.flush();
            writer.close();
            System.out.println("......................................." );
            System.out.println("Exportacion exitosa");
            System.out.println("......................................." );
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
//---------------------------------------------------------------------------------------------------------------------
        default:
        System.out.println("......................................." );
        System.out.println("Opcion no valida");
        System.out.println("......................................." );
          break;
           }
      }
    }
}

