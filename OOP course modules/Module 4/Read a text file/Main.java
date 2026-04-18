public class Main {
    public static void main(String[] args) {
        TextReader myReader = new TextReader();
        
        System.out.println("Attempting to read 'data.txt':");
        myReader.readFile("data.txt");
        
        System.out.println("\nAttempting to read a file that does not exist:");
        myReader.readFile("missing_file.txt");
    }
}
