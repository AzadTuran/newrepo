package javaders.day28interface;

    /*

      Child     Parent
    1)Class --> Class          : extends
    2)interface --> interface  : extends
    3)interface --> Class      :implements
    Class -->  interface       :OLAMAZ...

    Aynı ise "extends",farklı ise "implements" kullan.
    "interface"i Class'in parent'i yapma

     */

public interface Mammal extends Animal{

    String feedBaby = "Milk";
    int age = 6;
}
