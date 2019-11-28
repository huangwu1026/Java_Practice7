package upper_case_scene;

public class Main {
    public void brief(Animal a){
        System.out.println("我是 " + a.getType());
        System.out.println("我叫 " + a.scream());
        System.out.println("我有 " + a.getNumberOfLegs() + "条腿");
    }

    public Animal createAniaml(){
        return  new Animal();
    }

    public Animal createDog(){

        //Animal p = new Dog();
        //return p;
        //等同于如下
        return new Dog();
    }

    public Animal createCat(){
        return new Cat();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.brief(main.createAniaml());
        main.brief(main.createCat());
        main.brief(main.createDog());
    }

}
