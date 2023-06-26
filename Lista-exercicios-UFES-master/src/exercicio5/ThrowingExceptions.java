package exercicio5;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class ThrowingExceptions {
    public static void main(String[] args) {
        metodo01();
        metodo02();
        metodo03();
    }

    public static void metodo01(){
        try{
            Class.forName("ClasseQueNaoExiste");
        }catch(ClassNotFoundException e){
            System.out.println("Classe nao encontrada.");
        }
    }

    public static void metodo02(){
        try{
            java.io.File.createTempFile("pre", "suf");
        }catch (IOException e){
            System.out.println("Erro ao criar o arquivo.");
        }
    }

    public static void metodo03(){
        try{
            Integer.class.getDeclaredConstructor().newInstance();
        }catch(InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e){
            System.out.println("Erro ao instanciar a classe.");
        }
    }
}
