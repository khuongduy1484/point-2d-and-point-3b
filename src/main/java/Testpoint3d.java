public class Testpoint3d {
    public static void main(String[] args) {
        Poin3D b = new Poin3D();
        System.out.println(b);
        b = new Poin3D(5.0f,3.5f,4.5f);
        System.out.println(b);
        b.setXYZ(12.0f,20.0f,3.0f);
        b.show(b.getXYZ());
    }
}
