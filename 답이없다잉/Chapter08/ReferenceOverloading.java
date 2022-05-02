package Chapter08;

public class ReferenceOverloading {
    public static void main(String[] args) {
        ReferenceOverloading referenceOverloading = new ReferenceOverloading();
    }

    public void print(int data) {

    }

    public void print(String data) {

    }

    public void print(int intData, String strData) {

    }

    public void print(String strData, int intData) {

    }
}
