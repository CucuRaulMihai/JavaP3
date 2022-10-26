public class InputDevice
{

     static Fruit[] readFruit()
    {

        Fruit[] fructe = new Fruit[5];

        Banana test1 = new Banana(1,2,3);
        fructe[0] = test1;

        Apple mere1 = new Apple(2,3,4, Fruit.Color.Green);
        fructe[1] = mere1 ;

        Banana test2 = new Banana(5,3,3);
        fructe[2] = test2;

        Apple mere2 = new Apple(4,3,5, Fruit.Color.Yellow);
        fructe[3]= mere2;

        Mango mango = new Mango(4,7,4, Fruit.Color.Yellow);
        fructe[4] =mango;

        System.out.println(Fruit.computeWeight(fructe));
        System.out.println(Fruit.computeSugarContent(fructe));
        Fruit.prepareFruit(fructe);

        return fructe;
    }






}
