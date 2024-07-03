package org.scoula.todo;

import org.scoula.todo.command.DetailTodoCommand;
import org.scoula.todo.command.PrintTodoCommand;

import java.awt.*;

public class TodoApp extends App{
    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);

        menu.add(new MenuItem("목록", new PrintTodoCommand()));
        menu.add(new MenuItem("상세", new DetailTodoCommand()));
    }
}
