public class Lab_exercise_2_2 {
    public static void main(String args[])
    {
        
        StringBuffer sb=new StringBuffer("Rojal");
        System.out.println("Finding the lenght of the string "+sb.length());
        System.out.println("USing the append method:"+sb.append(" Joy"));
        System.out.println("Using the insert method : "+sb.insert(6, "Treesa "));
        System.out.println("Using the replace method : "+sb.replace(6, 12, "T"));
        System.out.println("Using charAt() : "+sb.charAt(3));
        
        sb.setCharAt(6,'t');
        System.out.println("Using setCharAt() : "+sb);
        System.out.println("Using lenght method : "+sb.length());
        System.out.println("Using reverse method :"+sb.reverse());

        System.out.println("Using reverse method :"+sb.reverse());

        System.out.println("Using capacity method : "+sb.capacity());
        sb.ensureCapacity(50);
        System.out.println("Using ensureCapacity method : "+sb.capacity());
        System.out.println("Using toString method : "+sb.toString());

        System.out.println("Using substring method : "+sb.substring(5));
        System.out.println("Using substring method : "+sb.substring(7, 11));
        System.out.println("Using delete : "+sb.delete(6,11));
    }
}
