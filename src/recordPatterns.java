//PREVIEW
record Point(int x, int y){}

public class recordPatterns {

    //NEW pattern matching
    static void printSumNew(Object o){
        if (o instanceof Point (int x, int y)){
            System.out.println(x+y);
        }
    }

    // OLD
    static void printSumOld(Object o){
        if (o instanceof Point p){
            int x = p.x();
            int y = p.y();
            System.out.println(x+y);
        }
    }
}

