package util;

/**
 * Created by dongye on 12/26/16.
 */
public class Client {

    public PersistenceContextType getPersistenceContextType() {
        return persistenceContextType;
    }

    private  PersistenceContextType persistenceContextType;

    public int getIsolation() {
        return isolation;
    }


    public void setIsolation(int isolation) {
        this.isolation = isolation;
    }

    int isolation;

    public void setPersistenceContextType(PersistenceContextType persistenceContextType){
        this.persistenceContextType = persistenceContextType;
    }

}
