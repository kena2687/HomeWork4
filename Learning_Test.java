package Homework4;

public class Learning_Test {

    public static void main(String[] args) {
        System.out.println("Primary School");
        PrimarySchool p = new PrimarySchool();
        p.english();
        p.maths();
        p.science();

        System.out.println("Secondary School");
        SecondarySchool s = new SecondarySchool();
        s.english();
        s.maths();
        s.science();

        System.out.println("University");
        University u = new University();
        u.english();
        u.maths();
        u.science();
        u.history();


    }
}
