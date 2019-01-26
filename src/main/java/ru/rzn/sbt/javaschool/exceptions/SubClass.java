package ru.rzn.sbt.javaschool.exceptions;

import ru.rzn.sbt.javaschool.exceptions.utils.SomeService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;

public class SubClass extends SuperClass {
    @Override
    public String callService(SomeService service) throws FileNotFoundException {
        String result = "";
        try {
            service.doSomething();
            result = "DONE";
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw new UncheckedIOException(e.getMessage(), e);
        }
        return result;
    }
}
