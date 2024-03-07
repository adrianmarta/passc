
import java.util.*;
public class Pipeline {
    private List<FactoryWorker> workers=new ArrayList<FactoryWorker>();
    public Pipeline(FactoryWorker... worker)
    {
        for(FactoryWorker w:worker)
        {
            workers.add(w);
        }
    }
    public void assemble(Chair c)
    {
        for(FactoryWorker w:workers)
        {
            w.doWork(c);
        }
    }
}
