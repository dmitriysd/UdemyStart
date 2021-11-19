package section08;

public class WeekDay {
    public static void main(String[] args){
        var day = 9;
        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        var result = day >= 1 && day <= 7 ? days[day -1] : "Invalid day" + day;

        System.out.println(result);
    }
}
