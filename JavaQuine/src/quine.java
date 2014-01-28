public class quine {
    public static void main(String[] args) {
        for (int i = 0; i < src.length-1; i++){
            System.out.println(src[i]);
        }
        for (int i = 0; i < src.length-1; i++){
            for (int j = 0; j < 8; j++)
                System.out.print(' ');
            System.out.println((char) 34 + src[i] + (char) 34 + (char) 44);
        }
        for (int i = 0; i < 8; i++)
            System.out.print(' ');
        System.out.println((char) 34 + src[src.length-1] + (char) 34);
        for (int i = 0; i < 4; i++)
            System.out.print(' ');
        System.out.println(src[src.length-1] + (char) 59);
        System.out.println(src[src.length-1]);
    }
    static String[] src = {
        "public class quine {",
        "    public static void main(String[] args) {",
        "        for (int i = 0; i < src.length-1; i++){",
        "            System.out.println(src[i]);",
        "        }",
        "        for (int i = 0; i < src.length-1; i++){",
        "            for (int j = 0; j < 8; j++)",
        "                System.out.print(' ');",
        "            System.out.println((char) 34 + src[i] + (char) 34 + (char) 44);",
        "        }",
        "        for (int i = 0; i < 8; i++)",
        "            System.out.print(' ');",
        "        System.out.println((char) 34 + src[src.length-1] + (char) 34);",
        "        for (int i = 0; i < 4; i++)",
        "            System.out.print(' ');",
        "        System.out.println(src[src.length-1] + (char) 59);",
        "        System.out.println(src[src.length-1]);",
        "    }",
        "    static String[] src = {",
        "}"
    };
}
