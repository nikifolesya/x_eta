import java.util.*;

public class Exam {

    public static int combinations(int ...nums) {
        int s = 1;
        for (int n: nums) {
            s *= n;
        }
        return s;
    }

    public static String letter(String s) {
        s = s.toLowerCase();
        String str = new String();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
        }
        return str;
        
    }

    public static ArrayList<String> numInStr(String [] arr) {
        ArrayList <String> list = new ArrayList<>();
        String num = "1234567890";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (num.indexOf(arr[i].charAt(j)) != -1) {
                    list.add(arr[i]);
                    break;
                }  
            }
        }
        return list;
    }

    public static boolean isTriplet(int a, int b, int c) {
        if (a > b && a > c) {
            if (b * b + c * c == a * a) return true;
        }
        if (b > a && b > c) {
            if (a * a + c * c == b * b) return true;
        }
        if (c > b && c > a) {
            if (b * b + a * a == c * c) return true;
        }
        return false;  
    }

    public static int duplicates(String s) {
        s = s.toLowerCase();
        ArrayList<Character> list = new ArrayList<>();
        //String str = new String();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == list.get(i)) {
                count++;
            }
        }
        return count;
    }

    public static String capSpace(String s) {
        String str = new String();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)) == false) {
                str += s.charAt(i);
            }
            else {
                str += " " + s.charAt(i);
            }
        }
        return str.toLowerCase();
    }

    public static String histogram(int[] arr, String s) {
        String str = new String();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                str += s;
            }
            str += "\n";
        }
        return str;
    }

    public static int littleBig(int n) {
        int n1 = 5;
        int n2 = 100;
        if (n == 2) return n2;
        if (n % 2 == 0) {
            for (int i = 1; i < n - n / 2; i++) {
                n2 *= 2;
            }
            return n2;
        }
        else return n1 + n / 2;
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0) {
                return false;
            }
          }
          return true;
    }

    public static int primorial(int n) {
        int mul = 1;
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 2; i < 10 * n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        for (int i = 0; i < n; i++) {
            mul *= list.get(i);
        }
        return mul;
    }

    public static boolean isBetween(String s1, String s2, String s3) {
        String str1 = s1 + s3 + s2;
        String str2 = new String();
        String[] arr = new String[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        Arrays.sort(arr);
        for (String i : arr) {
            str2 += i;
        }
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("__________№1__________");
        System.out.println(combinations(2, 3));
        System.out.println(combinations(3, 7, 4));
        System.out.println(combinations(2, 3, 4, 5));
        System.out.println("__________№2__________");
        System.out.println(numInStr(new String [] {"1a", "a", "2b", "b"}));
        System.out.println(numInStr(new String [] {"abc", "abc10"}));
        System.out.println(numInStr(new String [] {"abc", "ab10c", "a10bc", "bcd"}));
        System.out.println(numInStr(new String [] {"this is a test", "test1"}));
        System.out.println(numInStr(new String [] {"this is a test"}));
        System.out.println("__________№3__________");
        System.out.println(isTriplet(3, 4, 5));
        System.out.println(isTriplet(13, 5, 12));
        System.out.println(isTriplet(1, 2, 3));
        System.out.println(isTriplet(72, 54, 90));
        System.out.println(isTriplet(54, 46, 72));
        System.out.println(isTriplet(80, 48, 64));
        System.out.println("__________№4__________");
        System.out.println(duplicates("Hello World!"));
        System.out.println(duplicates("foobar"));
        System.out.println(duplicates("helicopter"));
        System.out.println(duplicates("birthday"));
        System.out.println(duplicates("Can you stay here?"));
        System.out.println("__________№5__________");
        System.out.println(capSpace("helloWorld"));
        System.out.println(capSpace("iLoveMyTeapot"));
        System.out.println(capSpace("stayIndoors"));
        System.out.println("__________№6__________");
        System.out.println(letter("HowAreYou"));
        System.out.println("__________№7__________");
        System.out.println(histogram(new int[] {1, 3, 4}, "#"));
        System.out.println(histogram(new int[] {1, 10}, "+"));
        System.out.println(histogram(new int[] {6, 2, 15, 3}, "="));
        System.out.println("__________№8__________");
        System.out.println(littleBig(4));
        System.out.println(littleBig(5));
        System.out.println(littleBig(28));
        System.out.println(littleBig(2));
        System.out.println(littleBig(1));
        System.out.println("__________№9__________");
        System.out.println(primorial(1));
        System.out.println(primorial(2));
        System.out.println(primorial(8));
        System.out.println("__________№10__________");
        System.out.println(isBetween("apple", "banana", "azure"));
        System.out.println(isBetween("monk", "monument", "monkey"));
        System.out.println(isBetween("bookend", "boolean", "boost"));
    }
    
}
