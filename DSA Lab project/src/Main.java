public class Main {
    static void insertionSort(Student[] s, int n) {
        for (int i = 1; i < n; i++) {
            Student key = s[i];
            int j = i - 1;

            while (j >= 0 && s[j].getId() > key.getId()) {
                s[j + 1] = s[j];
                j--;
            }
            s[j + 1] = key;
        }
    }
    static int binarySearch(Student[] s, int n, int id) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (s[mid].getId() == id)
                return mid;
            else if (s[mid].getId() < id)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        Student[] students = new Student[5];
        int n = 4;

        students[0] = new Student(3, "Yasir", 78);
        students[1] = new Student(1, "Ali", 85);
        students[2] = new Student(4, "Moeed", 90);
        students[3] = new Student(2, "Azan", 88);

        System.out.println("Before Sorting:");
        for (int i = 0; i < n; i++) {
            students[i].show();   // polymorphic call
        }

        insertionSort(students, n);

        System.out.println("\nAfter Sorting:");
        for (int i = 0; i < n; i++) {
            students[i].show();
        }

        int searchId = 2;
        int result = binarySearch(students, n, searchId);

        if (result != -1) {
            System.out.println("\nStudent Found:");
            students[result].show();
        } else {
            System.out.println("\nStudent Not Found");
        }
    }
}
