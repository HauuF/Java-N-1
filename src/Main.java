import com.spotify.models.DataBase;
import org.w3c.dom.ls.LSInput;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int eleccion;

        System.out.println("Bienvenido a Spotify, elija una de las 3 opciones mostradas a continuación:");
        do {
            System.out.println("1. Crear una nueva canción.");
            System.out.println("2. Crear un nuevo usuario.");
            System.out.println("3. Crear un nuevo artista.");
            System.out.println("0. Salir.");

            System.out.print("Ingrese su elección: ");
            eleccion = scanner.nextInt();
            scanner.nextLine();

            switch (eleccion) {
                case 1:
                    crearNuevaCancion(scanner);
                    break;
                case 2:
                    crearNuevoUsuario(scanner);
                    break;
                case 3:
                    crearNuevoArtista(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (eleccion != 4);
        scanner.close();
    }
    public static void crearNuevaCancion(Scanner scanner) {
        System.out.print("Ingrese el nombre de la canción: ");
        String songName = scanner.nextLine();
        System.out.print("Ingrese el nombre del artista: ");
        String artistName = scanner.nextLine();
        System.out.print("Ingrese el género de la música: ");
        String musicGender = scanner.nextLine();
        System.out.print("Ingrese la duración de la canción en minutos: ");
        float duration = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del álbum: ");
        String album = scanner.nextLine();

        DataBase.BDsongs song = new DataBase.BDsongs();
        song.Song(UUID.randomUUID(), songName, artistName, musicGender, album, duration);

        System.out.println("Canción creada:");
        System.out.println("Nombre de la canción: " + song.getSongName());
        System.out.println("Nombre del artista: " + song.getArtist());
        System.out.println("Género de la música: " + song.getMusicGender());
        System.out.println("Duración de la canción: " + song.getDuration());
        System.out.println("Álbum: " + song.getAlbum());
        System.out.println("ID de la canción: " + song.getuuidSong());
    }

    public static void crearNuevoUsuario(Scanner scanner) {
        System.out.print("Ingrese el nombre de usuario: ");
        String userName = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String password = scanner.nextLine();
        System.out.print("Ingrese el primer nombre: ");
        String firstName = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        String lastName = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        DataBase.BDusers user = new DataBase.BDusers();
        user.Song(UUID.randomUUID(), userName, password, firstName, lastName, age);

        System.out.println("Usuario creado:");
        System.out.println("Nombre de usuario: " + user.getUserName());
        System.out.println("Contraseña: " + user.getPassword());
        System.out.println("Nombre completo: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Edad: " + user.getAge());
        System.out.println("ID de usuario: " + user.getuuidUser());
    }

    public static void crearNuevoArtista(Scanner scanner) {
        System.out.print("Ingrese el nombre del artista: ");
        String artistName = scanner.nextLine();

        DataBase.BDartist artist = new DataBase.BDartist();
        artist.Song(UUID.randomUUID(), artistName);

        System.out.println("Artista creado:");
        System.out.println("Nombre del artista: " + artist.getartistNamee());
        System.out.println("ID del artista: " + artist.getuuidArtiste());
    }
}