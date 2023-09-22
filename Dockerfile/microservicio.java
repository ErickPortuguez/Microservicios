import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class microservicio {

    public static void main(String[] args) throws IOException {
        // Crear un servidor HTTP en el puerto 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8050), 0);

        // Agregar un manejador de solicitud para la ruta "/saludo"
        server.createContext("/saludo", new SaludoHandler());

        // Iniciar el servidor
        server.start();
    }

    static class SaludoHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Configurar la respuesta HTTP
            String response = "¡Hola desde el microservicio!";
            exchange.sendResponseHeaders(200, response.length());

            // Escribir la respuesta en el cuerpo de la respuesta HTTP
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
