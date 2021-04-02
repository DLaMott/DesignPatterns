class Ford extends BasicCar{

    public int basePrice = 100000;
    public Ford(String m){
        modelName = m;
    }

    // Each subclass must contain cloning process
    @Override
    public BasicCar clone() throws CloneNotSupportedException{

        // Return this.clone
        return (Ford)super.clone();
    }
}
