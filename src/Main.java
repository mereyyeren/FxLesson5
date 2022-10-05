

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Task1
//public class Main {
//    public static void  main(String[] args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Mers");
//        cars.add("Toyota");
//        cars.add("Cobalt");
//        cars.add("Honda");
//        System.out.println(cars);
//    }
//}


//Task2
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Mers");
//        cars.add("Toyota");
//        cars.add("Cobalt");
//        cars.add("Honda");
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars);
//        }
//    }
//}


//Task3
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Dilnaz");
//        names.add("Moldir");
//        names.add("Gulnur");
//        names.add("Bulbul");
//        for (String i : names) {
//            System.out.println( i );
//        }
//    }
//}



//Task4
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(17);
//        myNumbers.add(18);
//        myNumbers.add(19);
//        myNumbers.add(20);
//        for (int i : myNumbers) {
//            System.out.println( i );
//        }
//    }
//}


//Task5

//import java.util.Collections;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> brends = new ArrayList<String>();
//        brends.add("Gucci");
//        brends.add("Chanel");
//        brends.add("Versage");
//        brends.add("Prada");
//        for (String i : brends) {
//            System.out.println( i );
//        }
//    }
//}


//Task6
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(20);
//        myNumbers.add(21);
//        myNumbers.add(22);
//        myNumbers.add(23);
//        myNumbers.add(24;
//        myNumbers.add(25);
//
//        Collections.sort(myNumbers);
//        for (int i : myNumbers) {
//            System.out.println( i );
//        }
//    }
//}

//Task7
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Gucci");
//        cars.add("Chanel");
//        cars.add("Versage");
//        cars.add("Prada");
//        System.out.println(cars);
//
//        String car = cars.get(0);
//        System.out.println("get method:" +car);
//
//
//        cars.set(0, "Opel");
//        System.out.println("set method:" +cars);
//
//        cars.remove(0);
//        System.out.println("remove method:" +cars);
//
//        cars.clear();
//        System.out.println("clear method:" +cars);
//
//        int s = cars.size();
//        System.out.println("list size:" +s);
//    }
//    }

//Class work

//Problem1
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Blue");
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Black");
//        System.out.println( colors );
//    }
//}

//Problem2
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Blue");
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Black");
//        colors.add("Orange");
//        System.out.println(colors);
//
//        colors.add(0, "Pink");
//        colors.add(4, "White");
//
//        System.out.println(colors);
//        }
//    }


//Problem3
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Blue");
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Black");
//        colors.add("Orange");
//        System.out.println(colors);
//
//       String element = colors.get(0);
//       System.out.println("First element: "+element);
//        element = colors.get(2);
//
//
//        System.out.println("Second element: "+element);
//    }
//}

//Problem4
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Blue");
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Black");
//        colors.add("Orange");
//        System.out.println(colors);
//
//
//        colors.set(2, "White");
//
//        System.out.println(colors);
//    }
//}


//Problem5
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Blue");
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Black");
//        colors.add("Orange");
//        System.out.println(colors);
//
//
//        colors.remove(3);
//
//        System.out.println("After removing third element from the list:\n"+colors);
//    }
//    }

//Problem6
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Blue");
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Black");
//        colors.add("Orange");
//
//        if (colors.contains("Blue")) {
//            System.out.println("Found the element");
//        } else {
//            System.out.println("There is no such element");
//        }
//    }
//}

//Problem7
//public class Main {
//    public static void main(String[] args) {
//            List<String> List1 = new ArrayList<String>();
//            List1.add("2");
//            List1.add("0");
//            List1.add("0");
//            List1.add("3");
//            System.out.println("List1: " + List1);
//            List<String> List2 = new ArrayList<String>();
//            List2.add("M");
//            List2.add("A");
//            List2.add("R");
//            List2.add("Y");
//            System.out.println("List2: " + List2);
//            // Copy List2 to List1
//            Collections.copy(List1, List2);
//            System.out.println("Copy List to List2,\nAfter copy:");
//            System.out.println("List1: " + List1);
//            System.out.println("List2: " + List2);
//        }
//    }

//
//Problem8
//public class Main {
//    public static void main(String[] args) {
//
//        List<String> colors = new ArrayList<String>();
//        colors.add("Blue");
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Black");
//        colors.add("Orange");
//        System.out.println("List before shuffling:\n" + colors);
//        Collections.shuffle(colors);
//        System.out.println("List after shuffling:\n" + colors);
//    }
//}


//Problem9
//public class Main {
//    public static void main(String[] args) {
//
//        List<String> colors = new ArrayList<String>();
//        colors.add("Blue");
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Black");
//        colors.add("Orange");
//        System.out.println("List before reversing :\n" + colors);
//        Collections.reverse(colors);
//        System.out.println("List after reversing :\n" + colors);
//    }
//}


//Bonus

//Problem1
//public class Main  {
//    public static void main(String[] args) {
//
//        List<String> cars = new ArrayList<String>();
//        cars.add("Toyota");
//        cars.add("Lexus");
//        cars.add("Tesla");
//        cars.add("Ferrari");
//        cars.add("BMB");
//        System.out.println("Original list: " + cars);
//        List<String> sub_List = cars.subList(0, 3);
//        System.out.println("List of first three elements: " + sub_List);
//    }
//}


//Problem2
//public class Main{
//
//  public static void main(String[] args) {
//
// ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Toyota");
//        cars.add("Lexus");
//        cars.add("Tesla");
//        cars.add("Ferrari");
//        cars.add("BMB");
//        cars.add("Mers");
//
//        ArrayList<String> colors = new ArrayList<String>()
//      colors.add("Blue");
//      colors.add("Pink");
//      colors.add("Orange");
//      colors.add("Grey");
//      colors.add("Purple");
//         if (cars.equals(colors)==true) {
//             System.out.println(" Array List are equal");
//         }
//         else{
//             System.out.println(" Array List are not equal");
//         }
//  }
// }



//Problem3
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars1= new ArrayList<String>();
//        cars1.add("Toyota");
//        cars1.add("Lexus");
//        cars1.add("Tesla");
//        cars1.add("Ferrari");
//        cars1.add("BMB");
//
//        System.out.println("Array list before Swap:");
//        for(String a: cars1){
//            System.out.println(a);
//        }
//
//        Collections.swap(cars1, 2, 4);
//        System.out.println("Array list after swap:");
//        for(String b: cars1){
//            System.out.println(b);
//        }
//    }
//}







//Problem4

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars1= new ArrayList<String>();
        cars1.add("Toyota");
        cars1.add("Lexus");
        cars1.add("Ferrari");
        cars1.add("BMB");
        cars1.add("Tesla");
        System.out.println("List of first array: " + cars1);
        ArrayList<String> cars2= new ArrayList<String>();
        cars2.add("Toyota");
        cars2.add("Lexus");
        cars2.add("Ferrari");
        cars2.add("Tesla");
        System.out.println("List of second array: " + cars2);


        ArrayList<String> a = new ArrayList<String>();
        a.addAll(cars1);
        a.addAll(cars2);
        System.out.println("New array: " + a);


    }
}
























