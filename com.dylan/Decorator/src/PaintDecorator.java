public class PaintDecorator extends AbstractDecortator {
    @Override
    public void makeHouse() {
        super.makeHouse();
        paintHouse();
    }
    private void paintHouse(){
        System.out.println("Adding paint");
    }
}
