package src;

class GrandMother{
    void HouseWife(){
        System.out.println("My GrandMother is a Housewife.");
    }
}
class Mother extends GrandMother{
    void HouseWife() //@override
    {
        System.out.println("My Mother is  a Housewife.");
    }
}
class Aunt extends GrandMother{
    void HouseWife() //@override
    {
        System.out.println("My Aunt is also a Housewife.");
    }
}
public class PolyMorphismInJava10 {
    public static void main(String[] args) {
        GrandMother gm = new GrandMother();
        GrandMother gm1 = new Mother();
        GrandMother gm2 = new Aunt();

        gm.HouseWife();
        gm1.HouseWife();
        gm2.HouseWife();
    }
}
