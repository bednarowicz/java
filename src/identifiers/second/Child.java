package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {
    //Klasa potomna w innej paczce nie ma dostepu do private i default
    public void identifiier(){
        System.out.println(first);
        //System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstMethod();
        //secondMethod();
        thirdMethod();
        //fourthMethod();

    }
}
