import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.net.InetAddresses;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException {
        //создание объекта для сериализации в JSON
        Cat cat = new Cat("Murka");
        cat.addAge(1);
        cat.addAge(2);
        cat.addAge(3);
        cat.addWeight(UUID.randomUUID(), 1);
        cat.addWeight(UUID.randomUUID(), 2);


        FileOutputStream w = new FileOutputStream("C://Users//bebes//IdeaProjects//Maven//output.txt");

        //StringWriter writer = new StringWriter();

        String resultJson = new ObjectMapper().writeValueAsString(cat);






        JsonFactory factory = new JsonFactory();

        JsonGenerator generator = factory.createGenerator(w);
        generator.setCodec (new ObjectMapper ());
        // generator.setCodec(null).writeObject(cat);
        generator.writeObject(cat);
        //ObjectMapper obj = new ObjectMapper();
        //String s = obj.writeValueAsString(cat);
        //System.out.println(s);

        Random random = new Random();
        String ipString = InetAddresses.fromInteger(random.nextInt()).getHostAddress();
        System.out.println(ipString);
        ipString = InetAddresses.fromInteger(random.nextInt()).getHostAddress();
        System.out.println(ipString);

    }

}

