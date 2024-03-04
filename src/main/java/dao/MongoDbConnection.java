package dao;

import org.springframework.stereotype.Component;

@Component
public class MongoDbConnection implements IDataBaseConnection{
    @Override
    public double getData() {
        System.out.println("Connection with mongoDb database ...");
        return 25.5;
    }
}
