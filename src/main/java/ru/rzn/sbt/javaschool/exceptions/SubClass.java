package ru.rzn.sbt.javaschool.exceptions;

import ru.rzn.sbt.javaschool.exceptions.utils.SomeService;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
    @Override
    public String callService(SomeService service) throws FileNotFoundException {
        try {
            service.doSomething();
            return "DONE";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new FileNotFoundException(e.getMessage());
        }
        return "";
    }
}
