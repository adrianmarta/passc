public class ChairPacker implements FactoryWorker{
    public void doWork(Chair chair){
        System.out.println("the chai has been assembled on a "+chair.getType()+" chair");
    }
}
