public class BackrestAssembler implements FactoryWorker{
    public void doWork(Chair chair){
        System.out.println("the backrest has been assembled on a "+chair.getType()+" chair");
    }
}
