package org.scoula.todo.command;

import org.scoula.todo.dao.TodoDao;
import org.scoula.todo.domain.Todo;
import org.scoula.

public class AddTodoCommand implements Command{
    TodoDao dao = TodoDao.getInstance();

    @Override
    public void execute() {
        System.out.println("[새 Todo 추가]------------------------");
        String title=Input.getLine("제목: ");
        String description= Input.getLine("설명: ");
        System.out.println("-------------------------------------");

        Todo todo = Todo.builder()
                .title(title)
                .description(description)
                .done(false)
                .build();
        dao.add(todo);

        System.out.println();
    }
}
