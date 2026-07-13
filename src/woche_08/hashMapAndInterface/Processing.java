package woche_08.hashMapAndInterface;

import java.lang.ProcessHandle.Info;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Processing {

    public static void main(String[] args) {

        //TODO
        HashMap<Operation, PackageConsumer> hashMap = new HashMap<>();
        hashMap.put(Operation.MULTIPLICATION, new MultiplicationConsumer());
        hashMap.put(Operation.MODULO, new ModuloConsumer());
        hashMap.put(Operation.POWER, new PowerConsumer());

        List<InformationPackage> information = new ArrayList<>();
        information.add(new InformationPackage(Operation.POWER, 10, 0));
        information.add(new InformationPackage(Operation.MULTIPLICATION, 5, 13));
        information.add(new InformationPackage(Operation.MODULO, 38, 7));
        information.add(new InformationPackage(Operation.POWER, 3, 5));
        information.add(new InformationPackage(Operation.MODULO, 42, 7));

        for (InformationPackage iPackage : information) {
            //TODO
            PackageConsumer consumer = hashMap.get(iPackage.getOperation());

            if (consumer != null) {
                int result = consumer.consume(iPackage);
                System.out.println(result);
            }
        }
    }
}

class MultiplicationConsumer implements PackageConsumer{
    //TODO
    public int consume(InformationPackage iPackage){
        return iPackage.getA() * iPackage.getB();
    }
}

class ModuloConsumer implements PackageConsumer{
    //TODO
    public int consume(InformationPackage iPackage){
        return iPackage.getA() % iPackage.getB();
    }
}

class PowerConsumer implements PackageConsumer{
    //TODO
    public int consume(InformationPackage iPackage){
        return (int) Math.pow(iPackage.getA(), iPackage.getB());
    }
}