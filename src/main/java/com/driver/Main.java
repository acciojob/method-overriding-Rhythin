package com.driver;

public class Main {

    public static void main(String args[]){
        B Bobj =new B();

        System.out.println(Bobj.callAmeth());
        System.out.println(Bobj.meth());
    }
}

 class A {

    public  String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{


    public String meth(){
        return "Method is overridden in Extendend class B";
    }

    public String callAmeth() {
        return super.meth();
    }
}

