package identifiers.first;

public class Random {
    //klasa w tej samej paczce nie ma dostępu na private
    public void testIdentifier(){
        Parent parent = new Parent();
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
        //parent.fourthMethod();


    }
}
