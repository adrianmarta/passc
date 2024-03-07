public class StabilizerBarAseembler implements FactoryWorker{
    @Override
    public void doWork(Chair chair) {
        System.out.println("the Stabilizer bar has been assembled on a "+chair.getType()+" chair");
    }
}
