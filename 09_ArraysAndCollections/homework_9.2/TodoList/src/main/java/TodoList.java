import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
        System.out.println("Добавлено дело " + "'" + todo + "'");
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index >= todoList.size() || index < 0) {
            add(todo);
        }
        else {
            todoList.add(index, todo);
            System.out.println("На индекс " + index + " Добавлено дело " + "'" + todo + "'");
        }
    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index >= todoList.size() || index < 0) {
            System.out.println("Дело с таким номером не существует");
        }
        else {
            System.out.println("Дело " + "'" + todoList.set(index, todo) + "'" + " заменено на " + "'"
                    + todo + "'");
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index >= todoList.size() || index < 0) {
            System.out.println("Дело с таким номером не существует");
        }
        else
            System.out.println("Дело " + todoList.remove(index) + " удалено" );
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todoList;
    }
}