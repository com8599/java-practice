package Chapter07;

// 1. 키를 관리하는 ManageHeigt라는 클래스를 만들고 main() 메소드도 만들자.
class ManageHeight {

    int[][] gradeHeight = new int[5][5];

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for (int i = 0; i < 5; i++) {
            manageHeight.printHeight(i);
        }
    }

    public void setData() {
        gradeHeight[0] = new int[] {170, 180, 173, 175, 177};
        gradeHeight[1] = new int[] {160, 165, 167, 186};
        gradeHeight[2] = new int[] {158, 177, 187, 176};
        gradeHeight[3] = new int[] {173, 182, 181};
        gradeHeight[4] = new int[] {170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:" + classNo);
        for (int height : gradeHeight[classNo - 1]) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        System.out.println("Class No.:" + classNo);
        int heightSum = 0;
        for (int height : gradeHeight[classNo - 1]) {
            heightSum += height;
        }
        double studentCount = heightSum / gradeHeight[classNo - 1].length;
        System.out.println("Height average : " + heightSum);

    }
}

// 2. 빼기, 곱하기, 나누기를 하고 그 결과를 리턴해주는 메소드를 만들어 보자
class Calculator {

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

}