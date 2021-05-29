public class DecoratorPatternEX {
    public static void main(String[] args){
        System.out.println("No decorator used:");
        ConcreteComponent withoutDecorator = new ConcreteComponent();
        withoutDecorator.makeHouse();
        System.out.println("_________");
        System.out.println("Floor decorator used:");
        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setComponent(withoutDecorator);
        floorDecorator.makeHouse();
        System.out.println("___________");
        System.out.println("Paint decorator used:");
        PaintDecorator paintDecorator = new PaintDecorator();
        paintDecorator.setComponent(withoutDecorator);
        paintDecorator.makeHouse();
    }
}
