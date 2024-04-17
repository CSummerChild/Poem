/**Class: PoemWriter
 * @author Tyler Robinson
 * @version 1.3
 * Course: ITEC 2140 Spring 2023
 * Written: April 17, 2024
 */



public class PoemWriter {
    public static void main(String[] args) {
        // Create three Poem objects
        Poem poem1 = new Poem();
        poem1.setName("One Art");
        poem1.setPoet("Elizabeth Bishop");

        Poem poem2 = new Poem();
        poem2.setName("Ozymandias");
        poem2.setPoet("Percy Bysshe Shelley");

        Poem poem3 = new Poem();
        poem3.setName("Harlem");
        poem3.setPoet("Langston Hughes");


        System.out.println("Poem 1:");
        System.out.println("Name: " + poem1.getName());
        System.out.println("Poet: " + poem1.getPoet());
        System.out.println();

        System.out.println("Poem 2:");
        System.out.println("Name: " + poem2.getName());
        System.out.println("Poet: " + poem2.getPoet());
        System.out.println();

        System.out.println("Poem 3:");
        System.out.println("Name: " + poem3.getName());
        System.out.println("Poet: " + poem3.getPoet());
    }
}

