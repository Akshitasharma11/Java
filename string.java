public class string {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String name= "Akshita";
        System.out.println(name);
        
        int value= name.length();
        System.out.println(value);

        String n1= name.toLowerCase();
        System.out.println(n1);

        String n2= name.toUpperCase();
        System.out.println(n2);

        String nontrim= "    akshita   ";
        String trim= nontrim.trim();
        System.out.println(trim);
        System.out.println(nontrim.trim());

        System.out.println(name.substring(5));
        System.out.println(name.substring(2, 7));

        System.out.println(name.replace('a', 's'));
        System.out.println(name.replace("Aks", "uuu"));

        System.out.println(name.startsWith("ak"));
        System.out.println(name.endsWith("ta"));

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("t"));
        System.out.println(name.indexOf("i", 3));
        System.out.println(name.lastIndexOf("a"));

        System.out.println(name.equals("akshita"));
        System.out.println(name.equalsIgnoreCase("akshita"));
    }
}
