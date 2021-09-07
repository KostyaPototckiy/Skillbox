import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    TreeSet<String> emailList = new TreeSet<>();
    String regex = "\\w+\\@\\w+\\.[ruRUcomCOM]+";

    public void add(String email) {
        // TODO: валидный формат email добавляется
        if (email.matches(regex)) {
            emailList.add(email.toLowerCase());
        }
        else System.out.println(Main.WRONG_EMAIL_ANSWER);
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        List<String> list = new ArrayList<>(new TreeSet<>(emailList));
        return list;
    }

    public void getPrint() {
        for (String emails : getSortedEmails()) {
            System.out.println(emails);
        }
    }
}
