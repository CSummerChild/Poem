public class PoemWriter {
    public static void main(String[] args) {
        // Create three Poem objects
        Poem poem1 = new Poem();
        poem1.setName("The Raven");
        poem1.setPoet("Edgar Allan Poe");

        Poem poem2 = new Poem();
        poem2.setName("Ozymandias");
        poem2.setPoet("Percy Bysshe Shelley");

        Poem poem3 = new Poem();
        poem3.setName("The Road Not Taken");
        poem3.setPoet("Robert Frost");

        // Print poem information to console
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

