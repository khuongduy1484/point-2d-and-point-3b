public class Poin3D extends Point2D {
    float z = 0.0f;
    public Poin3D(){

    }
    public Poin3D(float x,float y,float z){
        super(x,y);
        this.z = z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setXYZ(float x,float y,float z){
       setXY(x,y);
        this.z = z;
    }public float []getXYZ(){
        float []array = new  float[3];
        array[0] = this.x;
        array[1] = this.y;
        array[2] = this.z;
        return array;
    }
    public void  show(float []arr){
        for (float e:arr){
            System.out.println(e);
        }
    }
    @Override
    public String toString(){
        return super.toString() + " z " + z;
    }

}
