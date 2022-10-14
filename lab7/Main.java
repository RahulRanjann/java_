
// import mypackage.p1.Package; // import package |||   inside myPackage folder we have p1 folder and  ther we get the package file(.java)

public class Main {
    public static void main(String[] args) {
        int arr[][] = new int[][] {

                new int[] { 1, 2, 3, 4 },
                new int[] { 5, 6, 7, 8 }
        };
        int row = arr.length;
        int column = arr[0].length;
        System.out.println(Package.max(10, 20, 30));
        System.out.println(Package.max((float) 20.25, (float) 65.65, (float) 89.45));
        System.out.println(Package.max(arr , row,column));
    }
}
