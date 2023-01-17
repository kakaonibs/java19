public class patternMatching {
// PREVIEW

    //NEW
    static String formatterNew(Object o){
        return switch(o){
            case null -> "null";
            case Integer i -> String.format("int ", i);
            case Long l -> String.format("long ", l);
            case Double d -> String.format("double ", d);
            case String s -> String.format("string ", s);
            case default -> o.toString();

            //if case: case String s when s.length == 1 ....
        };
    }

    //OLD
    static String formatterOld(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i){
            formatted = String.format("int ", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long ", l);
        } else if (o instanceof Double d){
            formatted = String.format("double ", d);
        } else if (o instanceof String s){
            formatted = String.format("string ", s);
        }
        return formatted;
    }

    public static void main(String[] args) {
        formatterOld("s");
        formatterNew("s");
    }

}
