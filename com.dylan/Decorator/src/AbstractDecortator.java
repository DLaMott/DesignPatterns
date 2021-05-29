abstract class AbstractDecortator extends Component {
    protected Component component;

    public void setComponent(Component c) {
        component = c;
    }

    @Override
    public void makeHouse() {
        if(component != null){
            component.makeHouse();
        }
    }
}
