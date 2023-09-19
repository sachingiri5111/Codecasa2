import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DigitalResource {
    private String title;
    private String author;
    private int year;

    public DigitalResource(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}

class Library {
    private List<DigitalResource> resources = new ArrayList<>();

    public void addResource(DigitalResource resource) {
        resources.add(resource);
    }

    public void listResources() {
        for (DigitalResource resource : resources) {
            System.out.println(resource);
        }
    }
}

public class DigitalLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nDigital Library Management System");
            System.out.println("1. Add Resource");
            System.out.println("2. List Resources");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    DigitalResource resource = new DigitalResource(title, author, year);
                    library.addResource(resource);
                    System.out.println("Resource added successfully!");
                    break;

                case 2:
                    System.out.println("\nList of Resources:");
                    library.listResources();
                    break;

                case 3:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
