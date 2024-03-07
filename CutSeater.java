public class CutSeater implements FactoryWorker{
    public void doWork(Chair chair){
        System.out.println("the seat has been cut on a "+chair.getType()+" chair");
    }
}
