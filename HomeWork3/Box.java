package HomeWork3;

import org.w3c.dom.ls.LSOutput;

public class Box<T extends Fruit> {
    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return this.obj = obj;
    }
    public Box<?> setObj(Box<?> obj) { return obj; }

    public Double getWeightBox(){
        return this.obj.getWeight();
    }

    public Boolean compare(Box<?> box2){
       return (this.obj == box2.obj);
    }

    @Override
    public String toString(){
        return "Box: "
                + "type "+ this.obj.getClass().getSimpleName()
                + " object " + this.obj;
    }

    public boolean moveFruit(Box<?> boxIn){
        if (this.obj.getClass().getSimpleName().equals(boxIn.getClass().getSimpleName())){
            return true;
        }else{
            return false;
        }
    }
}
