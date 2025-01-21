package JavaPracticLab;

import java.text.SimpleDateFormat;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface Arithmetic{
    public int add(int n1, int n2);
}

interface Temperature{
    public void ftoc(double f);
}
interface Distance{
    public int kmtom(int km);
}

public class DataFormatter {
    public static void main(String[] args) {
//        Date currentDate = new Date();
//
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        String formatdate = formatter.format(currentDate);
//
//        System.out.println("Date:"+currentDate);
//        System.out.println("Formatted Date:"+formatdate);
//

//        String st = "hello world";
//        String sub  = "girl";
//
//        StringBuilder sb = new StringBuilder(st);
//
//        sb.insert(6,sub);
//        String res = sb.toString();
//        System.out.println(res);
//
//        String[] originalArray= {"Apple",null,"Banana","Orange",null,"Grapes"};
//
//        ArrayList<String> nonNullList=new ArrayList<>();
//
//        for(String element:originalArray) {
//            if(element!=null) {
//                nonNullList.add(element);
//            }
//        }
//
//
//        String[] nonNullArray=nonNullList.toArray(new String[0]);
//
//
//        for(String element:nonNullArray) {
//            System.out.println(element);
//        }

//        String patternStr = "ab";
//        String TargetStr = "abababababass";
//
//        Pattern ptr = Pattern.compile(patternStr);
//        Matcher mt = ptr.matcher(TargetStr);
//
//        while (mt.find()){
//            System.out.println(mt.start());
//            System.out.println(mt.end());
//        }

//
//        public static boolean isVowel(char c) { return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; }
//

//        Set<String> set1 = new TreeSet<String>();
//        set1.add("Java");
//        set1.add("C#");
//        set1.add("C++");
//        set1.add("Python");
//        System.out.println(set1);
//
//        Iterator<String> itr  = set1.iterator();
//
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

//
//        Set<String> langSet = new TreeSet<String>(); langSet.add("Java");
//        langSet.add("DBMS");
//
//        Set<String> langSet2 = new TreeSet<String>(); langSet2.add("Python");  langSet2.add("STQA");
//        langSet.addAll(langSet2);
//
//        for( String li: langSet){
//            System.out.println(li);
//        }
//
//        if(langSet.contains("python ")){
//            langSet.remove("Python");
//        }
//
//
//
//        Arithmetic arth = (a,b) -> a+b;
//
//        int sum;
//        sum = arth.add(10, 20);
//
//        System.out.println("Sum: " +sum);


        Temperature t1 = (f) -> {
            double c=(f-32)*(5.0/9.0);
        };

    }
}
