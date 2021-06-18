package yyds.thread.threaddbpool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

public class ConnectionDriver {
    static class ConnectionHandler implements InvocationHandler{

        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            if ("commit".equals(method.getName())){
                TimeUnit.MILLISECONDS.sleep(100l);
            }
            return null;
        }
    }
    public Connection createConnection(){
        return (Connection) Proxy.newProxyInstance(ConnectionDriver.class.getClassLoader(),new Class<?>[]{Connection.class},new ConnectionHandler());
    }
}
