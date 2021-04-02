class CarBuilder implements Builder {

    private String startUpMessage="Start building";
    private String bodyType = "Ford";
    private int noOfWheels = 4;
    private int noOfHeadLights = 4;
    private String endOperationsMessage = "Product creation completed";
    Product product;

    @Override
    public Builder startUpOperations(String startUpMessage) {
        this.startUpMessage = startUpMessage;
        return this;
    }

    @Override
    public Builder buildBody(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public Builder insertWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
        return this;
    }

    @Override
    public Builder addHeadlights(int noOfHeadLights) {
        this.noOfHeadLights = noOfHeadLights;
        return this;
    }

    @Override
    public Builder endOperations(String endOperationsMessage) {
        this.endOperationsMessage = endOperationsMessage;
        return this;
    }

    @Override
    public Product constructCar() {
        product = new Product(this.startUpMessage, this.bodyType, this.noOfWheels, this.noOfHeadLights, this.endOperationsMessage);
        return product;
    }

    @Override
    public Product getConstructedCar() {
        return product;
    }
}
