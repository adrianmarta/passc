public class FactoryManager {
    public static void main(String[] args) {
        CutSeater C=new CutSeater();
        FeetAssembler F=new FeetAssembler();
        BackrestAssembler B =new BackrestAssembler();
        StabilizerBarAseembler S=new StabilizerBarAseembler();
        ChairPacker P=new ChairPacker();
        Pipeline p=new Pipeline(C,F,B,S,P);
        Chair chair=new Chair("basic");
        p.assemble(chair);

    }
}