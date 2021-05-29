import com.mirai.NetworkClassLoader;
import com.mirai.PrintClassLoader;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author mirau on 2021/5/25.
 * @version 1.0
 */
public class TestClassLoader {

    @Test
    public void customLoader() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        NetworkClassLoader customClassLoader = new NetworkClassLoader();
        Class<?> c = customClassLoader.loadClass(PrintClassLoader.class.getName());

        Object ob = c.newInstance();

        Method md = c.getMethod("printClassLoaders");
        md.invoke(ob);


    }
}
