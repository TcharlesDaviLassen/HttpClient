package org.example;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Students {
    private String id;
    private Set<String> subjects;

    public Students(String id) {
        this.id = id;
        subjects = new HashSet<>(Arrays.asList("Maths", "Science"));
    }

    private Students() {
    }

    @Override
    public String toString() {
        return Arrays.asList(id, subjects.toString()).toString();
    }
}

class Persons {
    private String name;
    private int age;
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;

        // defina `null` para que `serializeNulls()` funcione
        student = new Student(null);
    }

    private Persons() {
    }

    @Override
    public String toString() {
        return Arrays.asList(name, String.valueOf(age), student.toString())
                .toString();
    }
}

// Demonstra a serialização/desserialização de objetos Java usando
// biblioteca GSON do Google
class MainStudents {
    public static void main(String[] args) {
        Person person = new Person("Jon Snow", 22);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();        // Cria uma instância Gson

        // Serialize o objeto – Converta o objeto `Person` em uma string JSON
        String jsonString = gson.toJson(person);

        System.out.println("Converting Person object to JSON string:\n" + jsonString);

        // Desserialize o objeto – Converta a string JSON de volta para o objeto `Person`
        Person p = gson.fromJson(jsonString, Person.class);

        System.out.println("\nConverting JSON string to Person object:\n" + p.toString());

        System.out.println("Name: " + p.getName());
    }
}