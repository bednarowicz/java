package identifiers.first;

public class Child extends Parent {
    //klasa potomna w tej samej paczce nie ma dostępu do private
    public void identifiier(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        //fourthMethod();

    }
}
