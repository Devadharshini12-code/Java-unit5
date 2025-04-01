import java.util.Arrays;
import java.util.Scanner;

public class Unit5Array {
    public static void main(String[] args) {
        // sort ascending to descending;
//         int[] numbers={1,9,7,5,3};
//         Arrays.sort(numbers);
//   System.out.println("Sorted Array:"+Arrays.toString(numbers));

// merging two arrays
// int[] array1={1,9,8};
// int[] array2={4,6,8};
// int[] merged =new int[array1.length+array2.length];
// System.arraycopy(array1, 0, merged,0, array1.length);
// System.arraycopy(array2, 0, merged,array1.length, array2.length);

// System.out.println("Merged Array:"+Arrays.toString(merged));

 Scanner sc = new Scanner(System.in);

        //  number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Declaring an array 
        int[] grades = new int[numStudents];

        // Inputting grades from the user
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        // Displaying all grades
        System.out.println("Grades of students: " + Arrays.toString(grades));

        // Finding the average grade
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / numStudents;
        System.out.println("Average Grade: " + average);

        // Finding the highest and lowest grade
        int max = Arrays.stream(grades).max().getAsInt();
        int min = Arrays.stream(grades).min().getAsInt();
        System.out.println("Highest Grade: " + max);
        System.out.println("Lowest Grade: " + min);
    }
}

