class Driverclass {
    public static void main(String[] args) {
        Persistence p = new FilePersistence();
        p.persist();
        Persistence p2 = new DataPersistence();
        p2.persist();
    }
}



public abstract class Persistence {
    abstract void persist();
}


class FilePersistence extends Persistence{

    @Override
    void persist() {
        System.out.println("In FilePersistence");

    }
}

class DataPersistence extends Persistence{

    @Override
    void persist() {
        System.out.println("In DataPersistece");
    }
}
