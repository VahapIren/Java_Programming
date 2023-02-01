package tasks;


public class Task3_RegularNameSurname {
    /*
    write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHooL");

                output:
                    "Cydeo School"
     */
    public static void main(String[] args) {
        fullName("cYdEo", "SCHooL");

    }

    public static void fullName(String name, String surname) {
        String nameReg=(""+name.charAt(0)).toUpperCase()+name.substring(1).toLowerCase();
        String surnameReg=(""+surname.charAt(0)).toUpperCase()+surname.substring(1).toLowerCase();
        System.out.println(nameReg+" "+surnameReg);
    }
}
