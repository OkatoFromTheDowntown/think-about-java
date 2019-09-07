package main.java.http.server;

import main.java.http.server.annotation.Validate;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;

public abstract class BaseService<T> {

    private boolean validator(T foo) {
        try {
            Class<?> clazz = foo.getClass();
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(Validate.class)) {
                    Validate annotation = field.getAnnotation(Validate.class);

                    if (Validate.Require.TRUE.equals(annotation.require())) {
                        String tar = (String) field.get(foo);
                        if (StringUtils.isEmpty(tar)) {
                            return false;
                        }
                    }

                    if (Validate.ValidateType.NUMBER.equals(annotation.type())) {
                        String tar = (String) field.get(foo);
                        if (!tar.matches("^\\d+$")) {
                            return false;
                        }
                    } else if (Validate.ValidateType.STRING.equals(annotation.type())) {
                        String tar = (String) field.get(foo);
                        if (!tar.matches("^\\D+$")) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return true;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        }
    }

    protected abstract void mainExecute(T foo);

    public void execute(T foo) {
        if (!validator(foo)) {
            System.err.println("[Validate check error] " + foo.toString());
        } else {
            mainExecute(foo);
        }
    }
}
