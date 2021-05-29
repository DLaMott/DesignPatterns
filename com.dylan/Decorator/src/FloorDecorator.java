public class FloorDecorator extends AbstractDecortator {
    @Override
    public void makeHouse() {
        super.makeHouse();
        addFloor();

    }
    private void addFloor(){
        System.out.println("Making a new floor");
    }
}
