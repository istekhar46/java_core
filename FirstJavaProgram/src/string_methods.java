public class string_methods {
    public static void main(String[] args) {
        String name = "istekhar";
        String name1 = "  istekhar khan";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name1.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        System.out.println(name.replace("kh","aa"));
        System.out.println(name.replace("a","b"));
        System.out.println(name.startsWith("te"));
        System.out.println(name.endsWith("khan"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("k"));
        System.out.println(name.indexOf("kha"));
        System.out.println(name.lastIndexOf("ar"));


    }
}
