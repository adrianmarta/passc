public class FeetAssembler implements FactoryWorker{
    public void doWork(Chair chair)
    {
        System.out.println("the feet has been assembled on a "+chair.getType()+" chair");
    }
}
