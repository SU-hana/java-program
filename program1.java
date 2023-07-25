class program1{
    public static void main(String args[]){
        String name = "Suhana Shaju";//%s
        String state = "kerala";//%s
        int age = 23;//%d
        String college = "lmcst";//%s
        double gpa = 7.8; //%f
        char percentSign = '%';//%c
        boolean amITellingTheTruth = true;//%b
        //System.out.println("hello world! i am " + name + ". i am from " + state + " and i am " + age + " years old. i studys at " + college + ".");
        //other way to write by using format compiler
        String formattedString = String.format("hello world! i am %s.i am from %s. i am %d years old.i studys at %s. my gpa is %f. i have attended 100%C of my classes. These are all %b claims.", name, state, age, college, gpa, percentSign, amITellingTheTruth);
        System.out.println(formattedString);
        
    }
}