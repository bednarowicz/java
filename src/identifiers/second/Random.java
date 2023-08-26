package identifiers.second;

import identifiers.first.Parent;

public class Random {
    //klasa z innej paczki nie ma dostępu do: default, protected, private
    public void testIdentifier(){
        Parent parent = new Parent();
        System.out.println(parent.first);
        //System.out.println(parent.second);
        //System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstMethod();
        //parent.secondMethod();
        //parent.thirdMethod();
        //parent.fourthMethod();


    }
}
