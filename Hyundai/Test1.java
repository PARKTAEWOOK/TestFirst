package Hyundai;

public class Test1 {
    public static void main(String[] args) {
        String[] s = {"Hyundai-Motor-Group", "Next-Generation-Vehicle"};
//
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        String[] slist = a.split("-");
        for (int i = 0; i < s.length; i++) {
            String[] slist = s[i].split("-");
            String answer = "";

            for (int j = 0; j < slist.length; j++) {
//                System.out.println(slist[j]);
                answer += slist[j].charAt(0);
            }

            System.out.println(answer);
        }
    }

}
