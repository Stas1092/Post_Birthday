public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        FormDate birthday = new FormDate();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        birthday.day = 23;
        birthday.month = 7;
        birthday.year = 1991;
    }
}