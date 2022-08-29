public class Main {
    public static void main(String[] args) {
//Exercise 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName+" "+middleName+" "+lastName;
        System.out.println("ФИО сотрудника - "+fullName);

        //Exercise 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+fullName.toUpperCase());

        //Exercise 3
        String fullName2 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - "+fullName2.replaceAll("ё", "е"));
    }
}