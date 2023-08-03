package learn.labs.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Gson gson = new Gson();

        Person person = new Person("Hadi Prasetyo");
        String name = gson.toJson(person);

        System.out.println(name);
    }
}
