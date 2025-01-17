package org.scoula.todo.command;

import org.scoula.todo.dao.TodoDao;
import org.scoula.todo.domain.Todo;

public class PrintTodoCommand implements Command{
    TodoDao dao = TodoDao.getInstance();

    @Override
    public void execute() {
        for (Todo todo: dao.getList()) {
            String line = "%2d] %s".formatted(todo.getId(), todo.getTitle());
            System.out.println(line);
        }
        System.out.println();
    }
}
