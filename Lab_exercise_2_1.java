public class Lab_exercise_2_1 {
    public static void main(String args[])
    {
        String sb="We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";
        System.out.println("charAT() :"+sb.charAt(10));
        String sub1=sb.substring(11,30);
        String sub2=sb.substring(11,40);
        System.out.println("Using substring method : "+sub1);

        System.out.println("compareTo() :"+sub1.compareTo(sub2));
        System.out.println("concat() : "+sub1.concat(sub2));
        System.out.println("endsWith() : "+sub2.contains(sub1));
        System.out.println("equals() :"+sub1.equals(sub2));
        System.out.println("equalsIgnoreCase() : "+sub2.equalsIgnoreCase(sub1));
        System.out.println("format() : "+String.format("hi",sub2));
        byte[] bytes=sub1.getBytes();
        for (byte b:bytes){
        System.out.println("getBytes() : "+b);}
        
        char[] ch=new char[10];
        sb.getChars(1, 10, ch, 0);
        System.out.println("getChars() : "+new String(ch));
        System.out.println("indexOf() :"+sb.indexOf(sub2));
        System.out.println("inter() : "+sub1.intern());
        System.out.println(("isEmpty() :"+sub2.isEmpty()));
        System.out.println(("join() : "+String.join("-", "hi","how","are","you")));
        System.out.println("lastIndexof() : "+sub2.lastIndexOf("hi"));
        System.out.println("lenght() : "+sub1.length());
        System.out.println("replace() : "+sub1.replace("hi", "HI"));
        String sub3=sb.substring(40,60);
        System.out.println("replaceAll() : "+sub2.replaceAll(sub2, sub3));
        System.out.println("split() : ");
        String words[]=sub1.split(" ");
        for(String word :words){
        System.out.println(word);}
        
        System.out.println("startsWith() : "+sub2.startsWith("HI",8));
        System.err.println("toLowerCase() : "+sub2.toLowerCase());
        System.out.println("toUpperCase() : "+sub2.toUpperCase());
        String st="        hi          ";
        System.out.println("trim() : "+st.trim());
        System.out.println("valueOf() : "+String.valueOf(sub1));

    }
}
