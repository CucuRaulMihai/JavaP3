import java.awt.*;

public abstract class Fruit {
    Integer weight;
    Integer sugar;
    Integer water;
    Color color;

    public Fruit(Integer weight, Integer sugar, Integer water, Color color)
    {
        this.weight = weight;
        this.sugar = sugar;
        this.water = water;
        this.color = color;
    }

    enum Color
    {
        Red,Blue,Yellow,Green
    }


    static int computeWeight(Fruit[] fruits)
    {
        int TotalWeight = 0;
        for(int i =0 ;i< fruits.length;i++)
        {
            TotalWeight += fruits[i].weight;
        }
        return TotalWeight;
    }

    static int computeSugarContent(Fruit[] fruits)
    {
        int TotalSugar = 0;
        for(int i =0 ;i< fruits.length;i++)
        {
            TotalSugar += fruits[i].sugar;
        }
        return TotalSugar;
    }

    static void prepareFruit(Fruit[] fruits)
    {
        for(int i =0 ;i<fruits.length;i++)
        {
            if(fruits[i] instanceof Banana)
            {
                if(((Banana) fruits[i]).hasPeel());
                    ((Banana) fruits[i]).PeelOff();
                    ///System.out.println(((Banana) fruits[i]).Peel);
            }

            if(fruits[i] instanceof Apple)
            {
                if(((Apple) fruits[i]).hasSeeds());
                    ((Apple) fruits[i]).removeSeeds();
                         ///System.out.println(((Apple) fruits[i]).Seed);
            }

            if(fruits[i] instanceof Mango)
            {
                if (((Mango) fruits[i]).hasSeeds())
                    ((Mango) fruits[i]).removeSeeds();
                ///System.out.println(((Mango) fruits[i]).Seed);
                if(((Mango) fruits[i]).hasPeel())
                    ((Mango) fruits[i]).PeelOff();
                ///System.out.println(((Mango) fruits[i]).Peel);
            }
        }
    }



}
