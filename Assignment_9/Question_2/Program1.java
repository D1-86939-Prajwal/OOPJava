package Question_2;

import java.util.*;

public class Program1 {

    static List<Students> l1 = new ArrayList<>();

    public static void accept(Scanner sc) {
        System.out.println("Enter the number of students to add:");
        int numberOfStudents = sc.nextInt();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the Roll Number of the Student");
            int roll = sc.nextInt();
            System.out.println("Enter the Name of the Student");
            String name = sc.next();
            System.out.println("Enter the City of the Student");
            String city = sc.next();
            System.out.println("Enter the Marks of the Student");
            double marks = sc.nextDouble();
            l1.add(new Students(roll, name, city, marks));
        }
    }

    private static void display() {
       Iterator <Students> stu = l1.listIterator();
       while(stu.hasNext()) {
    	   Students s = stu.next();
    	   System.out.println(s);
       }
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        // Comparators
        class StuNRollComparator implements Comparator<Students> {
            @Override
            public int compare(Students o1, Students o2) {
                return Integer.compare(o1.getRoll(), o2.getRoll());
            }
        }

        class StuNameComparator implements Comparator<Students> {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

        class StuMarksComparator implements Comparator<Students> {
            @Override
            public int compare(Students o1, Students o2) {
                return Double.compare(o1.getMarks(), o2.getMarks());
            }
        }

        do {
            System.out.println("Students Menu");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Sort Students based on Roll Number");
            System.out.println("5. Sort Students based on Name");
            System.out.println("6. Sort Students based on Marks");
            System.out.println("7. Exit the menu");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    accept(sc);
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.println("Enter the roll number to search: ");
                    int rollNumber = sc.nextInt();
                    boolean found = false;
                    for (Students student : l1) {
                        if (student.getRoll() == rollNumber) {
                            System.out.println("Student found: " + student);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found in the list.");
                    }
                    break;
                case 4:
                    l1.sort(new StuNRollComparator());
                    display();
                    break;
                case 5:
                    l1.sort(new StuNameComparator());
                    display();
                    break;
                case 6:
                    l1.sort(new StuMarksComparator());
                    display();
                    break;
                case 7:
                    System.out.println("Exiting the menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
